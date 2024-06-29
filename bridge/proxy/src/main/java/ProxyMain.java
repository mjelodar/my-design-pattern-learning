import java.io.FileNotFoundException;

public class ProxyMain {
    public static void main(String[] args) throws FileNotFoundException {
        DocumentReader reader = new FileLoader();
        DocumentReader readerProxy = new FileLoaderProxy(reader);
        Client client = new Client(readerProxy);
        client.read("harryPotter");
    }
}
