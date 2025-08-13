import java.util.Scanner;

public class CajaFruteria {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 

        final double PRECIO_MANZANA = 1000;
        final double PRECIO_BANANO = 800;
        final double DISCOUNT = 10;

        double numappl, numbnn;

        System.out.println("Cuantas manzanas vas a llevar? ");
        numappl = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Y de bananos cuanto? ");
        numbnn = entrada.nextDouble();
        entrada.nextLine();

        double subttlappl = multiplicar(numappl, PRECIO_MANZANA);
        double subttlbnn = multiplicar(numbnn, PRECIO_BANANO);
        
        double subttl = sumar(subttlappl, subttlbnn);
        
        double discount = multiplicar(subttl, DISCOUNT / 100);
        
        double ttl = restar(subttl, discount);

        System.out.println("-------LLevas " + numappl + " manzanas por " + subttlappl + "-------");
        System.out.println("-------LLevas " + numbnn + " bananos por " + subttlbnn + "-------");
        System.out.println("-------Subtotal = " + subttl + "-------");
        System.out.println("-------Por ser un cliente constante de aplicaremos un descuento del 10% en tu compra!! -------");
        System.out.println("-------Total = " + ttl + "-------");

    }

    public static double sumar(double a, double b) {
        double suma = a + b;
        return suma;
    }
    public static double restar(double a, double b) {
        double resta = a - b;
        return resta;
    }
    public static double multiplicar(double a, double b) {
        double multiplicacion = a * b;
        return multiplicacion;
    }

}