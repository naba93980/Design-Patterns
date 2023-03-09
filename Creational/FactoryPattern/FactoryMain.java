import com.phone.OperatingSystemFactory;
import com.phone.OS;

public class FactoryMain {
    public static void main(String a[]) {
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstanceOs("Windows");
        obj.spec();
    }
}


// this class calls factory class OperatingSystemFactory class to create an instance of a particular OS 