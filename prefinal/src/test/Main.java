/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Main {
 
    public static void main(String[] args) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(dimension.getWidth());
        System.out.println(dimension.getHeight());
    }
}
