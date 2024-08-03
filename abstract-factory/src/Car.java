public class Car {
    private double displacement;
    private String carType;

    public Car(double displacement, String carType) {
        this.displacement = displacement;
        this.carType = carType;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}
