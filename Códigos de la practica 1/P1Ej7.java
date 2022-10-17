import java.util.Scanner;

public class P1Ej7 {
    public static void main(String[] args) {

        int num1 = 0, num2 = 0;

        Scanner sc = new Scanner(System.in) ;

        System.out.println("Introduzca el numero 1 ");

        num1 = sc.nextInt();

        System.out.println("Introduce el numero 2 ");

        num2 = sc.nextInt();

        System.out.println("La suma de los dos numeros es: " +  (num1 + num2));

        System.out.println("La resta de los dos numeros es: " + (num1 - num2));

        System.out.println("El producto de los dos numeros es: " + (num1 * num2));

        System.out.println("La división de los dos numeros es: " + (num1 / num2));

        sc.close();


    }
}
