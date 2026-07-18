/**
 *
 * @author beto2
 */
package com.mycompany.literal8; 

public class LITERAL8 { // <-- Recuerda que debe coincidir con tu archivo LITERAL8.java

    // 1. Definición del método con parámetros (base y altura) y retorno (double)
    public static double calcularArea(double base, double altura) {
        double area = base * altura; // Fórmula matemática del rectángulo
        return area; // Devolvemos el valor calculado al main
    }

    // 2. Método principal para enviar los datos y mostrar el resultado
    public static void main(String[] args) {
        // Definimos variables locales con valores de prueba
        double basePrueba = 15.5;
        double alturaPrueba = 4.2;
        
        System.out.println("============================================");
        System.out.println("          ÁREA DE UN RECTÁNGULO             ");
        System.out.println("============================================");
        System.out.println("• Base enviada:   " + basePrueba + " cm");
        System.out.println("• Altura enviada: " + alturaPrueba + " cm");
        System.out.println("--------------------------------------------");
        
        // Invocamos el método pasando los argumentos y guardando el retorno
        double resultadoFinal = calcularArea(basePrueba, alturaPrueba);
        
        // Mostramos el resultado recibido directamente en el main()
        System.out.println("• El área calculada es: " + resultadoFinal + " cm²");
        System.out.println("============================================");
    }
}
