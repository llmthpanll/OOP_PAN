package Ptoey;

public class Main {

    public static void main(String[] args) {
        Billionaire b = new Billionaire("Josh", 10000);
        Thief t = new Thief("XXX", 0);
        b.benefit(100);
        b.showMoney();
        t.showMoney();

        t.steal(50000, b);
        b.showMoney();
        t.showMoney();
    }
}
