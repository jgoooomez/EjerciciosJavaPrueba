/*5. Diseña un programa Java para resolver una ecuación de primer grado con una
incógnita (x), suponiendo que los coeficientes de la ecuación (C1 y C2) se introducen
desde teclado.
• C1x + C2 = 0
 */


import java.util.Scanner;
public class Practica2Ejercicio5 {
    public static void main(String[] args) {
        
        double x = 0, C1 = 0, C2 = 0;

        System.out.println("Introduzca el C1");

        Scanner sc = new Scanner(System.in);

        C1 = sc.nextDouble();

        System.out.println("Introuzca el C2");

        C2 = sc.nextDouble();

        x = -C2 / C1;

        System.out.println("El resultado de x es: " + x);
        
        sc.close();











    }
}