/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
import java.util.Scanner;


public class Weeker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Día: ");
        int day = scan.nextInt();
        if (day == 1) {
            System.out.println("Lunes");
        } else if (day == 2){
            System.out.println("Martes");
        } else if (day == 3) {
            System.out.println("Miércoles");
        } else if (day == 4) {
           System.out.println("Jueves");
        } else if (day == 5) {
            System.out.println("Viernes");
        } else if (day == 6) {
            System.out.println("Sábado");
        } else if (day == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("No existe ese día");
        }
    }
}
