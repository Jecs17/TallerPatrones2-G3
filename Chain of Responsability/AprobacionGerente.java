public class AprobacionGerente extends ContenedorCambio {

    public boolean aprobacionGerente(Producto producto){
        // aquí va la lógica del negocio
        return true;
    }

    public Producto cambiarProducto(Producto producto){
        //Simulacion de nuevo producto
        return new Producto(producto.getNombre() + "2", producto.getPrecio());
    }

    @Override
    public Producto procesoCambio(Producto producto){
        if(aprobacionGerente(producto)){
            System.out.println("Cambio aprobado por el gerente.");
            System.out.println("Producto cambiado.");
            return cambiarProducto(producto);
        } else {
            System.out.println("Gerente no aprobo el cambio.");
            return producto;
        }
    }
}