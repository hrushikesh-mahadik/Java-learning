import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class read{
    public static void main(String[] args) {
        
        String filepath = "C:\\Users\\hrushikesh\\OneDrive\\Desktop\\JAVA\\Core-Java\\03_ReadWrite\\text.file";
       try( BufferedReader reader =  new BufferedReader(new FileReader(filepath))){
            System.out.println("file is present");

            String line;
            while((line = reader.readLine())!= null){
                System.out.println(line);
            }
       }
       catch(FileNotFoundException e){
            System.out.println("file could not be Founded");
       }
       catch(IOException e){
        System.out.println("something wrong");
       }
    }
}