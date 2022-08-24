
import java.util.*;
public class score16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner ad = new Scanner(System.in);
        Scanner fe = new Scanner(System.in);
        int x, y, z;
        double avg;
        x = sc.nextInt();
        y = ad.nextInt();
        z = fe.nextInt();
        avg = (x + y + z)/3;
        System.out.println(avg);
    }
}
