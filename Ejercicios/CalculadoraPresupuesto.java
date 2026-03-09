package Ejercicios;

import java.util.Scanner;

public class CalculadoraPresupuesto {
    public static void main(String[] args) {
        
        // 1. Lee los dataos ingresados en la variable leer 
        Scanner leer = new Scanner(System.in);

        // 2. Se piden los datos 
        System.out.println("Ingrese el presupuesto mensual total: ");
        double presupuesto = leer.nextDouble(); // Aqui guardamos el valor que se ingresa en Decimal

        System.out.println("Ingresa los gastos fijos: ");
        double gastos = leer.nextDouble();

        // 3. La operacion para que calcule el programa lo que se pide
        double disponible = presupuesto - gastos;
        double porDia = disponible/30;

        // 4. Imprimimos los resultados
        System.out.println("Te quedan en Q " + disponible + " libres al mes.");
        System.out.println("Puedes gastar maximo de Q " + porDia + " por dia.");
    }   

}