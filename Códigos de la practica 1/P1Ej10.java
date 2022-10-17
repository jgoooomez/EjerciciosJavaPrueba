public class P1Ej10 {
    public static void main(String [] args) {
         /* a) Si un empleado está casado o no. */
         boolean casado = true;

         /* b) Valor máximo no modificable: 999999. */
         final int max = 999999;
 
         /* c) Día de la semana */
         int diasem = 1;
 
         /* d) Día del año. */
         int diaanual = 300;
 
         /* e) Sexo: con dos valores posibles 'V' o 'M' */
         char sexo = 'M';
 
         /* f) Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días. */
         long miliseg = 1298332800000L;
 
         /* g) Almacenar el total de una factura */
         double total_factura =10350.678;
 
         /* h) Población mundial del planeta tierra. */
         long poblacion = 6775235741L;

         /*El valor de las variables es: con Println */

         System.out.println("El valor de la variable casado es: " + casado);
         System.out.println("El valor de la variable max es: " + max);
         System.out.println("El valor de la variable diasem es: " + diasem);
         System.out.println("El valor de la variable diaanual es: " +  diaanual);
         System.out.println("El valor de la variable miliseg es: " + miliseg);
         System.out.println("El valor de la variable totalfactura es: " + total_factura);
         System.out.println("El valor de la variable poblacion es: " + poblacion);
         System.out.println("El valor de la variable sexo es: " + sexo);

         /*Este "sout" es para que a la hora de ejecutar no se junten, no tiene ninguna función, solo organizativo. */
         System.out.println("--------------------------------------------------------------------------");

         /*El valor de las variables es: con Printf */
         System.out.printf("%s\n%s\n" , "El  valor de la variable casado es: " , casado);
         System.out.printf("%s\n%s\n" , "El  valor de la variable max es: " , max);
         System.out.printf("%s\n%s\n" , "El  valor de la variable diasem es: " , diasem);
         System.out.printf("%s\n%s\n" , "El  valor de la variable diaanual es: " , diaanual);
         System.out.printf("%s\n%s\n" , "El  valor de la variable miliseg es: " , miliseg);
         System.out.printf("%s\n%s\n" , "El  valor de la variable totalfactura es: " , total_factura);
         System.out.printf("%s\n%s\n" , "El  valor de la variable poblacion es: " , poblacion);
         System.out.printf("%s\n%s\n" , "El  valor de la variable sexo es: " , sexo);
        
        

        
    }
}