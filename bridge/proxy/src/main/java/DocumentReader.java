import java.io.File;
import java.io.FileNotFoundException;

public interface DocumentReader {
    File getFile(String name) throws FileNotFoundException;
}
