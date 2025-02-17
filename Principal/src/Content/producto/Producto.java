package Content.producto;
import iron_package.F_System;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;

    public Producto(String codigo, String nombre, double precio) {
        System.out.println("Se ha creado un producto");
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto() {
        System.out.println("Se ha creado un producto");
    }

    public void Imprimir() {
        F_System.Output(
            "Codigo: " + this.codigo,
            "Nombre: " + this.nombre,
            "Precio: " + this.precio,
            "", 
            9
            );
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
