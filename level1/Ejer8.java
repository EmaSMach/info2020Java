import myutil.Persona;
import myutil.Utiles;
        

public class Ejer8 {
    public static void main(String[] args) {
        Persona p = new Persona();
        Utiles ut = new Utiles();

        p.nombre = ut.pedirTexto("Nombre: ");
        p.apellido = ut.pedirTexto("Apellido: ");
        p.edad = ut.pedirNumero("Edad: ");
        p.direccion = ut.pedirTexto("Direccion: ");
        p.ciudad = ut.pedirTexto("Ciudad: ");
        p.mostrarDesc();
        //System.out.println(p.mostrarDesc());
    }
}
