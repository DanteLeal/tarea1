import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Test dulce independiente
        Snickers test = new Snickers(64);
        System.out.println("ID: "+ test.getSerie());
        System.out.println("Sabor: "+ test.getSabor());

        // Test deposito independiente
        Deposito<Fanta> fantas= new Deposito<Fanta>();
        for (int i = 0; i < 6; i++) {
            fantas.addObjeto(new Fanta(200+i));
        }
        Producto producto = fantas.getObjeto();
        while (producto != null) {
            System.out.println(producto.getSabor() + "[ID: " + producto.getSerie() + "]" + "[Precio: " + ProductoTipo.FANTA.getPrecio() + "]");
            producto = fantas.getObjeto();
        }

        // Test sort de monedas
        ArrayList<Moneda> monedas = new ArrayList<>();
        monedas.add(new Moneda500());
        monedas.add(new Moneda1500());
        monedas.add(new Moneda1500());
        monedas.add(new Moneda1000());
        monedas.add(new Moneda100());
        monedas.add(new Moneda500());
        monedas.add(new Moneda1000());
        monedas.add(new Moneda100());
        
        System.out.println("\n----Monedas sin ordenar----\n");
        for (int i = 0; i < monedas.size(); i++) {
            System.out.println(monedas.get(i).toString());
        }

        // Ordenar las monedas
        monedas.sort(null);

        // Mostrar monedas ordenadas
        System.out.println("\n----Monedas ordenadas:----\n");
        for (int i = 0; i < monedas.size(); i++) {
            System.out.println(monedas.get(i).toString());
        }

        // Test de excepciones
        System.out.println("\n----Intentar comprar producto sin dinero suficiente:----\n");

        Expendedor expendedor = new Expendedor(5);
        Moneda moneda = new Moneda500();
        System.out.println("Valor de la moneda: $" + moneda.getValor());
        System.out.println("Precio de producto: $" + ProductoTipo.COCA.getPrecio());

        try {
            Comprador comprador = new Comprador(moneda, ProductoTipo.COCA.getNumero(), expendedor);
            System.out.println("Precio de producto: " + ProductoTipo.COCA.getPrecio());
            System.out.println("Bebida comprada: " + comprador.queBebiste());
            System.out.println("Vuelto: " + comprador.cuantoVuelto());
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n----Intentar comprar producto sin moneda:----\n");

        try {
            Comprador comprador = new Comprador(null, ProductoTipo.FANTA.getNumero(), expendedor);
            System.out.println("Precio de producto: " + ProductoTipo.FANTA.getPrecio());
            System.out.println("Bebida comprada: " + comprador.queBebiste());
            System.out.println("Vuelto: " + comprador.cuantoVuelto());
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n----Intentar comprar producto con deposito vacio:----\n");

        // Expendedor sin productos
        expendedor = new Expendedor(0);

        System.out.println("Valor de la moneda: $" + moneda.getValor());
        System.out.println("Precio de producto: $" + ProductoTipo.SNICKERS.getPrecio());

        try {
            Comprador comprador = new Comprador(moneda, ProductoTipo.SNICKERS.getNumero(), expendedor);
            System.out.println("Precio de producto: " + ProductoTipo.SNICKERS.getPrecio());
            System.out.println("Bebida comprada: " + comprador.queBebiste());
            System.out.println("Vuelto: " + comprador.cuantoVuelto());
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n----Intentar comprar producto inexistente:----\n");

        try {
            Comprador comprador = new Comprador(moneda, 132, expendedor);
            System.out.println("Precio de producto: " + ProductoTipo.SNICKERS.getPrecio());
            System.out.println("Bebida comprada: " + comprador.queBebiste());
            System.out.println("Vuelto: " + comprador.cuantoVuelto());
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }

        /*

        // Inicializar objetos a utilizar
        Expendedor exp = new Expendedor(5);
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

        */
    }
}



