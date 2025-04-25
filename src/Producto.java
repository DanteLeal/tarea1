enum Precio {
    COCACOLA(1100),
    SPRITE(1200),
    FANTA(1300),
    SNICKER(100),
    SUPER8(200);
}

public abstract class Producto {

    // Variables
    private int precio;
    private int serie;

    // Constructor method
    public Producto(int serie) {
    }

    // Setter method
    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
