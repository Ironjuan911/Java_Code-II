/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flotatransporte;

/**
 *
 * @author aaros
 */
public class Servicio {

    private String id, vehiculoId, conductorId, ruta, fecha;

    public Servicio(String id, String vehiculoId, String conductorId, String ruta, String fecha) {
        this.id = id;
        this.vehiculoId = vehiculoId;
        this.conductorId = conductorId;
        this.ruta = ruta;
        this.fecha = fecha;
    }

    public String getId() { return id; }
    public String getVehiculoId() { return vehiculoId; }
    public String getConductorId() { return conductorId; }
    public String getRuta() { return ruta; }
    public String getFecha() { return fecha; }

    @Override
    public String toString() {
        return "Servicio[ID: " + id + ", VehiculoID: " + vehiculoId 
                + ", ConductorID: " + conductorId + ", Ruta: " + ruta 
                + ", Fecha: " + fecha + "]";
    }
}
