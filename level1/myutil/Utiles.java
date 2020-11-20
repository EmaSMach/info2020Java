package myutil;
import java.util.Scanner;

public class Utiles {
    public static int pedirNumero(String mensaje){
        System.out.print(mensaje);
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        return num;
    }
    
    public static String pedirTexto(String mensaje){
        System.out.print(mensaje);
        Scanner scan = new Scanner(System.in);
        String texto = scan.next();
        return texto;
    }
}
