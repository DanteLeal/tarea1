// Clase Moneda (Monedas que se almacenarán en Depósitos de la clase DepositoM.java)
public abstract class Moneda implements Comparable<Moneda> {
    // No variables.

    // Constructor method vacío
    public Moneda() {}

    // Getter method
    public Moneda getSerie() {
        return this;
    }

    // No setter methods.

    // Abstract methods
    public abstract int getValor();

    /**
     * Compara esta moneda con la dada.
     *
     * @param moneda la moneda con la que se quiere comparar esta moneda
     * @return un número positivo si el valor de esta moneda es mayor,
     *         un número negativo si el valor de esta moneda es menor,
     *         cero si son iguales.
     */
    @Override
    public int compareTo(Moneda moneda) {
        return this.getValor() - moneda.getValor();
    }
}

// Subclase de Moneda: $100
class Moneda100 extends Moneda {
    // Construct method
    public Moneda100() {
        super();
    }

    // Abstract method from superclass
    @Override
    public int getValor() {
        return 100;
    }
}

// Subclase de Moneda: $500
class Moneda500 extends Moneda {
    // Construct method
    public Moneda500() {
        super();
    }

    // Abstract method from superclass
    @Override
    public int getValor() {
        return 500;
    }
}

// Subclase de Moneda: $1000
class Moneda1000 extends Moneda {
    // Construct method
    public Moneda1000() {
        super();
    }

    // Abstract method from superclass
    @Override
    public int getValor() {
        return 1000;
    }
}

// Subclase de Moneda: $1500
class Moneda1500 extends Moneda {
    // Construct method
    public Moneda1500() {
        super();
    }

    // Abstract method from superclass
    @Override
    public int getValor() {
        return 1500;
    }
}
