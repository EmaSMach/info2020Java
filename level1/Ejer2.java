
import java.util.Scanner;


public class Ejer2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Primer número: ");
        int num1 = scan.nextInt();
        System.out.println("Segundo número: ");
        int num2 = scan.nextInt();
        mostrarOperaciones(num1, num2);
    }
    
    public static void mostrarOperaciones(int num1, int num2){
        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
        System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
        System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
        System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
    }
}
