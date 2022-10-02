
public class Dog extends Animal{
    public Dog(String name, int age){
        super(name, 200, age);
    }
    public void kick(Animal a){
        a.setPower(-10);
    }
    public void eat(Food f){
        this.setPower(f.getPower());
    }
}
