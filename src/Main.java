import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Inicializar objetos a utilizar
        Expendedor exp = new Expendedor(5,1000);
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
    }
}



