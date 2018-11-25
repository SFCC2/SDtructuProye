package String_abc;



import String_abc.*;


public class main {
    public static void main(String[] args) {
        String dividir = "[ ,.;()\n]+";
        String frase ="Rama del saber humano constituida por el conjunto de conocimientos objetivos y verificables sobre una materia determinada que son obtenidos mediante la observación y la experimentación, la explicación de sus principios y causas y la formulación y verificación de hipótesis y se caracteriza, además, por la utilización de una metodología adecuada para el objeto de estudio y la sistematización de los conocimientos." ;
        String[] s;
        s = frase.split(dividir);
        nodos e = new nodos(s[0]);
        for (String item : s) {
            e.insertNods(item);
        }
        e.inOrder();
    }
}
//para el domingo  27 agosto 
//mundial  con lista
//Arbpñes de String 
//editor de video
//arbol sintatico