public class Expendedor {
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
