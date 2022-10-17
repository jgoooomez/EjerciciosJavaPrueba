/* 4. Diseña un programa Java que cree un tipo enumerado para los meses del año. El
programa debe realizar las siguientes operaciones:
• Crear una variable m del tipo enumerado y asignarle el mes de marzo.
Mostrar por pantalla su valor.
 */
public class Practica2Ejercicio4 {

    public static void main(String [] args) {

        enum m {enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre}

        System.out.println("El valor de m es el siguiente: " + m.marzo);
    }
}