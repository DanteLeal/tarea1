import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Inicializar objetos a utilizar
        Expendedor exp = new Expendedor(5,1000);
        Moneda m = null;
        Comprador c = null;

        String expectedResult;

        // Bebida que NO vende
        System.out.println("-----Bebida que NO vende-----");
        expectedResult = " || null, $500";
        m = new Moneda500();
        c = new Comprador(m,657,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // null $500
        m = new Moneda500();
        c = new Comprador(m,657,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // null $500
        m = new Moneda500();
        c = new Comprador(m,657,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // null $500
        m = new Moneda500();
        c = new Comprador(m,657,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // null $500
        m = new Moneda500();
        c = new Comprador(m,657,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // null $500
        System.out.println();

        // Trata de comprar SIN Moneda
        System.out.println("-----Trata de comprar SIN Moneda-----");
        expectedResult = " || null, $0";
        m = null;
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // null $0
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // null $0
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // null $0
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // null $0
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // null $0
        System.out.println();

        // Con dinero JUSTO para el precio
        System.out.println("-----Con dinero JUSTO para el precio-----");
        expectedResult = " || cocacola, $0";
        m = new Moneda1000();
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // cocacola $0
        m = new Moneda1000();
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // cocacola $0
        m = new Moneda1000();
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // cocacola $0
        m = new Moneda1000();
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // cocacola $0
        m = new Moneda1000();
        c = new Comprador(m,Expendedor.COCA,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // cocacola $0
        System.out.println();

        // Con MENOS dinero que el precio
        System.out.println("-----Con MENOS dinero que el precio-----");
        expectedResult = " || null, $500";
        m = new Moneda500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // null $500
        m = new Moneda500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // null $500
        m = new Moneda500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // null $500
        m = new Moneda500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // null $500
        m = new Moneda500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // null $500
        System.out.println();

        // Con MAS dinero que el precio
        expectedResult = " || sprite, $500";
        System.out.println("-----Con MAS dinero que el precio-----");
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // sprite $500
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // sprite $500
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // sprite $500
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // sprite $500
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // sprite $500
        System.out.println();

        // Deposito VACIO
        System.out.println("-----Deposito VACIO-----");
        expectedResult = " || null, $1500";
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // null $1500
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // null $1500
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // null $1500
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // null $1500
        m = new Moneda1500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto() + expectedResult); // null $1500
        System.out.println();
    }
}


// Clase Comprador
class Comprador {
    private final String sonido;
    private final int vuelto;

    public Comprador(Moneda moneda, int cualBebida, Expendedor expendedor) {
        Bebida bebida_comprada = expendedor.comprarBebida(moneda, cualBebida);
        if (bebida_comprada != null) {
            this.sonido = bebida_comprada.beber();
        } else {
            this.sonido = null;
        }

        int sum_vuelto = 0;
        Moneda m;
        while ((m = expendedor.getVuelto()) != null){
            sum_vuelto += m.getValor();
        }
        this.vuelto = sum_vuelto;
    }

    public int cuantoVuelto () {
        return vuelto;
    }

    public String queBebiste () {
        return sonido;
    }
}


// Clase Expendedor
class Expendedor {
    private final Deposito deposito_coca;
    private final Deposito deposito_sprite;
    private final DepositoM deposito_monVu;
    private final int precio;

    public static final int  COCA = 1;
    public static final int  SPRITE = 2;

    public Expendedor(int num_bebidas, int precioBebidas) {
        deposito_coca = new Deposito();
        deposito_sprite = new Deposito();
        deposito_monVu = new DepositoM();
        this.precio = precioBebidas;

        for (int i = 0; i< num_bebidas; i++) {
            deposito_coca.addBebida(new CocaCola(100+i));
            deposito_sprite.addBebida(new Sprite(200+i));
        }
    }

    public Bebida comprarBebida(Moneda moneda, int cual) {
        Bebida bebida = null;

        if (moneda == null) {
            return null;
        }

        int valor_moneda = moneda.getValor();

        if ((cual == COCA) && (valor_moneda >= precio)) {
            bebida = deposito_coca.getBebida();
        }
        else if ((cual == SPRITE) && (valor_moneda >= precio)) {
            bebida = deposito_sprite.getBebida();
        }


        if (bebida != null) {
            for (int i = 0; i < ((valor_moneda-precio)/100); i++) {
                deposito_monVu.addMoneda(new Moneda100());
            }
            return bebida;
        }

        for (int i = 0; i < ((valor_moneda)/100); i++) {
            deposito_monVu.addMoneda(new Moneda100());
        }

        return null;
    }



    public Moneda getVuelto () {
        return deposito_monVu.getMoneda();
    }
}


// Clase Deposito de Bebidas
class Deposito {
    private final ArrayList<Bebida> deposito;

    public Deposito() {
        deposito = new ArrayList<>();
    }

    public void addBebida (Bebida bebida) {
        deposito.add(bebida);
    }

    public Bebida getBebida() {
        if (!deposito.isEmpty()) {
            return deposito.removeFirst();
        }
        else return null;
    }
}

// Clase DepositoM de Monedas
class DepositoM {
    private final ArrayList<Moneda> depositoM;

    public DepositoM() {
        depositoM = new ArrayList<>();
    }

    public void addMoneda (Moneda moneda) {
        depositoM.add(moneda);
    }

    public Moneda getMoneda() {
        if (!depositoM.isEmpty()) {
            return depositoM.removeFirst();
        }
        else return null;
    }
}


// Clase Bebida
abstract class Bebida {
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


// Clase Moneda
abstract class Moneda {
    public Moneda() {}

    public Moneda getSerie () {
        return this;
    }

    public abstract int getValor ();
}

// Subclase de Moneda: $100
class Moneda100 extends Moneda {
    public Moneda100() {
        super();
    }

    @Override
    public int getValor() {
        return 100;
    }
}

// Subclase de Moneda: $500
class Moneda500 extends Moneda {
    public Moneda500() {
        super();
    }

    @Override
    public int getValor() {
        return 500;
    }
}

// Subclase de Moneda: $1000
class Moneda1000 extends Moneda {
    public Moneda1000() {
        super();
    }

    @Override
    public int getValor() {
        return 1000;
    }
}

// Subclase de Moneda: $1500
class Moneda1500 extends Moneda {
    public Moneda1500() {
        super();
    }

    @Override
    public int getValor() {
        return 1500;
    }
}
