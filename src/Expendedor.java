public class Expendedor {
    // Bebidas
    private final Deposito<Producto> depositoCoca;
    private final Deposito<Producto> depositoFanta;
    private final Deposito<Producto> depositoSprite;
    // Dulces
    private final Deposito<Producto> depositoSnickers;
    private final Deposito<Producto> depositoSuper8;
    // Monedas para vuelto
    private final Deposito<Moneda> depositoMonedas;


    // ToDo: Cambiar ProductoTipo.java para usar enum directamente, sin re-definir variables en Expendedor.
    // Numeración de productos
    public static final int COCA = ProductoTipo.COCA.getNumero();
    public static final int FANTA = ProductoTipo.FANTA.getNumero();
    public static final int SPRITE = ProductoTipo.SPRITE.getNumero();
    public static final int SNICKERS = ProductoTipo.SNICKERS.getNumero();
    public static final int SUPER8 = ProductoTipo.SUPER8.getNumero();
    // Precios de productos
    public static final int PRECIO_COCA = ProductoTipo.COCA.getPrecio();
    public static final int PRECIO_FANTA = ProductoTipo.FANTA.getPrecio();
    public static final int PRECIO_SPRITE = ProductoTipo.SPRITE.getPrecio();
    public static final int PRECIO_SNICKERS = ProductoTipo.SNICKERS.getPrecio();
    public static final int PRECIO_SUPER8 = ProductoTipo.SUPER8.getPrecio();

    public Expendedor(int numProductos) {
        // Depositos de Bebidas
        depositoCoca = new Deposito<>();
        depositoFanta = new Deposito<>();
        depositoSprite = new Deposito<>();
        // Depositos de Dulces
        depositoSnickers = new Deposito<>();
        depositoSuper8 = new Deposito<>();
        // Deposito de Monedas
        depositoMonedas = new Deposito<>();

        for (int i = 0; i < numProductos; i++) {
            depositoCoca.addObjeto(new CocaCola(1000+i));
            depositoCoca.addObjeto(new Fanta(2000+i));
            depositoSprite.addObjeto(new Sprite(3000+i));
            depositoSnickers.addObjeto(new Snickers(4000+i));
            depositoSuper8.addObjeto(new Super8(5000+i));
        }
    }

    public Producto comprarProducto(Moneda moneda, int cual) {
        if (moneda == null) {            
            return null;
        }

        int valorMoneda = moneda.getValor();
        Producto producto = null;

        if (cual == COCA && valorMoneda >= PRECIO_COCA) {
            producto = depositoCoca.getObjeto();
            if (producto != null) {
                int vuelto = moneda.getValor() - PRECIO_COCA;
                for (int i = 0; i < vuelto / 100; i++) {
                    depositoMonedas.addObjeto(new Moneda100());
                }
                return producto;
            }
            else {
                depositoMonedas.addObjeto(moneda);
                return null;
            }
        }
        else if (cual == FANTA && valorMoneda >= PRECIO_FANTA) {
            producto = depositoFanta.getObjeto();
            if (producto != null) {
                int vuelto = moneda.getValor() - PRECIO_FANTA;
                for (int i = 0; i < vuelto / 100; i++) {
                    depositoMonedas.addObjeto(new Moneda100());
                }
                return producto;
            }
            else {
                depositoMonedas.addObjeto(moneda);
                return null;
            }
        }
        else if (cual == SPRITE && valorMoneda >= PRECIO_SPRITE) {
            producto = depositoSprite.getObjeto();
            if (producto != null) {
                int vuelto = moneda.getValor() - PRECIO_SPRITE;
                for (int i = 0; i < vuelto / 100; i++) {
                    depositoMonedas.addObjeto(new Moneda100());
                }
                return producto;
            }
            else {
                depositoMonedas.addObjeto(moneda);
                return null;
            }
        }
        else if (cual == SNICKERS && valorMoneda >= PRECIO_SNICKERS) {
            producto = depositoSnickers.getObjeto();
            if (producto != null) {
                int vuelto = moneda.getValor() - PRECIO_SNICKERS;
                for (int i = 0; i < vuelto / 100; i++) {
                    depositoMonedas.addObjeto(new Moneda100());
                }
                return producto;
            }
            else {
                depositoMonedas.addObjeto(moneda);
                return null;
            }
        }
        else if (cual == SUPER8 && valorMoneda >= PRECIO_SUPER8) {
            producto = depositoSuper8.getObjeto();
            if (producto != null) {
                int vuelto = moneda.getValor() - PRECIO_SUPER8;
                for (int i = 0; i < vuelto / 100; i++) {
                    depositoMonedas.addObjeto(new Moneda100());
                }
                return producto;
            }
            else {
                depositoMonedas.addObjeto(moneda);
                return null;
            }
        }
        else {
            depositoMonedas.addObjeto(moneda);
            return null;
        }
    }

    public Moneda getVuelto () {
        return depositoMonedas.getObjeto();
    }
}
