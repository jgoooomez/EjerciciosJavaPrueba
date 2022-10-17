import java.util.Scanner;

public class P1Ej4 {
    public static void main(String[] args) {
        String nombre = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de la persona");
        nombre = sc.next();
        System.out.println("Bienvenido " + nombre);
        sc.close();
    }
}