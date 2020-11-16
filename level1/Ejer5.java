import java.util.Scanner;


public class Ejer5 {
    public static void main(String[] args){
        int n1 = pedirNumero("Primer Número: ");
        int n2 = pedirNumero("Segundo Número: ");
        System.out.println("Resultado: " + multiplicarSumando(n1, n2));
    }
    
    public static int pedirNumero(String mensaje){
        Scanner scan = new Scanner(System.in);
        System.out.print(mensaje);
        int num = scan.nextInt();
        //scan.close();
        return num;
    }

    public static int multiplicarSumando(int num1, int num2){
        int acumulador = 0;
        for (int i=1; i<=num1; i++){
            acumulador += num2;
        }
        return acumulador;
    }
}
