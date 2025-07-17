public abstract class ContenedorCambio implements CambioProducto {
    private CambioProducto next;

    @Override
    public void setNext(CambioProducto cambio){
        this.next = cambio;
    }

    @Override
    public Producto procesoCambio(Producto producto){
        if(next != null){
            return next.procesoCambio(producto);
        }
        return producto;
    }
}