/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Manu
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero para calcular su cuadrado: ");
        a = sc.nextInt();
        System.out.println("El resultado del numero " + a + " al cuadrado es: " + a * a);

    }

}
