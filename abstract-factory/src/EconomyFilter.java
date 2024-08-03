import java.util.ArrayList;
import java.util.List;

public class EconomyFilter extends CarAbstractFilter{
    @Override
    public List<Car> filterDisplacemant(List<Car> cars) {
        List<Car> economyFilter = new ArrayList<>();
        OrdinaryDisplacement ordinaryDisplacement = new OrdinaryDisplacement();
        for (Car car:cars) {
            if (car.getDisplacement() < ordinaryDisplacement.capacity){
                economyFilter.add(car);
            }
        }
        return economyFilter;
    }

    @Override
    public List<Car> filterTypes(List<Car> cars) {
        List<Car> carList = new ArrayList<>();
        EconomyCar economyCar = new EconomyCar();

        for (Car car: cars) {
            if (car.getCarType().equals(economyCar.carTypes.toString())){
                carList.add(car);
            }
        }
        return carList;
    }
}
