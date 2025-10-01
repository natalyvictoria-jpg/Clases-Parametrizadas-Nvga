package inventario;

import inventario.Producto;

public class Ropa extends Producto<String> {
    public Ropa(String nombre, double precio, String talla) {
        super(nombre, precio, talla);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Ropa: " + getNombre() + " | Precio: $" +
                getPrecio() + " | Talla: " + getExtra());
    }
}
