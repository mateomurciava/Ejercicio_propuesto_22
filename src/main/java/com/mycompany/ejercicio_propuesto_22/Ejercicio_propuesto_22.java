/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_propuesto_22;

import java.util.Scanner;
public class Ejercicio_propuesto_22 {
    
    String Nombre;
    double Salario_hora;
    int Horas;
    double Salario_mensual = Salario_hora * Horas;
    
    Ejercicio_propuesto_22 (String Nombre, double Salario_hora, double Salario_mensual, int Horas){
        this.Horas = Horas;
        this.Nombre = Nombre;
        this.Salario_hora = Salario_hora;
        this.Salario_mensual = Salario_mensual;
    }
    
    String Calculo(){
        if (Salario_mensual > 450000) {

            return ("Nombre: " + Nombre + ", Salario mensual: $" + String.format("%.2f", Salario_mensual));
        } else {

            return ("Nombre: " + Nombre);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    graphic_P22 ventana = new graphic_P22();
    ventana.show(true);
    }
    
}