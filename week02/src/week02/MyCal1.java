package week02;
import java.util.*;
public class MyCal1 {
    public static void main(String[] args) {
        double salary;
        double tax;
        Scanner tube = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        salary = tube.nextDouble();
        if (salary > 50000){
            tax = salary * 0.1;
            System.out.println(tax);
        } else if (salary <= 50000) {
            tax = salary * 0.05;
            System.out.println(tax);
        }
    }
}