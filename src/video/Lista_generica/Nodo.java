package video.Lista_generica;
import javax.swing.ImageIcon;
/**
 * Clase que define los elementos que debe tener un Nodo de la lista.
 * @author xavier
 */
public class Nodo {
    // Variable en la cual se va a guardar el valor.
        private String ruta;

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }
     
    
    // Variable para enlazar los nodos.
    private Nodo siguiente;
    

   
  
    public Nodo getsiguente() {
        return siguiente;
    }
    public void setsiguente(Nodo imagen) {
        this.siguiente = siguiente;
    }
    /**
     * Constructor que inicializamos el valor de las variables.
     */
  

   
}
