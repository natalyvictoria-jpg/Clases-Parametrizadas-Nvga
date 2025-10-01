package inventario;

import inventario.Libro;
import inventario.Electronico;
import inventario.Producto;
import inventario.Producto;
import inventario.Ropa;
import inventario.Ropa;
import java.util.ArrayList;

public class MainGenericos {
    public static void main(String[] args) {
        ArrayList<Producto<?>> inventario = new ArrayList<>();

        inventario.add(new Libro("Java Básico", 299.99, 350));
        inventario.add(new Electronico("Laptop ASUS", 15999.99, "2 años"));
        inventario.add(new Libro("Patrones de Diseño", 499.50, 420));
        inventario.add(new Electronico("Smartphone Samsung", 10999.00, "1 año"));
        inventario.add(new Ropa("Camisa Polo", 499.00, "M"));

        System.out.println("=== Inventario ===");
        for (Producto<?> p : inventario) {
            p.mostrarDetalles();
        }

        System.out.println("\n=== Filtrado ===");
        for (Producto<?> p : inventario) {
            if (p instanceof Libro && (Integer) p.getExtra() > 400) {
                p.mostrarDetalles();
            } else if (p instanceof Electronico) {
                String garantia = (String) p.getExtra();
                if (garantia.contains("2 años")) {
                    p.mostrarDetalles();
                }
            }
        }
    }
}
