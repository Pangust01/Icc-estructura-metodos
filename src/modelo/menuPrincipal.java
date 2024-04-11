package modelo;

import java.util.Scanner;

public class menuPrincipal {
    private int option;
    private final Scanner scaner;

    public menuPrincipal(Scanner scaner) {
        this.scaner = scaner;
        scaner = new Scanner(System.in);

    }

    public void menuInicial() {
        int tamanio = 0;
        int[] num = new int[tamanio];

        do {
            System.out.println("""
                    Menu principal: (escoja un numero del 0 al 2)
                        1. Insertar un arreglo.
                        2. Escoger metodo de ordenamiento.
                        0. Salir.
                    """);
            option = scaner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Inserte el tamaño del arreglo:\n");
                    tamanio = scaner.nextInt();
                    num = new int[tamanio];
                    for (int i = 0; i < num.length; i++) {
                        System.out.println("Inserte un numero para la posicion " + i + ": \n");
                        int datosArreglo = scaner.nextInt();
                        num[i] = datosArreglo;

                    }
                    break;
                case 2:
                    if (tamanio != 0) {
                        menuMetodo(num);
                    } else {
                        System.out.println("No se ha inicializado un arreglo.\nInicialize un arrgelo primero");
                    }

                    break;
                case 0:
                    System.out.println("Saliendo del programa");

                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (option != 0);
        scaner.close();
    }

    public void menuMetodo(int[] num) {
        MetodosOrdenamiento arreglo = new MetodosOrdenamiento();
        int op;
        do {
            System.out.println("""
                    Digame que metodo desea usar para ordenar el arreglo:
                        1. Metodo Burbuja
                        2. Metodo por Seleccion
                        3. Metodo por Insercion
                        4. Regresar al menu principal
                    """);
            op = scaner.nextInt();
            switch (op) {
                case 1:

                    System.out.println("Bienvenido al programa de ordenamiento por metodo burbuja\n");
                    System.out.println("¿Quiere ver el proceso del ordenamiento?:(escoja 1 y 2) \n1. Si \n2. No");
                    int procesoVer = scaner.nextInt();
                    // ordena mi arreglo

                    if (procesoVer == 1) {
                        int[] arregloOrdenadoBubble = arreglo.sortByBubble(num, true);
                        // imprime el arreglo ordenado
                        arreglo.sortByArreglo(arregloOrdenadoBubble);
                    }
                    if (procesoVer == 2) {
                        int[] arregloOrdenado = arreglo.sortByBubble(num, false);
                        // imprime el arreglo ordenado
                        arreglo.sortByArreglo(arregloOrdenado);
                    } else {
                        System.out.println("Opcion no valida");
                    }
                    option = 0;
                    op = 4;

                    break;
                case 2:
                    System.out.println("Bienvenido al programa de ordenamiento por metodo seleccion");
                    int [] arregloOrdenadoSeletion= arreglo.sortBySelection(num);
                    arreglo.sortByArreglo(arregloOrdenadoSeletion);
                    option = 0;
                    op = 4;
                    break;
                case 3:
                    System.out.println("Bienvenido al programa de ordenamiento por metodo insercion");
                    option = 0;
                    op = 4;
                    break;
                case 4:
                    menuInicial();

                    break;

                default:
                    System.out.println("Opcion no valida");

                    break;
            }
        } while (op != 4);

    }

}
