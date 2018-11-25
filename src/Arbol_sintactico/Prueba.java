/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol_sintactico;

/**
 *
 * @author Sulay2016
 */
public class Prueba {
Tercer_persona p= new Tercer_persona();
     
       String sujeto="i", sujeto1="you",sujeto4="they",sujeto5="we";
       public void conjugar_verbopast(String su, String Sujeto){
        String sue=su;
        char s='s';
        char k='k', t='t',y='y', m='m', e='e', d='d';
        for (int i = 0; i <sue.length(); i++){
            String a=null;
            char letra = sue.charAt(i);
            a=letra+"";
           // System.out.println(a);
            if (sue.charAt(i)==k) {
                su=sue+s;
                System.out.print(su);
                break;
            }else if(su.charAt(i)==t){
                su=sue+s;
                System.out.print(su);
                break;
            }else if(su.charAt(i)==y){
                su=sue+s;
                System.out.print(su);
                break;
            }else if(su.charAt(i)==m){
                su=sue+s;
                System.out.print(su);
                break;
            }else if(su.charAt(i)==e){
                su=sue+s;
                System.out.print(su);
                break;
            }else if(su.charAt(i)==d){
                su=sue+s;
                System.out.print(su);
                break;
            }else {
               p.tercera_persona(Sujeto, su);
               
            }
            
        }
    }
       public static void main(String[] args) {/*
        String sue=JOptionPane.showInputDialog("please introduce a sujeto in this program in the present");
    String su=JOptionPane.showInputDialog("please introduce a verb in this program in the present");*/
           String su="she";
           String a="an";
           String sue="at";
           String sus="study";
           String suse="atym";
           String susea="atyme";
           String suseas="answerd";
           String verbo="go";
           String i="she go a game";
   Prueba escrito= new Prueba();
   
   
   String[] frase= i.split(" ");
   
    for (int j = 0; j < frase.length; j++) {
           
        
       //escrito.articulo(su);
       // escrito.sujeto(su);
       
        System.out.println("");
        escrito.sujeto(su);
        System.out.println("");
        escrito.articulo(frase[j]);
        System.out.println("");
         escrito.conjugar_verbopast( frase[j], su);
        /*
        escrito.conjugar_verbopast(sus,su);
        escrito.conjugar_verbopast(suse,su);
        escrito.conjugar_verbopast(susea,su);
        escrito.conjugar_verbopast(suseas,su);
        escrito.conjugar_verbopast(su,su);*/
        }
    }
         public String articulo(String su){
      String sue=su, aux, aux1;
      String an="an", the="the";
      char a='a';
      for (int i = 0; i < sue.length(); i++) {
           char letra = sue.charAt(i);
            if(sue.equals(an)){
               System.out.println("articulo usado es: "+sue);
               break;
           }else if(sue.equals(the)){
               System.out.println("articulo usado es: "+sue); 
               break;
           }
           else if (sue.charAt(i)==a) {
               aux=sue.charAt(i)+sue; 
               System.out.println("articulo es: "+a);
               break;
           }
       }return su;
}
         public String sujeto(String su){
              String sue=su;
              String he="he",she="she", it="it";
                 switch(su){
                     case "you":
                         System.out.println("sujeto es: "+sujeto1);
                         break;
                     case "they":
                         System.out.println("sujeto es: "+sujeto4);
                         break;
                     case "we":
                         System.out.println("sujeto es: "+sujeto5);
                         break;
                     case "she":
                         System.out.println("sujeto es: "+she);
                         break;
                     case "he":
                         System.out.println("sujeto es: "+he);
                         break;
                     case "it":
                         System.out.println("sujeto es: "+it);
                         break;
                     case "i":
                         System.out.println("sujeto es: "+sujeto);
                         break;
                         
                 }
            return su;
         }
}
