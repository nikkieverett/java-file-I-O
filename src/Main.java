import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        NewClass myClass = new NewClass("Hello world! I'm using the file system!");
        myClass.writeToFile("myClassFile");

    }

}
