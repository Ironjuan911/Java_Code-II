/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flotatransporte;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aaros
 */
public class FlotaTransporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\nMenú de Gestión de Flota:");
            System.out.println("1. Agregar Vehículo");
            System.out.println("2. Agregar Conductor");
            System.out.println("3. Agregar Servicio");
            System.out.println("4. Listar Vehículos");
            System.out.println("5. Listar Conductores");
            System.out.println("6. Listar Servicios");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Error: ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    try {
                        System.out.print("ID: ");
                        String idV = scanner.nextLine();
                        System.out.print("Modelo: ");
                        String modelo = scanner.nextLine();
                        System.out.print("Placa: ");
                        String placa = scanner.nextLine();
                        System.out.print("Año: ");
                        int anio = Integer.parseInt(scanner.nextLine());
                        Vehiculo v = new Vehiculo(idV, modelo, placa, anio);
                        dbManager.agregarVehiculo(v);
                    } catch (Exception e) {
                        System.err.println("Error al agregar vehículo: " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.print("ID: ");
                        String idC = scanner.nextLine();
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Licencia: ");
                        String licencia = scanner.nextLine();
                        Conductor c = new Conductor(idC, nombre, licencia);
                        dbManager.agregarConductor(c);
                    } catch (Exception e) {
                        System.err.println("Error al agregar conductor: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        // Listar vehículos disponibles
                        System.out.println("Vehículos disponibles:");
                        ArrayList<Vehiculo> vehiculos = dbManager.listarVehiculos();
                        if (vehiculos.isEmpty()) {
                            System.out.println("No hay vehículos registrados.");
                        } else {
                            vehiculos.forEach(System.out::println);
                        }

                        // Listar conductores disponibles
                        System.out.println("Conductores disponibles:");
                        ArrayList<Conductor> conductores = dbManager.listarConductores();
                        if (conductores.isEmpty()) {
                            System.out.println("No hay conductores registrados.");
                        } else {
                            conductores.forEach(System.out::println);
                        }

                        // Solicitar los datos para el nuevo servicio
                        System.out.print("ID de Servicio: ");
                        String idS = scanner.nextLine();
                        System.out.print("Vehículo ID (seleccione uno de los anteriores): ");
                        String vId = scanner.nextLine();
                        System.out.print("Conductor ID (seleccione uno de los anteriores): ");
                        String cId = scanner.nextLine();
                        System.out.print("Ruta: ");
                        String ruta = scanner.nextLine();
                        System.out.print("Fecha: ");
                        String fecha = scanner.nextLine();

                        Servicio s = new Servicio(idS, vId, cId, ruta, fecha);
                        dbManager.agregarServicio(s);
                    } catch (Exception e) {
                        System.err.println("Error al agregar servicio: " + e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        ArrayList<Vehiculo> vehiculos = dbManager.listarVehiculos();
                        if (vehiculos.isEmpty()) {
                            System.out.println("No hay vehículos registrados.");
                        } else {
                            vehiculos.forEach(System.out::println);
                        }
                    } catch (Exception e) {
                        System.err.println("Error al listar vehículos: " + e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        ArrayList<Conductor> conductores = dbManager.listarConductores();
                        if (conductores.isEmpty()) {
                            System.out.println("No hay conductores registrados.");
                        } else {
                            conductores.forEach(System.out::println);
                        }
                    } catch (Exception e) {
                        System.err.println("Error al listar conductores: " + e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        ArrayList<Servicio> servicios = dbManager.listarServicios();
                        if (servicios.isEmpty()) {
                            System.out.println("No hay servicios registrados.");
                        } else {
                            servicios.forEach(System.out::println);
                        }
                    } catch (Exception e) {
                        System.err.println("Error al listar servicios: " + e.getMessage());
                    }
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        } while (opcion != 7);

        dbManager.close();
    }
}