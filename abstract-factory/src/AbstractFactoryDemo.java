import java.util.ArrayList;
import java.util.List;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        Client client = new Client();

        Car tesla = new Car(1.4, "REGULAR");
        Car lamburgini = new Car(0.4, "REGULAR");
        Car ferrari = new Car(2.0, "SPORTS");
        Car porche = new Car(3.0, "LUXURY");
        List<Car> cars = new ArrayList<>();
        cars.add(tesla);
        cars.add(lamburgini);
        cars.add(ferrari);
        cars.add(porche);

        List<Car> economyCar = client.getEconomyFilter(cars);

        for (Car car: economyCar) {
            System.out.println(car.getCarType());
            System.out.println(car.getDisplacement());
            System.out.println("*************************");
        }
    }
}
