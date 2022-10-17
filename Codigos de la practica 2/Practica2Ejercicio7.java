/*7. Diseña un programa Java para leer las longitudes de los lados de un triángulo (L1,
L2, L3) y calcular el área del mismo de acuerdo con la siguiente fórmula:
 */




import java.util.Scanner;

public class Practica2Ejercicio7 {
    public static void main(String[] args) {
         
        double L1 = 0, L2 = 0, L3 = 0, area = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza el lado 1");

        L1 = sc.nextDouble();

        System.out.println("Introduzca el lado 2");

        L2 = sc.nextDouble();

        System.out.println("Introduzca el lado 3");

        L3 = sc.nextDouble();

        sc.close();

        double sp = (L1 + L2 + L3) / 2;

        area = Math.sqrt(sp * ((sp-L1) * (sp-L2) * (sp-L3)));

        System.out.println("El area del triangulo es: " + area);



    }
}