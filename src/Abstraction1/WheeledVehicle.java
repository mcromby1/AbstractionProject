package Abstraction1;

 /**
 *
 * @author Matthew
 */
abstract class WheeledVehicle extends Vehicle {

    private String name;
    private String manufacture;
    private int wheelNumber;
    private int speed = 0;

    public WheeledVehicle(String name, String manufacture, int wheelNumber) {
        super(name, manufacture);
        this.wheelNumber = wheelNumber;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }
    
    public void accelerate(int s){
        speed += s;
    }
    
    public void slowDown(int b){
        if(b < 0){
         speed += b;   
        }
        else if (b > 0){
            speed -= b;
        }
    }
}
