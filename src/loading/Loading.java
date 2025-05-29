package loading;

import java.util.Scanner;

public class Loading {

    /*
     * Ejercicio 1 Loading
     */

    public static void jtSpinner(String[] args) throws InterruptedException {
        char[] rotacion = { '|', '/', '-', '\\' };

        for (int i = 0; i <= 100; i++) {
            char simbolo = rotacion[i % rotacion.length];
            System.out.print("\r" + simbolo + " Cargando " + i + "%");
            Thread.sleep(100);
        }
    }

    /*
     * Ejercicio 2 Loading
     */

    public static void jtCarga() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un carácter para simular la carga: ");
        char simbolo = scanner.next().charAt(0);

        final int barraTotal = 20;

        for (int i = 0; i <= 100; i++) {
            int cantidadSimbolo = i * barraTotal / 100;
            int espacios = barraTotal - cantidadSimbolo;

            StringBuilder barra = new StringBuilder("[");
            for (int j = 0; j < cantidadSimbolo; j++) {
                barra.append(simbolo);
            }
            for (int j = 0; j < espacios; j++) {
                barra.append(" ");
            }
            barra.append("] ");

            System.out.print("\r" + barra + i + "%");
            Thread.sleep(100); // pausa para animación
        }
        scanner.close();
    }

    /*
     * Ejercicio 3 Loading
     */

    public static void jtDesplazar() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un carácter para animar el movimiento: ");
        char simbolo = scanner.next().charAt(0); // Solo el primer carácter

        final int barraTotal = 20;

        for (int i = 0; i <= 100; i++) {
            int posicion = i * barraTotal / 100;

            StringBuilder barra = new StringBuilder("[");
            for (int j = 0; j < barraTotal; j++) {
                if (j == posicion) {
                    barra.append(simbolo);
                } else {
                    barra.append(" ");
                }
            }
            barra.append("] ");

            System.out.print("\r" + barra + i + "%");
            Thread.sleep(100);
        }
        scanner.close();
    }

    /*
     * Ejercicio 4 Loading - Waiting
     * Animación: o0o moviéndose en el mismo lugar con ida y vuelta
     */

    public static void jtWaiting() throws InterruptedException {
        String[] animacion = { "o0o", "0o0", "o0o", "0o0" };
        final int duracion = 100;

        for (int i = 0; i <= duracion; i++) {
            String simbolo = animacion[i % animacion.length];
            System.out.print("\r" + simbolo + " " + i + "%");
            Thread.sleep(100);
        }
    }

    /*
     * Ejercicio 5 Loading - Barra con punta animada
     * La punta cambia entre '>' y '-' mientras la barra avanza
     */

    public static void jtPuntaBarra() throws InterruptedException {
        final int barraTotal = 20;
        char[] puntas = { '>', '-' };

        for (int i = 0; i <= 100; i++) {
            int posicion = i * barraTotal / 100;
            int puntaIndex = i % puntas.length;

            StringBuilder barra = new StringBuilder("[");
            for (int j = 0; j < barraTotal; j++) {
                if (j < posicion - 1) {
                    barra.append("=");
                } else if (j == posicion - 1 && i > 0) {
                    barra.append(puntas[puntaIndex]);
                } else {
                    barra.append(" ");
                }
            }
            barra.append("] ");

            System.out.print("\r" + barra + i + "%");
            Thread.sleep(100);
        }
    }

    /*
     * Ejercicio L06 Loading - Barra con <=> que se desplaza de izquierda a derecha
     * Barra de 20 caracteres: [ <=> ] 20%
     */

    public static void jtDesplazarTrio() throws InterruptedException {
        final int barraTotal = 20;
        final String figura = "<=>";
        final int anchoFigura = figura.length();

        for (int i = 0; i <= 100; i++) {
            int posicion = i * (barraTotal - anchoFigura) / 100;

            StringBuilder barra = new StringBuilder("[");
            for (int j = 0; j < barraTotal; j++) {
                if (j == posicion) {
                    barra.append(figura);
                    j += anchoFigura - 1;
                } else {
                    barra.append(" ");
                }
            }
            barra.append("] ");
            System.out.print("\r" + barra + i + "%");
            Thread.sleep(100);
        }
    }

    /*
     * Ejercicio L07 Loading - Barra con punta rotatoria | / - \
     * Ejemplo visual: [====/ ] 20%
     */

    public static void jtPuntaRotatoria() throws InterruptedException {
        final int barraTotal = 20;
        char[] rotacion = { '|', '/', '-', '\\' };

        for (int i = 0; i <= 100; i++) {
            int cantidadSimbolo = i * (barraTotal - 1) / 100;
            int espacios = barraTotal - 1 - cantidadSimbolo;
            char simboloRotativo = rotacion[i % rotacion.length];

            StringBuilder barra = new StringBuilder("[");
            for (int j = 0; j < cantidadSimbolo; j++) {
                barra.append("=");
            }

            barra.append(simboloRotativo);

            for (int j = 0; j < espacios; j++) {
                barra.append(" ");
            }

            barra.append("] ");
            System.out.print("\r" + barra + i + "%");
            Thread.sleep(100);
        }
    }

}