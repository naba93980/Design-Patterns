package Inheritance;

abstract class Image {
    private Pixel pixels = new Pixel();
    public int Width
    {get, set};public Height
    {get, set};

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

    public abstract void save();

    public abstract void load();
}

class JpgImage extends Image {

    public JpgImage() {

    }

    public void save() {

    }

    public void load() {

    }
}

class PngImage extends Image {

    public PngImage() {

    }

    public void save() {

    }

    public void load() {

    }
}

class BmpImage extends Image {
    
    public BmpImage(){

    }
    public void save(){
        
    }

    public void load(){

    }
}


class ImageDraw extends Image 
{
    public ImageDraw() {

    }

    public void drawLine(int startX, int starty, int endX, int endY){

    } 

    public void drawPoint(int x, int y) {
        this.brush.drawPoint(x, y, this); 
    }

    // not needed but has to be implemented as Image is abstract class, we can put save() & load() in a abstract class , but that would require refactoring of JpegImage, BmpImage, .... classes, that classes that inherited from Image abstract class
    public override void save(){

    }

    public override void load() {

    }
}