package modelo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        // crear un objeto, una instancia al objeto
        MetodosOrdenamiento arreglo = new MetodosOrdenamiento();
        // creo un arreglo
        int[] num = { 8, 7, 3, 2, 1 };
        boolean op = true;
        // imprimo mi arreglo
        arreglo.sortByArreglo(num);

        // TODO: hacer un menu que elija el metodo

        do {
            System.out.println("""
                    Digame que metodo desea usar para ordenar el arreglo:
                        1. Metodo Burbuja
                        2. Metodo por Seleccion
                        3. Metodo por Insercion
                        4. Salir del programa
                    """);
            int option = teclado.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Bienvenido al programa de ordenamiento por metodo burbuja\n");
                    // ordena mi arreglo
                    int[] arregloOrdenado = arreglo.sortByBubble(num, true);
                    // imprime el arreglo ordenado
                    arreglo.sortByArreglo(arregloOrdenado);
                    op=false;
                    break;
                case 2:
                    System.out.println("Bienvenido al programa de ordenamiento por metodo seleccion");
                    op=false;
                    break;
                case 3:
                    System.out.println("Bienvenido al programa de ordenamiento por metodo insercion");
                    op=false;
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    op=false;
                    break;

                default:
                    System.out.println("Digite solo del 1 al 4");
                    break;
            }
        } while (op);

        teclado.close();

    }
}
