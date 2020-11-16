
import java.util.Scanner;


public class Ejer4 {
    public static void main(String[] args){
        int num = pedirNumero();
        if (num < 0){
            throw new IllegalArgumentException("No se aceptan números negativos");
        }
        System.out.println(factorial(num));
    }
    
    public static int pedirNumero(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = scan.nextInt();
        scan.close();
        return num;
    }
    
    public static int factorial(int n){
        if (n == 1){
            return n;
        } else if (n == 0){
            return 1;
        } else {
            return n*factorial(n - 1);
        }
    }
}
