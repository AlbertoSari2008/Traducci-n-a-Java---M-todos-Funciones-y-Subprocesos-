/**
 *
 * @author beto2
 */
package com.mycompany.literal2; // Ajusta el paquete según tu proyecto en NetBeans

public class LITERAL2 { // <-- Asegúrate de que coincida con tu archivo LITERAL2.java

    // 1. Definición del método (sin parámetros y sin retorno)
    public static void mostrarPares() {
        System.out.println("==================================================");
        System.out.println("            NÚMEROS PARES DEL 2 AL 100            ");
        System.out.println("==================================================");
        
        // Ciclo que inicia en 2, llega hasta 100 y avanza de 2 en 2
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        
        System.out.println(); // Salto de línea estético al finalizar
        System.out.println("==================================================");
    }

    // 2. Método principal que arranca la ejecución
    public static void main(String[] args) {
        // Llamamos al método que creamos arriba
        mostrarPares();
    }
}
