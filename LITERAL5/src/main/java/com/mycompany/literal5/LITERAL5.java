/**
 *
 * @author beto2
 */
package com.mycompany.literal5; 

public class LITERAL5 { // <-- Recuerda que debe coincidir con tu archivo LITERAL5.java

    // 1. Definición del método con dos parámetros y sin retorno (void)
    public static void operaciones(double a, double b) {
        System.out.println("============================================");
        System.out.println("          RESULTADOS CALCULADORA            ");
        System.out.println("============================================");
        System.out.println("• Número A: " + a);
        System.out.println("• Número B: " + b);
        System.out.println("--------------------------------------------");
        
        // Operaciones aritméticas básicas
        System.out.println("• Suma (A + B):           " + (a + b));
        System.out.println("• Resta (A - B):          " + (a - b));
        System.out.println("• Multiplicación (A * B): " + (a * b));
        
        // Controlamos la división para evitar indeterminaciones si B fuera 0
        if (b != 0) {
            System.out.println("• División (A / B):       " + (a / b));
        } else {
            System.out.println("• División (A / B):       Error (División por cero)");
        }
        
        System.out.println("============================================");
    }

    // 2. Método principal para probar el funcionamiento
    public static void main(String[] args) {
        // Hacemos la llamada pasando dos números de prueba (ejemplo: 12.5 y 4.0)
        operaciones(12.5, 4.0);
    }
}
