/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicior10;

/**
 *
 * @author Pc
 */
public class Estudiante {
    int ni;
    double est, pat, pagmat;
    String nombre, apellido;
    
    public static double obtener_pagmat(double pat, double est) {
        double pagmat = 50000;
        if ((pat>2000000) && (est>3)) {
            return pagmat + (0.03*pat);
            }
        else {
            return pagmat;
        }
        
        
    }
}
