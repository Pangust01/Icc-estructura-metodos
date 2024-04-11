package modelo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        // crear un objeto, una instancia al objeto
        menuPrincipal menu = new menuPrincipal(teclado);
        // TODO: hacer un menu que elija el metodo
        menu.menuInicial();
        teclado.close();

    }
}
