
package modelo;

import java.util.Date;


public class Adopcion {
    private Date fecha;
    private String estado;
    
    private Mascota unaMascota;// una adopción por mascota
    private Adoptante unAdoptante;//un adoptante por mascota

    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Mascota getUnaMascota() {
        return unaMascota;
    }

    public void setUnaMascota(Mascota unaMascota) {
        this.unaMascota = unaMascota;
    }

    public Adoptante getUnAdoptante() {
        return unAdoptante;
    }

    public void setUnAdoptante(Adoptante unAdoptante) {
        this.unAdoptante = unAdoptante;
    }
    
}
