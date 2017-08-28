import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NewClass {
    String output;

    public NewClass(String output){
        this.output = output;
    }
    public void writeToFile(String filename){
        try{
            File file = new File(filename + ".txt");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(this.output);
            fileWriter.close();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }

}
