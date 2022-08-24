/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
public class ClassMyAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClassMyAdd cm = new ClassMyAdd();
        System.out.println("Please insert number : ");
        int x = sc.nextInt();
        int num = cm.AddTwo(x);
        System.out.println("The result#1 is "+num);
        num = cm.AddTwo(x+5);
        System.out.println("The result#2 is "+num);
        num = cm.AddTwo(x*3+2);
        System.out.println("The result#3 is "+num);
    } //end main
    public int AddTwo ( int a ){
        int result = a + 2;
        return result;
    } // end AddTwo
}//end class 