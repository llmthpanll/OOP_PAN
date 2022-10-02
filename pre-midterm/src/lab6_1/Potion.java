package lab6_1;


public class Potion extends Item {

    public void use(Player p) {
        p.setHP(10);
    }
}
