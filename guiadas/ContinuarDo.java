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


public class ContinuarDo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        int numero;
        do {
            System.out.print("Número: ");
            numero = scan.nextInt();
            System.out.println("El número ingresado es: " + numero);
            System.out.println();
            System.out.print("Desea continuar? (ingrese 1 para 'sí'): ");
            continuar = scan.nextInt();
        } while (continuar == 1);
        scan.close();
    }
}
