import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        
        Path path = Paths.get("gorilla.txt");
        List<String> data = new ArrayList();
        try  (BufferedWriter writer = Files.newBufferedWriter(path, Charset.forName("UTF-16"))) {
            writer.write("Hello World");
        }
        catch (IOException e) {
        
        }
        
    }
}
