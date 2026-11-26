public class Main {
    public static void main(String[] args) {
        Producto[] productos = new Producto[5];
        productos[0] = new Producto("P01", "Mouse", 25.50, true);
        productos[1] = new Producto("P02", "Teclado", 45.00, true);
        productos[2] = new Producto("P03", "Monitor", 220.00, false);
        productos[3] = new Producto("P04", "Audífonos", 60.00, true);
        productos[4] = new Producto("P05", "Webcam", 80.00, false);

        AnalizadorCatalogo analizador = new AnalizadorCatalogo(productos);

        System.out.println(analizador.listarProductos());
        System.out.println("Disponibles: " + analizador.contarDisponibles());
        System.out.printf("Precio promedio: $%.2f%n", analizador.calcularPrecioPromedio());

        Producto encontrado = analizador.buscarPorCodigo("P03");
        System.out.println("Buscar P03: " + (encontrado != null ? encontrado.mostrarInformacion() : "No encontrado"));

        Producto inexistente = analizador.buscarPorCodigo("P99");
        System.out.println("Buscar P99: " + (inexistente != null ? inexistente.mostrarInformacion() : "null"));

        Producto masCaro = analizador.obtenerProductoMasCaro();
        System.out.println("Más caro: " + (masCaro != null ? masCaro.mostrarInformacion() : "Ninguno"));
    }
}
