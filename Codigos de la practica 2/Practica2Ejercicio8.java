


import java.util.Scanner;

public class Practica2Ejercicio8 {
    public static void main(String[] args) {
        
        int numero = 0;
    
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un numero");

        numero = sc.nextInt();
        
        String numCadena = String.valueOf(numero);
        
        if (numero < 0 || numero > 9999) {
            System.out.println("Error, el numero debe ser entre 0 y 9999");
        } 
        if (numero > 0 && numero <= 9) {
            System.out.println(numero + " No se puede invertir");
        }
        if (numero > 9 && numero <= 99) {
            char n1 = numCadena.charAt(0);
            char n2 = numCadena.charAt(1);
            System.out.println("" + n2 +n1);
            
        } else if (numero > 99 && numero <= 999) {
            char n1 = numCadena.charAt(0);
            char n2 = numCadena.charAt(1);
            char n3 = numCadena.charAt(2);
            System.out.println("" + n3 + n2 +n1); {

        }

    }
        if (numero > 999 && numero <= 9999) {
            char n1 = numCadena.charAt(0);
            char n2 = numCadena.charAt(1);
            char n3 = numCadena.charAt(2);
            char n4 = numCadena.charAt(3);
            System.out.println("" + n4 + n3 + n2 +n1);
        }
    }
}