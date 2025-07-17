package Iterator;

import java.util.List;

public class ProductosDisponibles implements ProductosCollection {
    private List<Producto> productos;

    public ProductosDisponibles(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public ProductoIterator createIterator() {
        return new ProductoDisponibleIterator(productos);
    }
}
