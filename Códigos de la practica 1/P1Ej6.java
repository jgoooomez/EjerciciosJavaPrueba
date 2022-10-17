import java.util.Scanner;


public class P1Ej6 {
    public static void main(String[] args) {

        double radio = 0, area = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el radio");

        radio = sc.nextDouble();

        area = Math.PI * Math.pow(radio,2);

        System.out.println("El area de la círculo es: " + area);

        sc.close();



    }
}
