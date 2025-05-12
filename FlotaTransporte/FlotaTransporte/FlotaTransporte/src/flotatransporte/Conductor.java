/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flotatransporte;

/**
 *
 * @author aaros
 */
public class Conductor {
    
   private String id, nombre, licencia;

    public Conductor(String id, String nombre, String licencia) {
        this.id = id;
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getLicencia() { return licencia; }

    @Override
    public String toString() {
        return "Conductor[ID: " + id + ", Nombre: " + nombre + ", Licencia: " + licencia + "]";
    }
}   
    

