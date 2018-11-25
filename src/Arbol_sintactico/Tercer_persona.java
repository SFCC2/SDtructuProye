/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol_sintactico;

/**
 *
 * @author Asus-PC
 */
public class Tercer_persona {
     String sujeto2="she", sujeto3="he",sujeto4="they";
       String sujeto5="we", sujeto6="it"; 
       String s="s", es="es";
       String studies="studies",study="study",Cry="cry",
               cry="cries",tri="tries",Try="try",spy="spies",Spy="spy",fly="flies", Fly="fly";
       public void tercera_persona(String sujetos, String verbo){
          switch(sujetos){
              case "she":
                  String t=verbo;
                  for (int i = 0; i < verbo.length(); i++) {
                      String a = null;
                      char letra = t.charAt(i);
                      a=letra+"";
                      System.out.println(a);
                      if ((t.charAt(i)=='d')) {
                          System.out.println("nada");
                          
                      }else{
                          verb_regular(sujetos, verbo);
                      }
                   }
                 break;
              case "he":
                  verb_regular(sujetos, verbo);
                  break;
              case "it":
                  verb_regular(sujetos, verbo);
                  break;
          }
       }
    
      public void verb_regular(String sujetos, String verbo){
              switch(verbo){
                  case "study":
                      verbo=studies;
                      System.out.println(sujetos+" "+verbo);
                      break;
                  case "cry":
                      verbo=cry;
                      System.out.println(sujetos+" "+verbo);
                      break;
                  case "spy":
                      verbo=spy;
                      System.out.println(sujetos+" "+verbo);
                      break;
                  case "fly":
                      verbo=fly;
                      System.out.println(sujetos+" "+verbo);
                      break;
                      default:
                         verb_irregualr(sujetos, verbo);
                          //o_es(sujetos, verbo);
                          break;
              
          }
     }
    
     public void verb_irregualr( String sujetos, String verbo){
         String sue=verbo;
         char o='o',h='h',x='x',s='s';
         String es="es";
             for (int i = 0; i < verbo.length(); i++) {
                 String a = null;
                  char letra = sue.charAt(i);
                  a=letra+"";
                  System.out.println(a);
                  if ((sue.charAt(i)==o)) {
                     verbo=sue+es;
                     System.out.println(sujetos+" "+verbo);
                     break;
                  } else if ((sue.charAt(i)==h)) {
                     verbo=sue+es;
                     System.out.println(sujetos+" "+verbo);
                     break;
                  }else if ((sue.charAt(i)==x)) {
                     verbo=sue+es;
                     System.out.println(sujetos+" "+verbo);
                     break;
                  }else if ((sue.charAt(i)==s)) {
                     verbo=sue+es;
                     System.out.println(sujetos+" "+verbo);
                     break;
                  }
             }
     }
     
    
        
    
 
    public static void main(String[] args) {
        Tercer_persona p= new Tercer_persona();
       String sujetos="it", verbo="go";
      // p.it(sujetos, verbo);
        
   String sujeto="she", verbos="spy";
      // p.it(sujeto, verbos);
        System.out.println("usando normal funcion");
       // p.conjugar_verbopast(verbos);
        System.out.println();
      p.tercera_persona(sujeto, verbos);
       //
      // p.normal(sujeto, verbos);
    }
}
