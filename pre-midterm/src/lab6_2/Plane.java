package lab6_2;


public class Plane extends Vehicle implements Flyable {

    private String airline;
    private String boeing;
    private static int MAX_FLYER = 2;

    public Plane() {
        this(0.0, "", "");
    }

    public Plane(double fuel, String airline, String boeing) {
        super(fuel);
        this.airline = airline;
        this.boeing = boeing;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getBoeing() {
        return boeing;
    }

    public void setBoeing(String boeing) {
        this.boeing = boeing;
    }

    public void startEngine() {
        if (this.getFuel() >= 20) {
            this.setFuel(-20);
            System.out.println("Plane’s Engine starts");
        } else if (this.getFuel() < 20) {
            System.out.println("Fuel is not enough.");
        }
    }

    public void stopEngine() {
        System.out.println("Plane’s Engine stops");
    }

    public void honk() {
        System.out.println("Weeeeeee");
    }

    public void fly() {
        if (this.getFuel() >= 20) {
            this.setFuel(-20);
            System.out.println("Plane Fly");
        } else if (this.getFuel() < 20) {
            System.out.println("Fuel is nearly empty.");
        }
    }

    public void takeOff() {
        if (this.getFuel() >= 10) {
            this.setFuel(-10);
            System.out.println("Plane Already to Take Off");
        } else if (this.getFuel() < 10) {
            System.out.println("Fuel is nearly empty.");
        }
    }
    public void landing(){
        if (this.getFuel() >= 10) {
            this.setFuel(-10);
            System.out.println("Plane Already to Landing");
        } else if (this.getFuel() < 10) {
            System.out.println("Fuel is nearly empty.");
        }
    }
}
