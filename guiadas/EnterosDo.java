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
        
        
public class EnterosDo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int continuar = 0; // No continuamos
        do {
            System.out.print("Primer número: ");
            int num1 = scan.nextInt();
            System.out.print("Segundo número: ");
            int num2 = scan.nextInt();
            System.out.print("Tercer número: ");
            int num3 = scan.nextInt();

            System.out.println("El primer número ingresado es: " + num1);
            System.out.println("El segundo número ingresado es: " + num2);
            System.out.println("El tercer número ingresado es: " + num3);
            
            System.out.print("Desea realizar la acción otra vez? (Ingrese 1 para continuar, u otro número en caso contrario): ");
            continuar = scan.nextInt();
        } while (continuar == 1);
        scan.close();
    }
}
