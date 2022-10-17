import java.util.Scanner;
public class Practica2Ejercicio2{
public static void main(String [] args) {

    double precioArticulo = 0, precioFijo = 0, descuentoAplicado = 0;

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el precio fijo del articulo: ");

    precioArticulo = sc.nextDouble();

    System.out.println("Introduce el precio de venta del articulo: ");

    precioFijo= sc.nextDouble();

    System.out.println();

    sc.close();

    descuentoAplicado = 100 - precioFijo * 100 / precioArticulo;

    System.out.println("El descuento aplicado es del: " + descuentoAplicado + "%");
}
}