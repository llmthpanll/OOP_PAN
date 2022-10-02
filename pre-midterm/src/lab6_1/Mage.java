package lab6_1;


public class Mage extends Player {

    public Mage() {
        this.setHP(10);
        this.setMP(20);
        this.setATK(5);
    }

    public void addEquipment(Item i) {
        i.use(this);
    }

    public void attack(Player p) {
        p.attacked(2.5 * this.getATK());
        this.setMP(-5);
    }

    public void attacked(double n) {
        this.setHP(-n);
    }
}
