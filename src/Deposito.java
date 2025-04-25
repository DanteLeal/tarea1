import java.util.ArrayList;

class Deposito<T> {

    private ArrayList<T> objetos;

    public Deposito() {
        objetos = new ArrayList<>();
    }

    public void addObjeto(T objeto) {
        objetos.add(objeto);
    }

    public T getObjeto() {
        if (!objetos.isEmpty()) {
            return objetos.removeFirst();
        }
        return null;
    }
}