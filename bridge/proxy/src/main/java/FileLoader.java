import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileLoader implements DocumentReader{
    @Override
    public File getFile(String name) throws FileNotFoundException {
        File file = new File(name);

        BufferedReader br
                = new BufferedReader(new FileReader(file));

        return file;
    }
}
