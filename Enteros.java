import java.util.Scanner;

public class Enteros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Primero n�mero: ");
        int num1 = scan.nextInt();
        System.out.print("Segundo n�mero: ");
        int num2 = scan.nextInt();
        System.out.print("Tercer n�mero: ");
        int num3 = scan.nextInt();

        System.out.println("El primer n�mero ingresado es: " + num1);
        System.out.println("El segundo n�mero ingresado es: " + num2);
        System.out.println("El tercer n�mero ingresado es: " + num3);
        scan.close();
    }
}
