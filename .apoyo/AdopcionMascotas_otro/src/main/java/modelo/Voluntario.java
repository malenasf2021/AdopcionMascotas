
package modelo;

import java.util.List;


public class Voluntario {
    private String cedula;
    private String nombre;
    private String contacto;
    
    private List<Mascota> unMascota; //un voluntario puede estar a cargo de varias mascotas

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public List<Mascota> getUnMascota() {
        return unMascota;
    }

    public void setUnMascota(List<Mascota> unMascota) {
        this.unMascota = unMascota;
    }
    
    
}
