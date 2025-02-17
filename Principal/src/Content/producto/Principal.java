package Content.producto;


public class Principal {
    public static void main(String[] args) {
        Producto producto = new Producto();
        producto.Imprimir();
        producto.setCodigo("001");
        producto.setNombre("Teclado sin sonido");
        producto.setPrecio(85000);
        producto.Imprimir();

        producto = new Producto("002", "Mouse de 7 botones", 35000);
        producto.Imprimir();
    }
}
