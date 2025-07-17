public class FalloCubiertoPorGarantia extends ContenedorCambio {

    public boolean comprobarFalloEnGarantia(Producto producto){
        // aquí va la lógica del negocio
        return true;
    }

    @Override
    public Producto procesoCambio(Producto producto){
        if(comprobarFalloEnGarantia(producto)){
            System.out.println("Fallo cubierto por la garantia.");
            return super.procesoCambio(producto);
        }else {
            System.out.println("Fallo no cubierto por la garantia. Cambio denegado.");
            return producto;
        }
    }
}