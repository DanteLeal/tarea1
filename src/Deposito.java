import java.util.ArrayList;

public class Deposito<T> {

    private final ArrayList<T> objetos;

    public Deposito() {
        objetos = new ArrayList<>();
    }

    public void addObjeto(T objeto) {
        objetos.add(objeto);
    }

    public T getObjeto() {
        if (!objetos.isEmpty()) {
            return objetos.remove(0);
        }
        return null;
    }
}