import java.util.ArrayList;

public class DepositoM {
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
