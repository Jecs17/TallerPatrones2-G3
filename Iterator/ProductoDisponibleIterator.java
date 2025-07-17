package Iterator;

import java.util.List;

public class ProductoDisponibleIterator implements ProductoIterator {
    private List<Producto> productos;
    private int position = 0;

    public ProductoDisponibleIterator(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public boolean hasNext() {
        return position < productos.size();
    }

    @Override
    public Producto getNext() {
        return productos.get(position++);
    }
}