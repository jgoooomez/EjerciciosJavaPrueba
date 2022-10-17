/* 6. Diseña un programa Java que calcule la suma, resta, multiplicación y división de dos
números introducidos por teclado. Incorpora también las funciones que permitan
realizar la potencia de un número y la raíz cuadrada del otro.
Ejemplo de salida del programa para x=9, y=3:
 */






import java.util.Scanner;

 public class Practica2Ejercicio6 {
    public static void main(String[] args) {
        
        double x = 0, y = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el valor de x");

        x = sc.nextDouble();

        System.out.println("Introuce el valor de y");

        y = sc.nextDouble();

        sc.close();

        System.out.printf("%s\n%s\n" , "El resultado de la suma es: " , (x+y));

        System.out.printf("%s\n%s\n" , "El resultado de la resta es: " , (x-y));

        System.out.printf("%s\n%s\n" , "El resultado de la multiplicación es: " , (x*y));

        System.out.printf("%s\n%s\n" , "El resultado de la división es: " , (x/y));

        System.out.printf("%s\n%s\n" , "El resultado de la potencia de x es: " , (x*x));

        System.out.printf("%s\n%s\n" , "El resultado de la raiz cuadrada de y es: " , (Math.sqrt(y)));


    }
}
