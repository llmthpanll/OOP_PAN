package lab1;




public class Potion extends Item {

    @Override
    public void use(Player P) {
        P.setHP(10);
    }
}
