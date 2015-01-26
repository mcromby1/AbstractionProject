package Abstraction1;

/**
 *
 * @author Matthew
 */
public class Car extends WheeledVehicle {

    private String carModel;
    private double price;
    
    //public Car(){}

    public Car(String name, String manufacture, int wheelNumber, String carModel, int price) {
        super(name, manufacture, wheelNumber);
        this.carModel = carModel;
        this.price = price;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
