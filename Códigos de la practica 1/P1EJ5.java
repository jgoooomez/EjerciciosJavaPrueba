import java.util.Scanner;

public class P1EJ5 {
    public static void main(String[] args) {
        
        int lado = 0, area = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la longitud del lado ");

        lado = sc.nextInt();

        area = lado * lado;

        System.out.println("El area del cuadrado es: " + area);

        sc.close();
        

        
    }
}
