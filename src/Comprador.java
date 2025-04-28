public class Comprador {
    private final String sonido;
    private final int vuelto;

    public Comprador(Moneda moneda, int cualBebida, Expendedor expendedor) {
        Producto bebida_comprada = expendedor.comprarProducto(moneda, cualBebida);
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
