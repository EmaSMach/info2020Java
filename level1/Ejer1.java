import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args){
        String nombre;
        nombre = pedirNombre();
        saludar(nombre);
    }

    public static void saludar(String nombre){
        System.out.print("HOLA " + nombre.toUpperCase());
    }

    public static String pedirNombre(){
        String nombre;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre = scan.next();
        return nombre;
    }
}
