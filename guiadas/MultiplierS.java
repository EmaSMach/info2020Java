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


public class MultiplierS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean continuar = false;
        do {
            System.out.print("Número: ");
            int number = scan.nextInt();
            showMultTable(number);
            boolean res = askYesNo("Desea continuar?");
            if (res == true){
                continuar = true;
            }  else {
                continuar = false;
            }
        } while (continuar == true);
        scan.close();
    }

    public static void showMultTable(int number){
        for (int i=1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number*i);
        }
    } 

    public static boolean askYesNo(String mensaje) {
        Scanner scan = new Scanner(System.in);
        System.out.println(mensaje);
        System.out.print("Ingrese 1 para 'sí', u otro número en caso contrario: ");
        int answer = scan.nextInt();
        if (answer == 1){
            return true;
        } else {
            return false;
        }
    }
}
