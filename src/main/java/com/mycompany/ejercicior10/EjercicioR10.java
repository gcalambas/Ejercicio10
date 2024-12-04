/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicior10;

/**
 *
 * @author Pc
 * Ejercicio resuelto Nº 10
Cierta universidad para liquidar el pago de matrícula de un estudiante le exige los
siguientes datos:
• Número de inscripción
• Nombres
• Patrimonio.
• Estrato social.
La universidad cobra un valor constante para cada estudiante de $50.000. Si el patrimonio
es mayor que $2´000.000 y el estrato superior a 3, se le incrementa un porcentaje del 3%
sobre el patrimonio. Hacer un algoritmo que muestre:
• Número de inscripción.
• Nombres.
• Pago de matrícula.
Análisis
Datos de entrada
• Número de inscripción.
• Nombres.
• Patrimonio.
• Estrato social.
Datos de salida
• Número de inscripción.
• Nombres.
• Pago por matrícula.
Proceso
Inicialmente se asume que el valor a pagar es el valor constante $50.000; se hace la
comparación del patrimonio con 2´000.000 y del estrato con tres; en caso de ser cierta la
condición al valor constante se le incrementa el 3% sobre el patrimonio. Este valor
adicional se obtiene multiplicando el patrimonio por 3 y dividiéndolo sobre 100 ó, lo que
sería lo mismo, multiplicar 0,03 por el patrimonio.
Definición de variables
NI: Número de inscripción.
NOM: Nombres.
PAT: Patrimonio.
EST: Estrato social.
PAGMAT: Pago por matrícula.
Algoritmo
INICIO
LEA: NI, NOM, PAT, ES
PAGMAT = 50000
SI (PAT > 2000000) Ù (ES > 3) ENTONCES
PAGMAT = PAGMAT + 0.03 * PAT
FIN_SI
ESCRIBA: “EL ESTUDIANTE CON NUMERO DE INSCRIPCION”, NI,
“Y NOMBRE”, NOM, “DEBE PAGAR: $”, PAGMAT
FIN_INICIO
Prueba de escritorio
Si el registro de entrada de datos está conformado de la siguiente forma:
0001 JUAN PABLO 1´500.000 4
Los valores almacenados en la variable serían:
NI NOM PAT ES PAGMAT
0001 JUAN PABLO 1´500.000 4 50.000
Salida
EL ESTUDIANTE CON NUMERO DE
INSCRIPCION 0001 Y NOMBRE
JUAN PABLO DEBE PAGAR $50.000
 */
import java.util.Scanner;
public class EjercicioR10 {

    public static void main(String[] args) {
        
        int ni, est;
        String nombre, apellido;
        double pat;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del nivel: ");
        ni = entrada.nextInt();
        
        System.out.println("Ingrese el nombre: ");
        nombre = entrada.next();
        
        System.out.println("Ingrese el apellido: ");
        apellido = entrada.next();
        
        System.out.println("Ingrese el valor del patriminio: ");
        pat = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del estrato: ");
        est = entrada.nextInt();
        
        Estudiante.obtener_pagmat(pat, est);
        
        System.out.println(" El estudiante con numero de inscripcion " + ni + " y nombre " + nombre + " " + apellido  + " debe pagar " + Estudiante.obtener_pagmat(pat, est));
    
    }
}
