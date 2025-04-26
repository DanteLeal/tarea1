public enum ProductoTipo {
    COCA(1, 200),
    SPRITE(2, 300);

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
