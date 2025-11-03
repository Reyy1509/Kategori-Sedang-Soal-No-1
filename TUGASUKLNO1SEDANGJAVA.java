/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasuklno1sedang.java;
import java.util.Scanner;

/**
 *
 * @author LOQ
 */
public class TUGASUKLNO1SEDANGJAVA {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
      System.out.print("Masukkan bilangan bulat positif: ");
        int n = input.nextInt();
         if (n < 0) {
            System.out.println("Maaf, bilangan harus positif!");
        } else {
            long faktorial = 1;
            for (int i = 1; i <= n; i++) {
                faktorial *= i;
            }

            System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
        }
    }
}
