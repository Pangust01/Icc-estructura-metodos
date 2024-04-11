package modelo;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class MetodosOrdenamiento {
    
    //#constructor vacio
    // no tiene void o retorno
    // tiene el mismo nombre de la clase
    // y empieza con mayuscula
    // Se va a ejecutar automaticamente cunado instancie la clase

    /*Metodo que devuelve un arreglo de enteros ordenados por burbuja
     * Metodo que devuelve un arreglo de enteros ordenados por seleccion
     * Metodo que devuelve un arreglo de enteros ordenados por insercion
     * Metodo que imprimine el arreglo
    */
    public int[] sortByBubble(int[] arreglo,boolean logs){
        //Nos da el tamaño de la lista
        int tamanio = arreglo.length;
        //Bucle externo que va a recorrer todo el arreglo
        
        
        for (int i = 0; i < tamanio; i++) {
            
            // Bucle for interno que compara el elemento actual con los siguientes
            for (int j = i+1; j < tamanio; j++) {
                if (logs) {
                    System.out.println("Empezando con el ordanamiento... ");
                    System.out.println("Ahora i="+arreglo[i]+" y j="+arreglo[j]+"\n¿"+arreglo[i]+" es mayor "+" que "+arreglo[j]+"?\n");
                }
                
                if (arreglo[i]>arreglo[j]) {

                    //Intercambia los elementos
                    int temp = arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=temp;
                    if (logs) {
                        System.out.println("Si es mayor, por lo tanto cambio de posicion");
                        sortByArreglo(arreglo);
                        System.out.println();
                    }
                    
                    
                }
            }
        }

        return arreglo;
    }
    public int[] sortBySelection(int[] arreglo){
        int tamanios = arreglo.length;
        for (int i = 0; i < tamanios - 1; i++) {
            // tenemos que encotrar el menor
            int index_menor = i;
            for (int j = i + 1; j < tamanios; j++) {
                if (arreglo[j] < arreglo[index_menor]) {
                    index_menor = j;
                }

            }
            // intercambiar el menor
            int aux = arreglo[index_menor];
            arreglo[index_menor] = arreglo[i];
            arreglo[i] = aux;
        }
        return arreglo;
    }
    public int[] sortByInsertion(int[] arreglo){
        
        return arreglo;
    }
    public void sortByArreglo(int[] arreglo){
        String salida="[";
        for (int i = 0; i < arreglo.length; i++) {
            if (i<arreglo.length-1) {
                salida+=arreglo[i]+",";
            } else {
                salida+=arreglo[i];
            }
        }
        System.out.println("Su arreglo es: "+salida+"]");
    }

}
