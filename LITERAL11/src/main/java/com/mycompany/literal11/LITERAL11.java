/**
 *
 * @author beto2
 */
package com.mycompany.literal11; 

public class LITERAL11 { // <-- Recuerda que debe coincidir con tu archivo LITERAL11.java

    // 1. Definición del método con parámetro int y retorno booleano (true/false)
    public static boolean esPar(int numero) {
        // Si el residuo de dividir para 2 es 0, el número es par
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // 2. Método principal que invoca, recibe y decide qué mostrar
    public static void main(String[] args) {
        // Variable de prueba (puedes cambiar el 26 por un 33 para ver el cambio)
        int numPrueba = 26;
        
        System.out.println("============================================");
        System.out.println("          VERIFICADOR DE NÚMEROS PAR        ");
        System.out.println("============================================");
        System.out.println("• Número a evaluar: " + numPrueba);
        System.out.println("--------------------------------------------");
        
        // Invocamos el método y guardamos el true o false devuelto
        boolean resultadoBooleano = esPar(numPrueba);
        
        // Estructura de control en main() que depende del resultado del método
        if (resultadoBooleano) {
            System.out.println("• Resultado:        El número es PAR.");
        } else {
            System.out.println("• Resultado:        El número es IMPAR.");
        }
        System.out.println("============================================");
    }
}
