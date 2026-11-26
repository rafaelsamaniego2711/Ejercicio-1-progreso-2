public class AnalizadorCatalogo {
    private Producto[] productos;

    public AnalizadorCatalogo(Producto[] productos) {
        this.productos = productos;
    }

    public String listarProductos() {
        String resultado = "";
        if (productos == null) {
            return resultado;
        }
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                resultado += productos[i].mostrarInformacion() + "\n";
            }
        }
        return resultado;
    }

    public int contarDisponibles() {
        int contador = 0;
        if (productos == null) {
            return contador;
        }
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null && productos[i].isDisponible()) {
                contador++;
            }
        }
        return contador;
    }

    public double calcularPrecioPromedio() {
        if (productos == null) {
            return 0.0;
        }
        double suma = 0.0;
        int validos = 0;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                suma += productos[i].getPrecio();
                validos++;
            }
        }
        return validos > 0 ? suma / validos : 0.0;
    }

    public Producto buscarPorCodigo(String codigo) {
        if (productos == null || codigo == null) {
            return null;
        }
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null && codigo.equals(productos[i].getCodigo())) {
                return productos[i];
            }
        }
        return null;
    }

    public Producto obtenerProductoMasCaro() {
        if (productos == null) {
            return null;
        }
        Producto masCaro = null;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                if (masCaro == null || productos[i].getPrecio() > masCaro.getPrecio()) {
                    masCaro = productos[i];
                }
            }
        }
        return masCaro;
    }
}
