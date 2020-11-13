package guiadas;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class MyUtil {
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
