package Practice;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Practice1 {

    public static Properties throwMethod(String fileLocation) throws IOException {
        FileInputStream fis = new FileInputStream(fileLocation);
        var properties = new Properties();
        properties.load(fis);
        return properties;
    }
    public static void main(String[]args){
        try{
            throwMethod("C:\\Users\\kenny\\OneDrive\\Desktop\\test.txt");
        } catch(IOException fnfe) {
            System.out.println(fnfe);
        }
    }
}