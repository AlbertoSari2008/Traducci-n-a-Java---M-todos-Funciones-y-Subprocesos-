/**
 *
 * @author beto2
 */
package com.mycompany.literal1; // <-- Verifica que este sea el nombre de tu paquete en NetBeans

public class LITERAL1 { // <-- Nombre de la clase idéntico a tu archivo LITERAL1.java

    // 1. Definición del método solicitado (sin parámetros y sin retorno 'void')
    public static void bienvenida() {
        System.out.println("============================================");
        System.out.println("         MENSAJE DE BIENVENIDA              ");
        System.out.println("============================================");
        System.out.println("Universidad: Universidad Técnica de Machala");
        System.out.println("Carrera:     Tecnologías de la Información (TICS)");
        System.out.println("Estudiante:  JORGE ALBERTO SARI CRIOLLO");
        System.out.println("============================================");
    }

    // 2. Método principal (Main) que arranca la ejecución del programa
    public static void main(String[] args) {
        // Hacemos la invocación o llamada al método
        bienvenida();
    }
}
