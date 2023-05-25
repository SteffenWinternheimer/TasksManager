import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class FileManager{

    public void loadFile(String path) throws IOException{
        Reader r = new FileReader(path);
        BufferedReader br = new BufferedReader(r);
        
    }

    public void saveFile(String path, String input){
        try{
            Writer w = new PrintWriter(new File(path));
            w.write(input);
            w.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
