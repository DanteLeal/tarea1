public abstract class Producto {

    // Variables
    private int precio;
    private final int serie;

    // Constructor method
    public Producto(int serie) {
        this.serie = serie;
    }

    // Setter method
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // Getter method
    public int getSerie() {
        return serie;
    }

    // Abstract method
    public abstract String getSabor();
}
