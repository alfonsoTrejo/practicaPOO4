/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica4;
import static com.mycompany.practica4.JuegoWordle.palabra;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;


/**
 *
 * @author molguin
 *
 * Agregar la siguiente linea de codigo en el constructor
 * de la clase Canvas:
 * canvas.addMouseListener(new MiMouseAdapter(this));
 *
 */
public class MiMouseAdapter extends MouseAdapter {
    public static int cont=0;
    private Canvas canvas;
    private ArrayList<Celda> celdas; 
    public static  int num =0;
    private Font fontTitulo=    fontTitulo =new Font("Comic Sans MS", Font.PLAIN, 70);
    private Font fontNormal = fontNormal =new Font("Arial", Font.PLAIN, 30);   
    
    public MiMouseAdapter(Canvas canvas) {
       super();
        this.celdas = new ArrayList<>();
       this.canvas = canvas;
       
    }
    
    /**
     *
     * @param e
     */
    @Override
     public void mouseClicked(MouseEvent e) {
         if(cont ==0){
             
        String letras = "qwertyuiop asdfghjkl zxcvbnm";
         ArrayList<Coordenadas> botones =  new ArrayList<>(letras.length());
        int x = e.getX();
        int y = e.getY();
        char c = ' ';
        for (int i = 0; i < letras.length(); i++) {
            botones.add(new Coordenadas( letras.charAt(i)));
        }
        
        int indicereal=0;
        for (int a = 0; a < 3; a++) {
            for (int i = indicereal; i < letras.length(); i++) {
                int posXRelativa=50;
                int posYRelativa=50;
                 if(' ' == letras.charAt(i)){  
                    i++;
                    indicereal=i;
                    break;
                }
                botones.get(i).setPosX((posXRelativa*(i-(10*a)))+530);
                botones.get(i).setPosY((posYRelativa*a)+130);
                                
                //canvas.fillRectangle(0,0,40,40);   
                
            }
        }
        for (int i = 0; i < 5; i++) {
            celdas.add(new Celda());
        }
        for (int i = 0; i < botones.size(); i++) {               
            if ((botones.get(i).getPosX()< x && botones.get(i).getPosX()+40 > x) && (botones.get(i).getPosY()< y && botones.get(i).getPosY()+40 > y) ) {
                c = botones.get(i).getLetra();
                System.out.println(c);
                celdas.get(num).setValor(c);
                
                num++;
                System.out.println(num);
                if(num == 5 ){
                    num=0;
                    algortimo();
                    dibujarLinea(JuegoWordle.renglon, celdas); 
                    JuegoWordle.renglon++;
                }
            }
    }
    for (int j = 0; j < celdas.size(); j++) {
        celdas.get(j).setColor(new Color(168,168,168));
    }

         }
         
         if(cont ==1)cont=0;
         else cont++;
     }
     
     
   public void dibujarLinea(int renglon, ArrayList<Celda> celdas){
        int posXRelativa=90;
        int posYRelativa=90;
        for (int i = 0; i < 5; i++) {
            canvas.setFont(fontNormal);
            canvas.setForegroundColor(Color.BLACK);
            canvas.fillRectangle((posXRelativa*i)+30,(posYRelativa*renglon)+130,80,80); 
        
            canvas.setForegroundColor(celdas.get(i).getColor());
            canvas.fillRectangle(((posXRelativa)*i)+32, ((posYRelativa)*renglon)+132,76,76);  
            
            canvas.setFont(fontTitulo);
            canvas.setForegroundColor(Color.BLACK);
            canvas.drawString(celdas.get(i).getValor()+"",((posXRelativa)*i)+52,((posYRelativa)*renglon)+192);
            
        }      
    }
    public void algortimo(){ 
        for (int i = 0; i < celdas.size(); i++) {      //intentos
            for (int j = 0; j < palabra.length(); j++) {  //palabra a descubrir
                if (celdas.get(i).getValor() == palabra.charAt(j)){
                    if (i == j) {
                       celdas.get(i).setColor(new Color(128,168,103 ));
                       break;
                    }else{
                       celdas.get(i).setColor(new Color(253,236,111 ));                         
                     break;
                    }
                }    
            }
        }
    }
}
