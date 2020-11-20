import java.util.Scanner;

import myutil.Utiles;


public class Ejer6 {
    public static void main(String[] args) {
        Utiles ut = new Utiles();
        int num1 = ut.pedirNumero("Primer Numero: ");
        int num2 = ut.pedirNumero("Segundo Numero: ");
        int potencia = potenciar(num1, num2);
        System.out.format("%d elevado a %d = %d", num1, num2, potencia);
    }
    
    public static int potenciar(int num1, int num2){
        int acumulador = 1;
        for (int i = 1; i<=num2; i++){
            acumulador *= num1;
        }
        return acumulador;
    }
    
    public static int multiplicar(int num1, int num2){
        int acumulador = 0;
        for (int i=0; i<=num2; i++){
            acumulador += num1;
        }
        return acumulador;
    }
}
