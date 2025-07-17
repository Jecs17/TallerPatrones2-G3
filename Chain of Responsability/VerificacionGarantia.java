public class VerificacionGarantia extends ContenedorCambio {

    public boolean comprobarGarantia(Producto producto){
        // aquí va la lógica del negocio
        return true;
    }

    @Override
    public Producto procesoCambio(Producto producto){
        if(comprobarGarantia(producto)){
            System.out.println("Garantia verificada.");
            return super.procesoCambio(producto);
        } else{
            System.out.println("Producto fuera de garantia. Cambio denegado.");
            return producto;
        }
    }
}