import java.util.Scanner;


public class Ejer3 {
    public static void main(String[] args){
        int num1 = pedirNumero();
        piramide(num1);
    }
    
    public static int pedirNumero(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = scan.nextInt();
        scan.close();
        return num;
    }
    
    public static void piramide(int num){
        for (int n=1; n<=num; n++){
            linea(n);
            System.out.println("");
        }
    }
    
    public static void linea(int num){
        for (int n=1; n<=num; n++){
            System.out.print(n + " ");
        }
    }
}
