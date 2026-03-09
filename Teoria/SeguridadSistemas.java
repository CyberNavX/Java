package Teoria;

import java.util.Scanner;

public class SeguridadSistemas {
    public static void main(String[] args) {

        /*
            1. Explicando que hace cada parte:
                - [Scanner leer] esta declarando a la variable [leer] con un tipo de dato [Scanner].
                - [new Scanner(System.in);] es quien nos ayuda a crear un espacio en memoria para que sepa como comportarse 
                    al adquiriri el valor dado por el teclado.
                - [String ClaveCorrecta] almacena cadenas de caracteres (texto), un dato es que, 
                    (String inicia con mayuscula lo cual lo hace un objeto no un tipo primitivo) .
                - ["@Hola123";] es una cadena de caracteres que le es asignado a la variable ClaveCorrecta. 
        */
        Scanner leer = new Scanner(System.in);
        String ClaveCorrecta = "@Hola123";

        /*
            2. Explicando que hace cada parte:
                - [System.out.println("");] Imprime el texto dentro de las "".
                - [\n] es un "Enter", mueve el cursor a la linea siguiente.
                - [String intento] esta declarando la variable intento del tipo String, el espacio de memoria esta reservado
                    exclusivamente para guardar el texto.
                - [leer.nextLine();] da la orden que lea lo ingresado [leer] hasta que se precione ENTER. 
        */
        System.out.println("\n-- CONTROL DE ACCESO --");
        System.out.println("\nIngrese su clave: ");
        String intento = leer.nextLine();


        /*
            3. Explicando que hace cada parte:
                - [if (...){ }] Evalua el resultado de la comparacion, depende de true o false para dar un resultado.
                - [(intento.equals(ClaveCorrecta))] [intento] contiene el valor de [leer] es el responsable de decir ¿que ingreso el ususario?,
                    comparando con el "Operador" [.equals o ==] con [ClaveCorrecta] si son identicos, el acceso es concedido.
                - [System.out.println();] es quien imprime el tipo de respuesta "texto".
                - [else {}] es el camino de respaldo, si la condicion if no se cumple, el programa busca otra opcion [else] contiene el mensaje de error. 
        */
        if (intento.equals(ClaveCorrecta)) {
            System.out.println("Acceso CONCEDIDO");  

        } else{
            System.out.println("ACCESO DENEGADO. intente de nuevo. ");
        }

    }

}
