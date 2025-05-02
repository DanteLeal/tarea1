public abstract class Producto {

    // Variables
    private final int serie;

    // Constructor method
    public Producto(int serie) {
        this.serie = serie;
    }

    // Getter method
    public int getSerie() {
        return serie;
    }

    // Abstract method
    public abstract String getSabor();
}
