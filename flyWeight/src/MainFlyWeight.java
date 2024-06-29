public class MainFlyWeight {
    public static void main(String[] args) {
        Gardener gardener = new Gardener();
        gardener.createForrest("red", "solid", 10, 15, 43);
        gardener.createForrest("red", "solid", 23, 12, 35);
        gardener.createForrest("yellow", "dotted", 23, 12, 35);
    }
}
