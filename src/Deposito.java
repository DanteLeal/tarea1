import java.util.ArrayList;

public class Deposito {
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
