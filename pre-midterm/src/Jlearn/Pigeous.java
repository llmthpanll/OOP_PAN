package Jlearn;


public class Pigeous extends Bird {

    public Pigeous() {
        super("", 0);
    }

    public Pigeous(String name, int age) {
        super(name, age);
    }

    public void wingAttack(Animal a) {
        a.setPower(-5);
    }

    public void wingAttack(Animal a, int times) {
        for (int i = 1; i <= times; i++) {
            a.setPower(-5);
        }
    }

    public void eat(Food f) {
        this.setPower(f.getPower() * 2);
    }

    public void fly() {
        System.out.println(this.getName() + " fly fly ....");
    }
}
