public abstract class Bebida {
    private final int serie;

    public Bebida(int serie) {
        this.serie = serie;
    }

    public int getSerie() {
        return serie;
    }

    public abstract String beber ();
}

// Subclase de Bebida: CocaCola
class CocaCola extends Bebida {
    public CocaCola(int serie) {
        super(serie);
    }

    @Override
    public String beber () {
        return "cocacola";
    }
}

// Subclase de Bebida: Sprite
class Sprite extends Bebida {
    public Sprite(int serie) {
        super(serie);
    }

    @Override
    public String beber () {
        return "sprite";
    }

}
