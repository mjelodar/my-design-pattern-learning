public class Action {
    public static void main(String[] args) {
        Db dbInstance = Db.getInstance();
        System.out.println(dbInstance.getConnection());


        Db dbInstance2 = Db.getInstance();
        System.out.println(dbInstance2.getConnection());
    }
}
