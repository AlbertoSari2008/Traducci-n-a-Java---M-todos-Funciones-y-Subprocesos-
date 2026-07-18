/**
 *
 * @author beto2
 */
package com.mycompany.literal3; 

public class LITERAL3 { // <-- Recuerda que debe coincidir con tu archivo LITERAL3.java

    // 1. Definición del método con su parámetro (el tipo de dato String)
    public static void saludar(String nombre) {
        System.out.println("============================================");
        System.out.println("Bienvenido " + nombre + ".");
        System.out.println("============================================");
    }

    // 2. Método principal que ejecuta la acción
    public static void main(String[] args) {
        // Enviamos "Alberto" como argumento al método saludar
        saludar("Alberto");
    }
}
