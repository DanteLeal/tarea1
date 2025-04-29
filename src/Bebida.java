// Clase Bebida (Bebidas que se almacenarán en Depósitos de la clase Deposito.java)
public abstract class Bebida extends Producto {

    // Constructor method
    public Bebida(int serie) {
        super(serie);
    }

    // Abstract methods
    public abstract String getSabor();
}

// Subclase de Bebida: CocaCola (Al ser subclase, hereda las variables de Bebida)
class CocaCola extends Bebida {
    // Constructor method
    public CocaCola(int serie) {
        super(serie);
    }

    // Abstract method from superclass
    @Override
    public String getSabor() {
        return "cocacola";
    }
}

// Subclase de Bebida: Fanta (Al ser subclase, hereda las variables de Bebida)
class Fanta extends Bebida {
    // Constructor method
    public Fanta(int serie) {
        super(serie);
    }

    // Abstract method from superclass
    @Override
    public String getSabor() {
        return "fanta";
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
    public String getSabor() {
        return "sprite";
    }
}
