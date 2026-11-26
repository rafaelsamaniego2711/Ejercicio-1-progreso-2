public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private boolean disponible;

    public Producto(String codigo, String nombre, double precio, boolean disponible) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = disponible;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public String mostrarInformacion() {
        String estado = disponible ? "Disponible" : "No disponible";
        return codigo + " - " + nombre + " - $" + String.format("%.2f", precio) + " - " + estado;
    }
}
