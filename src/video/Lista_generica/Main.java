package video.Lista_generica;

/**
 * permite de todo
 */

public class Main {
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();
        
        System.out.println("<<-- Ejemplo de lista simple -->>\n");
        
        // Agregar al final de la lista
        lista.agregarAlFinal("hola");
        lista.agregarAlFinal("estaba");
        lista.agregarAlFinal("soleado");
        // Agregar in inicio de la lista
        lista.agregarAlInicio("aviom");
        lista.agregarAlInicio("volafr");
        lista.agregarAlInicio("t");
        
        
        double t = 2.7;String y = String.valueOf(t);
        
        lista.agregarAlFinal(y);
        
        System.out.println("<<-- Lista -->>");
        lista.listar();
 
        
        System.out.println("\nInsrta un nodo con valor  16 despues del 15");
        int num = 16;String ruta = String.valueOf(num);
        lista.insertarPorReferencia(15, ruta);
        lista.listar();
            
     ;
        
        System.out.println("\nElimina el nodo con el valor 41");
        lista.removerPorReferencia("chao");        
        lista.listar();

        ///consultar si la imagen existe
        System.out.println("\nConsulta si existe el valor 30");
        System.out.println(lista.buscar('j'));
   
        
        System.out.println("\n\n<<-- Fin de ejemplo lista simple -->>");
    }   
}