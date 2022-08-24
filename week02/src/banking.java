
import java.util.*;
public class banking {
    public static void main(String[] args) {
        double money;
        char bank;
        double total;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money : ");
        money = sc.nextDouble();
        System.out.print("Input your account type (Please type A B C or X in uppercase) : ");
        bank = sc.next().charAt(0);
        switch (bank) {
            case 'A': total = money * 1.015;
                    break;
            case 'B': total = money * 1.02;
                    break;
            case 'C': total = money * 1.015;
                    break;
            default: total = money * 1.05;
                    break;
        }
        System.out.println(total);
    }
}
