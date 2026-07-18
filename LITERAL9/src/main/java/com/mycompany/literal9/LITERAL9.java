/**
 *
 * @author beto2
 */
package com.mycompany.literal9; 

public class LITERAL9 { // <-- Recuerda que debe coincidir con tu archivo LITERAL9.java

    // 1. Definición del método con tres parámetros y retorno (double)
    public static double calcularPromedio(double n1, double n2, double n3) {
        double promedio = (n1 + n2 + n3) / 3.0; // Suma de notas dividida para 3
        return promedio; // Devolvemos el promedio calculado al main
    }

    // 2. Método principal para enviar datos, recibir el promedio y evaluar el estado
    public static void main(String[] args) {
        // Valores de prueba para las tres notas
        double nota1 = 8.5;
        double nota2 = 6.5;
        double nota3 = 7.0;
        
        System.out.println("============================================");
        System.out.println("          CONTROL DE PROMEDIOS              ");
        System.out.println("============================================");
        System.out.println("• Nota 1: " + nota1);
        System.out.println("• Nota 2: " + nota2);
        System.out.println("• Nota 3: " + nota3);
        System.out.println("--------------------------------------------");
        
        // Invocamos el método pasando las notas y guardando el retorno
        double promedioFinal = calcularPromedio(nota1, nota2, nota3);
        
        // Mostramos el promedio redondeado o normal (en Java se concatena directo)
        System.out.printf("• Promedio obtenido: %.2f\n", promedioFinal);
        
        // Condicional para evaluar si aprobó (mayor o igual a 7)
        if (promedioFinal >= 7.0) {
            System.out.println("• Estado:            APROBADO");
        } else {
            System.out.println("• Estado:            REPROBADO");
        }
        System.out.println("============================================");
    }
}
