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

public class MultiplierDo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        do {
            System.out.print("Número: ");
            int number = scan.nextInt();
            for (int i=1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + number*i);
            }
            System.out.print("Desea continuar?");
            System.out.print("Ingrese 1 para continuar, otro número en caso contrario: ");
            continuar = scan.nextInt();
        } while (continuar == 1);
        scan.close();
        
    }
}
