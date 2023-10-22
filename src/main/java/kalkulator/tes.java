/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulator;

import java.util.Scanner;

/**
 *
 * @author sakab
 */
public class tes {
    
    public static void main(String[] args) {
        Scanner kalkulator = new Scanner(System.in);
        
        
        System.out.print("Masukkan  bil 1: ");
        double a = kalkulator.nextDouble();
        
        System.out.print("Pilih operator (+, -, *, /) : ");
        char operator = kalkulator.next().charAt(0);
        
        System.out.print("Masukkan bil 2: ");
        double b = kalkulator.nextDouble();
        
        double hasil = 0;
        
        switch (operator) {
            case '+':
                hasil = a+b;
               break;
            case '-':
                hasil = a - b;
                break;
            case '*':
                hasil = a*b;
                break;
            case '/':
                if (b != 0) {
                    hasil = a / b;
                }else {
                    System.out.println("Pembagian dg nol tidak diizinkan");
                    System.exit(1);
                }
                break;
            default:
                System.out.println("Operasi tidak valid");
                System.exit(1);
        }
        System.out.print("Hasil : " + hasil);
    }
}
