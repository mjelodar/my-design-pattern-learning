import java.io.File;
import java.io.FileNotFoundException;

public class Client {
    DocumentReader documentReader;

    public Client(DocumentReader documentReader) {
        this.documentReader = documentReader;
    }

    public void read(String name) throws FileNotFoundException {
        if (documentReader.getFile(name) != null){
            System.out.println("I'm reading");
        }
    }
}
