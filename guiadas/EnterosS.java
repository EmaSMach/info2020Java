import java.util.Scanner;
        
        
public class EnterosS {
    public static void main(String[] args){
        Scanner myscan = new Scanner(System.in);
        int continuar = 0; // No continuamos
        do {
            pedirMostrar();            
            System.out.print("Desea realizar la acción otra vez? (Ingrese 1 para continuar, u otro número en caso contrario): ");
            continuar = myscan.nextInt();
        } while (continuar == 1);
        myscan.close();
        
    }
    
    public static void pedirMostrar() {
        Scanner myscan = new Scanner(System.in);
        System.out.print("Primer número: ");
        int num1 = myscan.nextInt();
        System.out.print("Segundo número: ");
        int num2 = myscan.nextInt();
        System.out.print("Tercer número: ");
        int num3 = myscan.nextInt();

        System.out.println("El primer número ingresado es: " + num1);
        System.out.println("El segundo número ingresado es: " + num2);
        System.out.println("El tercer número ingresado es: " + num3);
        //myscan.close();
    }
}