public class Expendedor {
    private final Deposito<Producto> productos;
    private final Deposito<Moneda> monedas;
    private final int precio;

    public static final int  COCA = 1;
    public static final int  SPRITE = 2;

    public Expendedor(int num_bebidas, int precioBebidas) {
        productos = new Deposito<>();
        monedas = new Deposito<>();
        this.precio = precioBebidas;

        for (int i = 0; i< num_bebidas; i++) {
            productos.addObjeto(new CocaCola(100+i));
            productos.addObjeto(new Sprite(200+i));
        }
    }

    // Reemplazar este metodo por comprarProducto()
    /*public Bebida comprarBebida(Moneda moneda, int cual) {
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
                monedas.addObjeto(new Moneda100());
            }
            return bebida;
        }

        for (int i = 0; i < ((valor_moneda)/100); i++) {
            monedas.addObjeto(new Moneda100());
        }

        return null;
    }*/

    public Moneda getVuelto () {
        return monedas.getObjeto();
    }
}
