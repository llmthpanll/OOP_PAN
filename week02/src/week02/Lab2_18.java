/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week02;
import java.util.*;
public class Lab2_18 {
    public static void main(String[] args) {
        int high;
        Scanner input = new Scanner(System.in);
        System.out.print("กรุณาระบุความสูงตึก: ");
        high = input.nextInt();
        for(int x = 1;x<=high;x++){
            System.out.println("#-#-#-#-#");
        }
    }
}
