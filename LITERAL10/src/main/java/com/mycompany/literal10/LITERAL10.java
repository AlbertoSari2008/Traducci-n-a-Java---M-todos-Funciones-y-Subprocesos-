/**
 *
 * @author beto2
 */
package com.mycompany.literal10; 

public class LITERAL10 { // <-- Recuerda que debe coincidir con tu archivo LITERAL10.java

    // 1. Definición del método con dos parámetros enteros y retorno (int)
    public static int mayor(int a, int b) {
        // Evaluamos las variables con una condicional básica
        if (a > b) {
            return a; // Si 'a' es más grande, lo devolvemos inmediatamente
        } else {
            return b; // Si no, significa que 'b' es el mayor o son iguales
        }
    }

    // 2. Método principal para enviar datos y desplegar la respuesta
    public static void main(String[] args) {
        // Variables de prueba
        int num1 = 45;
        int num2 = 82;
        
        System.out.println("============================================");
        System.out.println("          COMPARADOR DE NÚMEROS             ");
        System.out.println("============================================");
        System.out.println("• Primer número:  " + num1);
        System.out.println("• Segundo número: " + num2);
        System.out.println("--------------------------------------------");
        
        // Invocamos al método mayor() y capturamos su valor de retorno
        int elMayor = mayor(num1, num2);
        
        // Mostramos el resultado final recibido en el main
        System.out.println("• El número mayor es: " + elMayor);
        System.out.println("============================================");
    }
}
