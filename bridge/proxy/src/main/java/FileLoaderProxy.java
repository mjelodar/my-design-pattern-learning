import java.io.File;
import java.io.FileNotFoundException;

public class FileLoaderProxy implements DocumentReader{
    FileLoader fileLoader;

    public FileLoaderProxy(DocumentReader fileLoader) {
        this.fileLoader = (FileLoader) fileLoader;
    }

    @Override
    public File getFile(String name) throws FileNotFoundException {
        if (name.equals("admin"))
            fileLoader.getFile(name);
        System.out.println("you are not permitted to access this file.");
        return null;
    }
}
