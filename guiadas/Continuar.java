/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
import java.util.Scanner;


public class Continuar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        while (continuar == 1) {
            System.out.print("Ingrese un número: ");
            int number = scan.nextInt();
            System.out.println();
            System.out.print("El número ingresado es: " + number);
            System.out.println();
            System.out.print("Desea continuar? Ingrese 1 para 'sí' o 2 para 'no': ");
            continuar = scan.nextInt();
        }
        scan.close();
    }
}
