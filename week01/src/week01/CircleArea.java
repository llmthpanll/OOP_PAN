package week01;

import java.util.*;
public class CircleArea {
    public static void main(String[] args) {
        double radius, area;
        Scanner input = new Scanner(System.in);
        radius = input.nextDouble();
        area = Math.PI * radius * radius;
        System.out.println(area);
    }
}
