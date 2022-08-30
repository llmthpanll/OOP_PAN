public class Plane extends Vehicle{
    public void showPlaneInfo(){
        System.out.println("Plane detail is, Fuel is "+this.getFuel()+" litre and Top Speed is "+this.gotTopSpeed()+" m/s.");
    }
    public void setPlaneInfo(int s, String t){
        this.setFeul(s);
        this.setTopSpeed(t);
    }
    public void fly(){
        if (this.getFuel() >= 200){
            System.out.println("Fly.");
            this.setFeul(-200);
        }else{
            System.out.println("Please add fuel.");
        }
    }
}