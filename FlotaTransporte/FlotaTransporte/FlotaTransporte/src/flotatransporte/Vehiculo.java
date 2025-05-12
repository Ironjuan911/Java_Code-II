/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flotatransporte;

import java.io.*;
import java.util.Hashtable;
import java.util.Map;

// Clase Vehículo
class Vehiculo {
    private String id, modelo, placa;
    private int anio;


    public Vehiculo(String id, String modelo, String placa, int anio) {
        this.id = id;
        this.modelo = modelo;
        this.placa = placa;
        this.anio = anio;
    }

    public String getId() { return id; }
    public String getModelo() { return modelo; }
    public String getPlaca() { return placa; }
    public int getAnio() { return anio; }

    @Override
    public String toString() {
        return "Vehiculo[ID: " + id + ", Modelo: " + modelo + ", Placa: " + placa + ", Año: " + anio + "]";
    }
}
