package Composition;

interface ImageFile {
    public void save();
    public void load();
}

class Image {
    private Pixel pixels = new Pixel();
    public int Width {get, set};
    public Height {get, set};

    public Image();

    public Image(int width, int height) {
        this.setSize();
    };

    public Pixel pixelAt(){
        return pixels[y,x];
    }

    public void replacePixels(Pixel pixels){
        this.pixels=pixels
    }

    public void resize(int width){
        this.Width=width
    }

    public void flipHorizontally() {

    }

    public void flipVertically() {

    }
}

class JpgImage extends ImageFile {

    public JpgImage() {

    }

    public void save(Image image) {

    }

    public void load(Image image) {

    }
}

class PngImage extends ImageFile {

    public PngImage() {

    }

    public void save(Image image) {

    }

    public void load(Image image) {

    }
}

class BmpImage extends ImageFile {

    public BmpImage() {

    }

    public void save(Image image) {

    }

    public void load(Image image) {

    }
}

class ImageDraw
{
    private Image image;
    public ImageDraw(Image image){
        this.image=image;
    }
    public void drawLine(){

    }
    public void drawPoint(){

    }
}

class ImageApp
{
    Image image = new Image();
    ImageFile file;

    ImageApp(ImageFile file){
        this.file=file;
        this.file.load(image);
    }

    void saveClicked(){
        file.save(image);
    }

    void flipClicked(bool horizontal){
        if(horizontal){
            image.flipHorizontally();
        }
        else{
            image.flipVertically();
        }
    }
}

Image image = new Image();

JpgImage jpeg = new JpgImage();
jpeg.load(image);

ImageDraw draw = new ImageDraw(image);
draw.drawLine();
draw.drawPoint();

jpeg.save(image);

ImageApp ia=new ImageApp(jpeg)