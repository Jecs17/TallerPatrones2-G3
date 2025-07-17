public class ComprobacionProductoExistente extends ContenedorCambio {
    public boolean productoExisteEnBodega(Producto producto){
        // aquí va la lógica del negocio
        return true;
    }

    public Producto cambiarProducto(Producto producto){
        //Simulacion de nuevo producto
        return new Producto(producto.getNombre() + "2", producto.getPrecio());
    }

    @Override
    public Producto procesoCambio(Producto producto){
        if(productoExisteEnBodega(producto)){
            System.out.println("Producto existe en bodega.");
            if(producto.getPrecio() > 1000){
                System.out.println("Producto con precio mayor a $1000. Necesita aprobacion del gerente.");
                return super.procesoCambio(producto);
            }else{
                System.out.println("Producto con precio menor a $1000.");
                System.out.println("Producto cambiado.");
                return cambiarProducto(producto);
            }
        }else {
            System.out.println("Producto no disponible en bodega. Cambio denegado");
            return producto;
        }
    }
}