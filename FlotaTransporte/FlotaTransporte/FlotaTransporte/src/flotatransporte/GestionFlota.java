/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flotatransporte;

import java.io.*;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author aaros
 */
public class GestionFlota {
    private Hashtable<String, Vehiculo> vehiculos = new Hashtable<>();
    private Hashtable<String, Conductor> conductores = new Hashtable<>();
    private Hashtable<String, Servicio> servicios = new Hashtable<>();

    // Métodos de gestión
    public void agregarVehiculo(Vehiculo v) { vehiculos.put(v.getId(), v); }
    public void agregarConductor(Conductor c) { conductores.put(c.getId(), c); }
    public void agregarServicio(Servicio s) { servicios.put(s.getId(), s); }
    
    public Vehiculo obtenerVehiculo(String id) { return vehiculos.get(id); }
    public Conductor obtenerConductor(String id) { return conductores.get(id); }
    public Servicio obtenerServicio(String id) { return servicios.get(id); }
    
    public void eliminarVehiculo(String id) { vehiculos.remove(id); }
    public void eliminarConductor(String id) { conductores.remove(id); }
    public void eliminarServicio(String id) { servicios.remove(id); }
    
    public void listarVehiculos() { vehiculos.values().forEach(System.out::println); }
    public void listarConductores() { conductores.values().forEach(System.out::println); }
    public void listarServicios() { servicios.values().forEach(System.out::println); }

    // Métodos de carga y almacenamiento de datos
    public void guardarDatos(String archivo) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
            out.writeObject(vehiculos);
            out.writeObject(conductores);
            out.writeObject(servicios);
        } catch (IOException e) {
            System.err.println("Error al guardar los datos: " + e.getMessage());
        }
    }    
    public void cargarDatos(String archivo) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            vehiculos = (Hashtable<String, Vehiculo>) in.readObject();
            conductores = (Hashtable<String, Conductor>) in.readObject();
            servicios = (Hashtable<String, Servicio>) in.readObject();
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado, iniciando con datos vacíos.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar los datos: " + e.getMessage());
        }
    }    
    
}
