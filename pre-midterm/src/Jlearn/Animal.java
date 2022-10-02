package Jlearn;


public abstract class Animal {

    private String name;
    private int power;
    private int age;

    public Animal() {
        this.name = "";
        this.power = 0;
        this.age = 0;
    }

    public Animal(String name, int power, int age) {
        this.name = name;
        this.power = power;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPower(int power) {
        this.power += power;
    }

    public int getPower() {
        return this.power;
    }

    public void setAge(int age) {
        this.age += age;
    }

    public int getAge() {
        return this.age;
    }

    public boolean equals(Animal a) {
        return (a.name.equals(this.name) && (a.age == this.age));
    }

    public String toString() {
        return "Animal : name = " + this.name + ", power = " + this.power + ", age = " + this.age;
    }

    public abstract void eat(Food f);
}
