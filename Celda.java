/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica4;

/**
 *
 * @author trejo
 */
public class Celda {
        private char valor;
        private String color;

    public Celda() {
        this.valor = ' ';
        this.color = "gris";
       // this.color = "#888888";
    }
    
    public char getValor() {
        return valor;
    }

    public void setValor(char valor) {
        this.valor = valor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
