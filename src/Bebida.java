// Clase Bebida (Bebidas que se almacenarán en Depósitos de la clase Deposito.java)
public abstract class Bebida extends Producto {
    // Variables
    private final int serie;

    // Constructor method
    public Bebida(int serie) {
        super(serie);
        this.serie = serie;
    }

    // Getter methods
    public int getSerie() {
        return serie;
    }

    // No setter methods.

    // Abstract methods
    public abstract String beber ();
}

// Subclase de Bebida: CocaCola (Al ser subclase, hereda las variables de Bebida)
class CocaCola extends Bebida {
    // Constructor method
    public CocaCola(int serie) {
        super(serie);
    }

    // Abstract method from superclass
    @Override
    public String beber () {
        return "cocacola";
    }
}

// Subclase de Bebida: Sprite (Al ser subclase, hereda las variables de Bebida)
class Sprite extends Bebida {
    // Constructor method
    public Sprite(int serie) {
        super(serie);
    }

    // Abstract method from superclass
    @Override
    public String beber () {
        return "sprite";
    }
}
