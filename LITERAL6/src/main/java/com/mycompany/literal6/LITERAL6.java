/**
 *
 * @author beto2
 */
package com.mycompany.literal6; 

public class LITERAL6 { // <-- Recuerda que debe coincidir con tu archivo LITERAL6.java

    // 1. Definición del método con retorno 'int' y sin parámetros
    public static int obtenerNumero() {
        // Math.random() da un decimal entre 0.0 y 0.999...
        // Al multiplicar por 100 y sumarle 1, logramos el rango de 1 a 100
        int aleatorio = (int) (Math.random() * 100) + 1;
        
        return aleatorio; // Devolvemos el número entero calculado
    }

    // 2. Método principal
    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("          GENERADOR ALEATORIO               ");
        System.out.println("============================================");
        
        // Invocamos al método y guardamos el entero que nos devuelve
        int numeroGenerado = obtenerNumero();
        
        // Mostramos el resultado guardado
        System.out.println("• El número entero generado (1-100) es: " + numeroGenerado);
        System.out.println("============================================");
    }
}
