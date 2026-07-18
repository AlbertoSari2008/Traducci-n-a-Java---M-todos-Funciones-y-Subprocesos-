/**
 *
 * @author beto2
 */
package com.mycompany.literal7; 

public class LITERAL7 { // <-- Recuerda que debe coincidir con tu archivo LITERAL7.java

    // 1. Definición del método sin parámetros que retorna un double
    public static double obtenerPI() {
        return 3.1416; // Retorna el valor específico solicitado
    }

    // 2. Método principal para recibir y mostrar el valor
    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("         RECEPCIÓN DEL VALOR DE PI          ");
        System.out.println("============================================");
        
        // Invocamos al método y almacenamos el resultado en una variable double
        double piRecibido = obtenerPI();
        
        // Mostramos en consola el valor recibido
        System.out.println("• El valor de PI recibido es: " + piRecibido);
        System.out.println("============================================");
    }
}
