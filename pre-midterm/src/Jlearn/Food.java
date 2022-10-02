package Jlearn;


public abstract class Food {

    protected String name;

    public Food() {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract int getPower();
}
