import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*/ Test dulce independiente
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
        } */

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
        Moneda moneda = null;
        Expendedor expendedor = null;
        Comprador comprador = null;

        System.out.println("\n----Intentar comprar producto sin dinero suficiente:----\n");

        moneda = new Moneda100();
        expendedor = new Expendedor(1);
        try {
            comprador = new Comprador(moneda, ProductoTipo.COCA.getNumero(), expendedor);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n----Intentar comprar producto sin moneda:----\n");

        moneda = null;
        expendedor = new Expendedor(1);
        try {
            new Comprador(null, ProductoTipo.FANTA.getNumero(), expendedor);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n----Intentar comprar producto con deposito vacio:----\n");

        moneda = new Moneda1500();
        expendedor = new Expendedor(0);
        try {
            comprador = new Comprador(moneda, ProductoTipo.SNICKERS.getNumero(), expendedor);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n----Intentar comprar producto que no existe:----\n");

        moneda = new Moneda1500();
        expendedor = new Expendedor(1);
        try {
            comprador = new Comprador(moneda, 123, expendedor);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n----Intentar comprar producto con dinero justo para el precio:----\n");

        moneda = new Moneda500();
        expendedor = new Expendedor(1);
        ProductoTipo producto = ProductoTipo.SUPER8;
        try {
            comprador = new Comprador(moneda, producto.getNumero(), expendedor);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Valor de la moneda: " + moneda.getValor());
        System.out.println("Precio del producto: " + producto.getPrecio());
        System.out.println("Consumió " + comprador.queConsumiste() + ". Vuelto: $" + comprador.cuantoVuelto());

        System.out.println("\n----Intentar comprar producto con dinero de sobra:----\n");

        moneda = new Moneda1500();
        expendedor = new Expendedor(1);
        try {
            comprador = new Comprador(moneda, ProductoTipo.SPRITE.getNumero(), expendedor);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Valor de la moneda: " + moneda.getValor());
        System.out.println("Precio del producto: " + ProductoTipo.SPRITE.getPrecio());
        System.out.println("Consumió " + comprador.queConsumiste() + ". Vuelto: $" + comprador.cuantoVuelto());

        System.out.println("\n----Probar enumeración----\n");

        System.out.println(ProductoTipo.COCA.getNumero() + ", " + ProductoTipo.COCA.toString() + ", $" + ProductoTipo.COCA.getPrecio());
        System.out.println(ProductoTipo.FANTA.getNumero() + ", " + ProductoTipo.FANTA.toString() + ", $" + ProductoTipo.FANTA.getPrecio());
        System.out.println(ProductoTipo.SPRITE.getNumero() + ", " + ProductoTipo.SPRITE.toString() + ", $" + ProductoTipo.SPRITE.getPrecio());
        System.out.println(ProductoTipo.SNICKERS.getNumero() + ", " + ProductoTipo.SNICKERS.toString() + ", $" + ProductoTipo.SNICKERS.getPrecio());
        System.out.println(ProductoTipo.SUPER8.getNumero() + ", " + ProductoTipo.SUPER8.toString() + ", $" + ProductoTipo.SUPER8.getPrecio());

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



