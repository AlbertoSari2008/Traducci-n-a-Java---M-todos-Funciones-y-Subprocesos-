/**
 *
 * @author beto2
 */
package com.mycompany.literal4; 

public class LITERAL4 { // <-- Recuerda que debe coincidir con tu archivo LITERAL4.java

    // 1. Definición del método con dos parámetros y sin retorno (void)
    public static void mostrarDatos(String nombre, int edad) {
        System.out.println("============================================");
        System.out.println("               DATOS PERSONALES             ");
        System.out.println("============================================");
        System.out.println("• Nombre: " + nombre);
        System.out.println("• Edad:   " + edad + " años");
        
        // Estructura de control para determinar la mayoría de edad (18 o más)
        if (edad >= 18) {
            System.out.println("• Estado: Es mayor de edad");
        } else {
            System.out.println("• Estado: Es menor de edad");
        }
        System.out.println("============================================");
    }

    // 2. Método principal que invoca al método de prueba
    public static void main(String[] args) {
        // Hacemos la llamada pasando tu nombre y exactamente 18 años
        mostrarDatos("Jorge Alberto", 18);
    }
}
