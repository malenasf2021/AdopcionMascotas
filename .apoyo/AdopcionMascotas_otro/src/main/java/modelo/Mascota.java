
package modelo;


public class Mascota {

    private String nombre;
    private String tipo;
    private int edad;

    private Voluntario unVoluntario; //una mascota puede tener un solo voluntario
    private Adopcion unaAdopcion;//una mascota puede ser adoptada una sola vez

    
    //nombre de la mascota
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //especie de la mascota
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //edad de la mascota
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    
    public Voluntario getUnVoluntario() {
        return unVoluntario;
    }

    public void setUnVoluntario(Voluntario unVoluntario) {
        this.unVoluntario = unVoluntario;
    }

    public Adopcion getUnaAdopcion() {
        return unaAdopcion;
    }

    public void setUnaAdopcion(Adopcion unaAdopcion) {
        this.unaAdopcion = unaAdopcion;
    }

    public Mascota() {

    }
}
