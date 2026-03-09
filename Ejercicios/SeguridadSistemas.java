package Ejercicios;

import java.util.Scanner;

public class SeguridadSistemas {

    public static void main(String[] args) {
        
        // 1. Pide un valor al usuario 
        Scanner leer = new Scanner(System.in);
        String ClaveCorrecta = "@Hola123";

        // 2. intento es el que se encarga almacenar el valor de [leer]
        System.out.println("\n-- CONTROL DE ACCESO --");
        System.out.println("Ingrese su clave: ");
        String intento = leer.nextLine();

        // 3. La toma de decision si el [intento] es igual a [ClaveCorrecta]
        if (intento.equals(ClaveCorrecta)) {
            System.out.println("Acceso CONCEDIDO"); // De ser correcta, Acceso concedido
        
        } else{     // Si [if] es falso, se ejecuta else para la opcion 2 
            System.out.println("ACCESO DENEGADO. intente de nuevo. "); // No coincide la clave, Acceso denegado
        }
    }
}