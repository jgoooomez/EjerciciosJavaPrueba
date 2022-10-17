import java.util.Scanner;







public class Examen8 {

public static void main(String[] args) {

int numero = 0; 

Scanner sc = new Scanner(System.in);

System.out.print("introduzca el numero a invertir");

numero = sc.nextInt();

String numCadena = String.valueOf(numero);

if ( numero > 0 && numero < 9999) {
char n1 = numCadena.charAt(0);
char n2 = numCadena.charAt(1);
char n3 = numCadena.charAt(2);
char n4 = numCadena.charAt(3);
System.out.println("El numero invertido es: ");
System.out.println("" + n4 + n3 + n2 + n1);
} else {
}

sc.close();







}

}