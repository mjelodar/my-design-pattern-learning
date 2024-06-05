public class Db {

    private static Db instance;
    private String connection;

    private Db() {
        this.connection = "I'm a singleton object.";
    }

    public static Db getInstance() {
        if (instance == null) {
            System.out.println("creating a database connection");
            instance = new Db();
            return instance;
        }
        System.out.println("a database connection is created before");
        return instance;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }
}
