public class Expendedor {
    private final Deposito<Producto> depositoCoca;
    private final Deposito<Producto> depositoSprite;
    private final Deposito<Moneda> depositoMonedas;

    public static final int COCA = ProductoTipo.COCA.getNumero();
    public static final int SPRITE = ProductoTipo.SPRITE.getNumero();
    public static final int PRECIO_COCA = ProductoTipo.COCA.getPrecio();
    public static final int PRECIO_SPRITE = ProductoTipo.SPRITE.getPrecio();

    public Expendedor(int numProductos) {
        depositoCoca = new Deposito<>();
        depositoSprite = new Deposito<>();
        depositoMonedas = new Deposito<>();

        for (int i = 0; i < numProductos; i++) {
            depositoCoca.addObjeto(new CocaCola(100+i));
            depositoSprite.addObjeto(new Sprite(200+i));
            // Añadir subclases de dulce
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
        else {
            depositoMonedas.addObjeto(moneda);
            return null;
        }
    }

    public Moneda getVuelto () {
        return depositoMonedas.getObjeto();
    }
}
