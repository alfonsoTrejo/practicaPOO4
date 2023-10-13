/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica4;

import java.awt.Color;

/**
 *
 * @author trejo
 */
public class Celda {
        private char valor;
        private Color color;
        private int posicion; 

    public Celda() {
        this.valor = ' ';
        this.color = new Color(136,136,136);
       // this.color = "#888888";
    }
    
    
    public char getValor() {
        return valor;
    }

    public void setValor(char valor) {
        this.valor = valor;
    }

    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}
