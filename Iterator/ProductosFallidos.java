package Iterator;

import java.util.List;

public class ProductosFallidos implements ProductosCollection {
    private List<Producto> productos;

    public ProductosFallidos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public ProductoIterator createIterator() {
        return new ProductoFallidoIterator(productos);
    }
} 
