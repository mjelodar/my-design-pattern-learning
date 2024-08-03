import java.util.List;

public class Client {
    private CarAbstractFilter carAbstractFilter;

    public List<Car> getEconomyFilter(List<Car> cars){
        carAbstractFilter = new EconomyFilter();

        List<Car> economyCar = carAbstractFilter.filterDisplacemant(cars);
        return carAbstractFilter.filterTypes(economyCar);
    }
}
