/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanuklb;

/**
 *
 * @author ADVAN
 */
import java.util.Scanner;
public class LatihanUKLb {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       int bilangan;
       System.out.println("Masukkan bilangan : ");
       bilangan = input.nextInt();
       
       if (bilangan % 2 == 0){
           System.out.println("Bilangan Genap");
           System.out.println("Bilangan ini bisa dibagi 2");
       } else {
           System.out.println("Bilangan Ganjil");
           System.out.println("Bilangan ini tidak bisa dibagi"+"dibagi2");
           System.out.println("Karena hasil baginya adalah 1");
       }
    }
}
