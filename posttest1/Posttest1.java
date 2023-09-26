/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.posttest1;
import com.posttest1.Vga;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Posttest1 {

    public static void main(String[] args) {
        ArrayList<Vga> vgaList = new ArrayList();
        Vga vga1 = new Vga("Geforce RTX 4090", 2.52 , 2.23);
        Vga vga2 = new Vga("Geforce RTX 4080", 2.51, 2.21);
        Vga vga3 = new Vga("Geforce RTX 4070 Ti", 2.61, 2.31);
        Vga vga4 = new Vga("Geforce RTX 4070", 2.48, 1.92);
        Vga vga5 = new Vga("Geforce RTX 4060 Ti", 2.54, 2.31);
        Vga vga6 = new Vga("Geforce RTX 4060", 2.46, 1.83);

        vgaList.add(vga1);
        vgaList.add(vga2);
        vgaList.add(vga3);
        vgaList.add(vga4);
        vgaList.add(vga5);
        vgaList.add(vga6);
        System.out.println("Nvidia Geforce 40 Series Comparison");
        
        
        for (Vga showvga : vgaList) {
            System.out.println("");
            System.out.println("Name: " + showvga.Name);
            System.out.println("Base Clock: " + showvga.baseClock);
            System.out.println("Boost Clock: " + showvga.clockInGhz);
//            System.out.println("")
//            System.out.println("")
//            System.out.println("")

        }
        }
        
}
