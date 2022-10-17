import java.util.Scanner;
public class Practica2Ejercicio1 {
public static void main(String [] args) {

    double area = 0, radio = 0, longitud = 0, volumen = 0;
    
    System.out.print("Introduce el radio ");

    Scanner entrada = new Scanner(System.in);

        radio = entrada.nextInt();

        longitud = Math.PI * radio *2;

        System.out.println("La longitud es: " + longitud);

        area = Math.PI * Math.pow(radio,2);

        System.out.println("El area del circulo es: " + area);

        volumen = (4/3) * Math.PI * Math.pow(radio, 3);

        System.out.println("El volumen es: " + volumen);

        entrada.close();
}
}