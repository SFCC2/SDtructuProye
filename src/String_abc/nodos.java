package String_abc;


import String_abc.*;

public class nodos {
    nodos izq;
    nodos der;
    nodos raiz;
    String datos;
    int s;
    public nodos(String datos) {
        this.datos = datos;
    }
    public void insertNods(String elem) {
        if (this.datos.compareToIgnoreCase(elem)>0) {
            if (this.izq == null) {
                this.izq = new nodos(elem);
                izq.raiz = this;
            } else {
                izq.insertNods(elem);
            }

        }
        if (this.datos.compareToIgnoreCase(elem) < 0) {
            if (this.der == null) {

                this.der = new nodos(elem);
                der.raiz = this;
            } else {

                der.insertNods(elem);
            }

        }
    }
    public void inOrder() {

        if (izq != null) {
            izq.inOrder();
        }
        System.out.println(datos);
        if (der != null) {

            der.inOrder();
        }
    }
    public void postOrder() {
        
        if (izq !=null) {
            izq.postOrder();
        }
        
        if (der!=null) {
            der.postOrder();
            
        }
        System.out.println(datos); 
        
    }
  
    public void preOrder(){
        System.out.println(datos);
        if (izq!= null) {
            izq.preOrder();
        }
        if (der != null) {
            der.preOrder();
        }
    }
}

