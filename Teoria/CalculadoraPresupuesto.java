package Teoria;

import java.util.Scanner;

public class CalculadoraPresupuesto {
    public static void main(String[] args) {
        
        /*
            1. Explicando que hace cada parte:
                - [Scanner leer] esta declarando a la variable llamada [leer] con el tipo de dato [Scanner].
                - [new] se le dice al equipo que reserve un espacio de RAM si no esta variable seria un null.
                - [Scanner(...)] es la configuracion del objeto para que sepa como comportarse.
                - [System.in] es un flujo de entrada que esta conectado al teclado. 
        */
        Scanner leer = new Scanner(System.in);

        /*
            2. Explicando que hace cada parte:
                - [System.out.println("...")] Imprime todo lo que este dentro de "" para mostrar en pantalla.
                - [double] el tipo de dato sera con punto decimal para las variables [presupuesto y gastos].
                - [presupuesto y gastos] son las variables que almacenaran los datos ingresados en [leer].
                - [leer.nextDouble] se ordena al objeto [leer] que espere hasta que ingresen un valor tipo double.  
        */
        System.out.println("Ingrese el presupuesto mensual total: ");
        double presupuesto = leer.nextDouble(); 

        System.out.println("Ingresa los gastos fijos: ");
        double gastos = leer.nextDouble();

        /*
            3. Explicando que hace cada parte: 
                - [double] el tipo de dato sera con punto decimal para las variables [presupuesto y gastos].
                - [disponible y porDia] son variables que almacenan operaciones de resta y division.
        */
        double disponible = presupuesto - gastos;
        double porDia = disponible/30;

        /*
            4. Explicando que hace cada parte:
                - [System.out.println("...")] Imprime todo lo que este dentro de "" para mostrar en pantalla.
                - [+] se usa para concatenar lo que se necesite en este caso ("texto" + variable + "texto")
        */
        System.out.println("Te quedan en Q " + disponible + " libres al mes.");
        System.out.println("Puedes gastar maximo de Q " + porDia + " por dia.");
    }   

}