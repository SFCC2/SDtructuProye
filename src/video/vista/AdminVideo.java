/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video.vista;

import java.awt.Graphics2D;
import java.awt.Image;
import java.util.Scanner;
import java.awt.Image;
import javax.swing.ImageIcon;
import video.Lista_generica.Lista;
public class AdminVideo {
    Scanner s= new Scanner(System.in);
    public void imprimir(Lista a){
        if(a!=null){
         System.out.println();
        imprimir(a);
           
        }
    }
    public class Animación{
   private Lista frames;
   private int actualFrame;
   private long tiempoAnimación;
   private long tiempoTotal;
    
   public Animación(){
       
        frames = new Lista();
   tiempoTotal = 0;
   start();
   }
   
   
   public synchronized void start(){
    tiempoAnimación = 0;
    actualFrame = 0;
 }
     
 }
    
    public AppVideo insertar(AppVideo a){
        
       
        
        
        return a;
    }   
}