// Clasificar el resultado de una evaluación
// Como dato de entrada tendremos un entero y como resultado un String de la 
// clasificación de la siguiente forma

//Rango    Clasificación
//93 - 100 Excelente
//85 - 92  Sobresaliente
//75 - 84  Distinguido
//60 - 74  Bueno
//00 - 59  Desaprobado
import java.util.Scanner;


public class Evaluator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nota: ");
        int nota = scan.nextInt();
        scan.close();
        System.out.println("Nota ingresada: " + nota);
        // check if the note is between 0 and 100
        if (nota >= 0 && nota <= 100) {
            if (nota >= 93) {
            System.out.print("Excelente!");
            } else if (nota > 85) {
                System.out.print("Sobresaliente");
            } else if (nota > 74) {
                System.out.print("Distinguido");
            } else if (nota > 59) {
                System.out.print("Aprobado");
            } else if (nota <= 58 && nota >= 0){
                System.out.print("Desaprobado");
            }
        } else {
            System.out.print("Nota fuera de rango");
        }
    }
}
