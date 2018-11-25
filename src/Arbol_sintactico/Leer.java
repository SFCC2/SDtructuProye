/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol_sintactico;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus-PC
 */
public class Leer {
    char a='i';
       String sujeto1="you",sujeto2="she", sujeto3="he",sujeto4="they";
       String sujeto5="we", sujeto6="it";   
    
     public void phrase(){
        String cadena = "sdfsadfasf";
for (int i = 0; i < cadena.length(); i++){
    char letra = cadena.charAt(i);
    //Tratamiento del caracter
}
     }
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido al programa frase version: 1.0");
    
    String su=JOptionPane.showInputDialog("please introduce a verb in this program in the present");
   Leer escrito= new Leer();
  //escrito.articulo(su);
  // escrito.sujeto(su);
    }
    
   
    
    
        /**
    *mundial
    * editor de video
    * ordenabecedario de un texto ESTA ESTA EN FUTBOL NODO STRING
    * 
    * arbol sintactico ORGANIZAR FRASE,
    */
    
   public String articulo(String su){
      String sue=su, aux, aux1;
      String an="an", the="the";
      char a='a';
      for (int i = 0; i < sue.length(); i++) {
           char letra = sue.charAt(i);
           if (sue.charAt(i)==a) {
               aux=sue.charAt(i)+sue; 
               System.out.println("articulo es: "+a);
           } else if(sue.equals(an)){
               System.out.println("articulo usado es: "+sue);
           }else if(sue.equals(the)){
               System.out.println("articulo usado es: "+sue); 
           }
       }return su;
}

   public String sujeto(String sue){ 
       
       for (int i = 0; i < sue.length(); i++) {
          char letra = sue.charAt(i);
          if (sue.charAt(i)==a) {
              System.out.println("sujeto: "+sue);
           }else{
              if (sue.equals(sujeto1)) {
                  System.out.println("sujeto: "+sujeto1);
                  break;
              }else if(sue.equals(sujeto2)){
                  System.out.println("sujeto: "+sujeto2);
                  break;
              }else if (sue.equals(sujeto3)){
                  System.out.println("sujeto: "+sujeto3);
                  break;
              }else if(sue.equals(sujeto4)){
                  System.out.println("sujeto: "+sujeto4);
                  break;
              }else if(sue.equals(sujeto5)){
                  System.out.println("sujeto: "+sujeto5);
                  break;
              }else if(sue.equals(sujeto6)){
                  System.out.println("sujeto: "+sujeto6);
                  break;
              }
          }
       }return sue;
   }

}