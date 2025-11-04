/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanukl;

/**
 *
 * @author ADVAN
 */
import java.util.Scanner;
public class LatihanUKL {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan jarak");
        int jarak = input.nextInt();
        System.out.println("Masukkan berat");
        int berat = input.nextInt();
        
        int hargaPerKG=0;
        
        if (jarak <= 10){
            hargaPerKG = jarak*4260;
        } else {
            hargaPerKG = jarak*6000;
        }
         int harga = berat *hargaPerKG;
         System.out.println("Hasilnya"+harga);
    }
} 
