/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica4;
import java.awt.Color;
import java.awt.Font;
/**
 *
 * @author molguin
 */
public class practica4 {
    static public void main(String[] args) {
        ITeclado teclado = new TecladoConsola();
        Canvas canvas = new Canvas("WORDLE"); 
        WordleGrafico grafico = new WordleGrafico(canvas);
        JuegoWordle juego = new JuegoWordle( teclado,grafico);
        
        juego.jugar();
       // DrawDemo demo = new DrawDemo();        

       
    } 
}