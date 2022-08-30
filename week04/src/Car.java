public class Car extends Vehicle{
    private String typeEngine;
    public void setTypeEngine(String t) {
        typeEngine = t;
    }
    public String getTypeEngine(){
        return typeEngine;
    }
    public void showCarInfo(){
       System.out.println("Car engine is "+typeEngine+".");
       System.out.println("Fuel is "+this.getFuel()+" litre and Top Speed is "+ this.getTopSpeed()+" m/s.");
    }
    public void setCarInfo(int s, String t, String y){
        super.setFuel(s);
        super.setTopSpeed(t);
        this.typeEngine = y;
    }
    public void move() {
        if (this.getFuel() < 50){
            System.out.println("Please add fuel.");
        } else{
            this.setFuel(-50);
            System.out.println("Move.");
        }
    }
}
