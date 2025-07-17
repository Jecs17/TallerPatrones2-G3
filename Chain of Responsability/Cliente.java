public class Cliente {
    public static void main(String[] args) {

        CambioProducto verificacion = new VerificacionGarantia();
        CambioProducto fallo = new FalloCubiertoPorGarantia();
        CambioProducto existencia = new ComprobacionProductoExistente();
        CambioProducto aprobacion = new AprobacionGerente();

        verificacion.setNext(fallo);
        fallo.setNext(existencia);
        existencia.setNext(aprobacion);

        Producto productoBarato = new Producto("Monitor", 250);
        System.out.println("Producto a cambiar: " + productoBarato);

        Producto productoBaratoFinal = verificacion.procesoCambio(productoBarato);
        System.out.println("Proceso finalizado. Entrega del producto: " + productoBaratoFinal);

        System.out.println("\n*************************************\n");

        Producto productoCaro = new Producto("TV", 1300);
        System.out.println("Producto a cambiar: " + productoCaro);

        Producto productoCaroFinal = verificacion.procesoCambio(productoCaro);
        System.out.println("Proceso finalizado. Entrega del producto: " + productoCaroFinal);
    }
}