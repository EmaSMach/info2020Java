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

public class WeekerDo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        do {
            System.out.print("Día: ");
            int day = scan.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miércoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Fuera de rango");
            }
        System.out.println("Desea continuar?");
        System.out.print("Ingtrese 1 para continuar, otro número en caso contrario: ");
        continuar = scan.nextInt();
        } while (continuar == 1);
    }
}
