// Clase Bebida (Bebidas que se almacenarán en Depósitos de la clase Deposito.java)
public abstract class Dulce extends Producto {

    // Constructor method
    public Dulce(int serie) {
        super(serie);
    }

    // Abstract methods
    public abstract String sabor();
}

// Subclase de Bebida: Snickers (Al ser subclase, hereda las variables de Dulce)
class Snickers extends Dulce {
    // Constructor method
    public Snickers(int serie) {
        super(serie);
    }

    // Abstract method from superclass
    @Override
    public String sabor() {
        return "snickers";
    }
}

// Subclase de Bebida: Super8 (Al ser subclase, hereda las variables de Dulce)
class Super8 extends Dulce {
    // Constructor method
    public Super8(int serie) {
        super(serie);
    }

    // Abstract method from superclass
    @Override
    public String sabor() {
        return "super8";
    }
}
