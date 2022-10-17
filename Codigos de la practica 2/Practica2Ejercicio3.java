
import java.util.Scanner;

public class Practica2Ejercicio3 {
    public static void main(String[] args) {
        
        double millas = 0;

        double metros = 1.852;

        double totalDistancia = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número de millas: ");

        millas = sc.nextDouble();

        totalDistancia = millas * metros;

        System.out.println("El número total es: " + totalDistancia + " metros");

        sc.close();

        
    }
}