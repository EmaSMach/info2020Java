package myutil;

public class Persona {
            public String nombre;
            public String apellido;
            public int edad;
            public String direccion;
            public String ciudad;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public void mostrarDesc(){
        System.out.format("%s - %s - %d - %s %s", 
                this.getCiudad(),
                this.getDireccion(),
                this.getEdad(),
                this.getNombre(),
                this.getApellido());
    }
}
