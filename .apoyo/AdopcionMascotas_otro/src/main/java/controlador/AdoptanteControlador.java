/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.util.List;
import modelo.Adoptante;

/**
 *
 * @author Malena
 */
public class AdoptanteControlador {
    private List<Adoptante> listaAdoptantes; 
    
    public void agregarAdoptante (Adoptante unAdoptante){
        this.listaAdoptantes.add(unAdoptante);
    }

}
