public enum ProductoTipo {
    COCA(1, 1100),
    FANTA(2, 1200),
    SPRITE(3, 1300),
    SNICKER(4, 400),
    SUPER8(5, 500);

    private final int numero;
    private final int precio;

    ProductoTipo(int numero, int precio) {
        this.numero = numero;
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public int getPrecio() {
        return precio;
    }
}
