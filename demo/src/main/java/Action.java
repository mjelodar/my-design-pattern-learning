public class Action {
    public static void main(String[] args) {
        System.out.println("say hiiii");

        Client client = new Client();
        int n = 2;
        System.out.println("give me " + n + "th working day " + client.getWorkingDay(n));


        n = 3;
        System.out.println("give me " + n + "th working day " + client.getWorkingDay(n));

        n = 1;
        System.out.println("give me " + n + "th working day " + client.getWorkingDay(n));
    }
}
