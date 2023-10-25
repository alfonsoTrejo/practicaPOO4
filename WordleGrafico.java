/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica4;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author trejo
 */
public class WordleGrafico {
    private Canvas canvas;
    private Font fontTitulo;
    private Font fontNormal;
    public WordleGrafico(Canvas canvas) {
        fontTitulo =new Font("Comic Sans MS", Font.PLAIN, 70);
        fontNormal =new Font("Arial", Font.PLAIN, 30);
        this.canvas = canvas; 
        canvas.setFont(fontTitulo);
        canvas.drawString("WORDLE", 100, 80);
    }
    public void dibujarLinea( ArrayList<Celda> celdas){
        int posXRelativa=90;
        int posYRelativa=90;
        for (int i = 0; i < 5; i++) {
            canvas.setFont(fontNormal);
            canvas.setForegroundColor(Color.BLACK);
            canvas.fillRectangle((posXRelativa*i)+30,(posYRelativa*JuegoWordle.renglon)+130,80,80); 
        
            canvas.setForegroundColor(celdas.get(i).getColor());
            canvas.fillRectangle(((posXRelativa)*i)+32, ((posYRelativa)*JuegoWordle.renglon)+132,76,76);  
            
            canvas.setFont(fontTitulo);
            canvas.setForegroundColor(Color.BLACK);
            canvas.drawString(celdas.get(i).getValor()+"",((posXRelativa)*i)+52,((posYRelativa)*JuegoWordle.renglon)+192);
            
        }      
    }
    public void dibujarTeclado(HashMap<String,Color> teclado, ArrayList<Celda> celdas){   
        String letras="qwertyuiop asdfghjkl zxcvbnm";
        Color verde = new Color(128, 168, 103)   ;  // verde
        Color amariilo = new Color(253,236,111 );   //    amarillo
        Color gris = new Color(136,136,136 );       //  gris

        for (int i = 0; i < celdas.size(); i++) { 
            if(teclado.get(celdas.get(i).getValor()+"" ).equals(gris)) {
               teclado.put(celdas.get(i).getValor()+"",celdas.get(i).getColor());
            }else if (teclado.get(celdas.get(i).getValor()+"" ).equals(amariilo) ){
                if(celdas.get(i).getColor().equals(verde) ){
                    teclado.put(celdas.get(i).getValor()+"",celdas.get(i).getColor());
                }
            }
        }
        
        int indicereal=0;
        for (int renglon = 0; renglon < 3; renglon++) {
            for (int i = indicereal; i < letras.length(); i++) {
            int posXRelativa=50;
            int posYRelativa=50;
            if(' ' == letras.charAt(i)){
                
                i++;
                indicereal=i;
                break;
            }
         
                canvas.setFont(fontNormal);
                canvas.setForegroundColor(Color.BLACK);
                canvas.fillRectangle((posXRelativa*(i-(10*renglon)))+530,(posYRelativa*renglon)+130,40,40); 

                canvas.setForegroundColor(teclado.get(letras.charAt(i)+""));
                canvas.fillRectangle(((posXRelativa)*(i-(10*renglon)))+532, ((posYRelativa)*renglon)+132,36,36);  

                canvas.setFont(fontNormal);
                canvas.setForegroundColor(Color.BLACK);
                canvas.drawString(letras.charAt(i)+"",((posXRelativa)*(i-(10*renglon)))+542,((posYRelativa)*renglon)+158);
            
            }
        }
        for (int i = 0; i < celdas.size(); i++) {
            celdas.get(i).setColor(new Color(136,136,136));
        }
    }
}
