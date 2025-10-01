package inventario;

import inventario.Producto;
import inventario.Producto;

public class Electronico extends Producto<String> {
    public Electronico(String nombre, double precio, String garantia) {
        super(nombre, precio, garantia);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Electrónico: " + getNombre() + " | Precio: $" +
                getPrecio() + " | Garantía: " + getExtra());
    }
}
