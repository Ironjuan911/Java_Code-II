/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flotatransporte;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class DatabaseManager {
    
    private Connection connection;

    public DatabaseManager() {
        try {
            // Cargar el driver de H2 y establecer la conexión
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
            System.out.println("Conexión a la base de datos establecida.");
            initTables();
        } catch (ClassNotFoundException e) {
            System.err.println("Error: Driver de H2 no encontrado. " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error insperado al conectar a la base de datos: " + e.getMessage());
        }
    }

    // Método para crear las tablas si no existen
    private void initTables() {
        String createVehiculoTable = "CREATE TABLE IF NOT EXISTS vehiculos ("
                + "id VARCHAR(50) PRIMARY KEY, "
                + "modelo VARCHAR(255), "
                + "placa VARCHAR(50), "
                + "anio INT"
                + ");";

        String createConductorTable = "CREATE TABLE IF NOT EXISTS conductores ("
                + "id VARCHAR(50) PRIMARY KEY, "
                + "nombre VARCHAR(255), "
                + "licencia VARCHAR(100)"
                + ");";

        String createServicioTable = "CREATE TABLE IF NOT EXISTS servicios ("
                + "id VARCHAR(50) PRIMARY KEY, "
                + "vehiculoId VARCHAR(50), "
                + "conductorId VARCHAR(50), "
                + "ruta VARCHAR(255), "
                + "fecha VARCHAR(50), "
                + "FOREIGN KEY (vehiculoId) REFERENCES vehiculos(id), "
                + "FOREIGN KEY (conductorId) REFERENCES conductores(id)"
                + ");";

        try (Statement stmt = connection.createStatement()) {
            stmt.execute(createVehiculoTable);
            stmt.execute(createConductorTable);
            stmt.execute(createServicioTable);
            System.out.println("Tablas creadas o verificadas correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al crear las tablas: " + e.getMessage());
        }
    }

    // Método para agregar un vehículo a la base de datos
    public void agregarVehiculo(Vehiculo v) {
        String insert = "INSERT INTO vehiculos (id, modelo, placa, anio) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(insert)) {
            pstmt.setString(1, v.getId());
            pstmt.setString(2, v.getModelo());
            pstmt.setString(3, v.getPlaca());
            pstmt.setInt(4, v.getAnio());
            pstmt.executeUpdate();
            System.out.println("Vehículo agregado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al agregar vehículo: " + e.getMessage());
        }
    }

    // Método para agregar un conductor a la base de datos
    public void agregarConductor(Conductor c) {
        String insert = "INSERT INTO conductores (id, nombre, licencia) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(insert)) {
            pstmt.setString(1, c.getId());
            pstmt.setString(2, c.getNombre());
            pstmt.setString(3, c.getLicencia());
            pstmt.executeUpdate();
            System.out.println("Conductor agregado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al agregar conductor: " + e.getMessage());
        }
    }

    // Método para agregar un servicio a la base de datos
    public void agregarServicio(Servicio s) {
        String insert = "INSERT INTO servicios (id, vehiculoId, conductorId, ruta, fecha) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(insert)) {
            pstmt.setString(1, s.getId());
            pstmt.setString(2, s.getVehiculoId());
            pstmt.setString(3, s.getConductorId());
            pstmt.setString(4, s.getRuta());
            pstmt.setString(5, s.getFecha());
            pstmt.executeUpdate();
            System.out.println("Servicio agregado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al agregar servicio: " + e.getMessage());
        }
    }

    // Métodos para listar registros y devolverlos en un ArrayList

    public ArrayList<Vehiculo> listarVehiculos() {
        ArrayList<Vehiculo> lista = new ArrayList<>();
        String query = "SELECT * FROM vehiculos";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Vehiculo v = new Vehiculo(
                        rs.getString("id"),
                        rs.getString("modelo"),
                        rs.getString("placa"),
                        rs.getInt("anio")
                );
                lista.add(v);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar vehículos: " + e.getMessage());
        }
        return lista;
    }

    public ArrayList<Conductor> listarConductores() {
        ArrayList<Conductor> lista = new ArrayList<>();
        String query = "SELECT * FROM conductores";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Conductor c = new Conductor(
                        rs.getString("id"),
                        rs.getString("nombre"),
                        rs.getString("licencia")
                );
                lista.add(c);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar conductores: " + e.getMessage());
        }
        return lista;
    }

    public ArrayList<Servicio> listarServicios() {
        ArrayList<Servicio> lista = new ArrayList<>();
        String query = "SELECT * FROM servicios";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Servicio s = new Servicio(
                        rs.getString("id"),
                        rs.getString("vehiculoId"),
                        rs.getString("conductorId"),
                        rs.getString("ruta"),
                        rs.getString("fecha")
                );
                lista.add(s);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar servicios: " + e.getMessage());
        }
        return lista;
    }

    // Método para cerrar la conexión
    public void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexión a la base de datos cerrada.");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}    
    

