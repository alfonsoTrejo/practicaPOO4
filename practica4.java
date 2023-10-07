/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica4;

/**
 *
 * @author molguin
 */
public class practica4 {
    static public void main(String[] args) {
        ITablero tablero = new TableroHolografico();
        ITeclado teclado = new TecladoConsola();
        JuegoWordle juego = new JuegoWordle(tablero, teclado);
        
        juego.jugar();
    } 
}