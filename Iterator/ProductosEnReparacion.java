package Iterator;

import java.util.List;

public class ProductosEnReparacion implements ProductosCollection {
    private List<Producto> productos;

    public ProductosEnReparacion(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public ProductoIterator createIterator() {
        return new ProductoEnReparacionIterator(productos);
    }
}
