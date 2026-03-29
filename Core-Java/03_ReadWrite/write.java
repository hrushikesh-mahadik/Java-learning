import java.io.FileWriter;
import java.io.IOException;
public class write {
    
public static void main(String[] args) {
    

    try(FileWriter writes = new FileWriter("text.file");){
            writes.write("JAY SHREE RAM...!");
            System.out.println("File has be Written ");
    }
    catch(IOException e){
System.out.println("Some problem to crate file");
    }
}
}
