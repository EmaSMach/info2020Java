import java.util.Scanner;

public class Enteros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Primer n�mero: ");
        int num1 = scan.nextInt();
        System.out.print("Segundo n�mero: ");
        int num2 = scan.nextInt();
        System.out.print("Tercer n�mero: ");
        int num3 = scan.nextInt();

        System.out.println("El primer número ingresado es: " + num1);
        System.out.println("El segundo número ingresado es: " + num2);
        System.out.println("El tercer número ingresado es: " + num3);
        scan.close();
    }
}
