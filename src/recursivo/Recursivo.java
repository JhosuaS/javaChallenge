package recursivo;

public class Recursivo {

    /*
     * R01) Factorial recursivo sin usar bucles ni operadores matemáticos
     */
    public static int jtFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return multiplicar(n, jtFactorial(n - 1));
        }
    }

    private static int multiplicar(int a, int b) {
        if (b == 0)
            return 0;
        return a + multiplicar(a, b - 1);
    }

    /*
     * R02) Suma recursiva sin usar bucles ni operadores aritméticos
     */

    public static int jtSuma(int a, int b) {
        if (b == 0)
            return a;
        return jtSuma(incrementar(a), decrementar(b));
    }

    // Incrementar sin usar '+'
    private static int incrementar(int x) {
        return -~x;
    }

    private static int decrementar(int x) {
        return ~-x;
    }

    /*
     * R03) Multiplicación recursiva de a * b
     */
    public static int jtMultiplicacion(int a, int b) {
        if (b == 0)
            return 0;
        if (b < 0)
            return -jtMultiplicacion(a, -b);
        return jtSuma(a, jtMultiplicacion(a, decrementar(b)));
    }

    /*
     * R04) Potencia recursiva a^b
     */
    public static int jtPotencia(int base, int exponente) {
        if (exponente == 0)
            return 1;
        return jtMultiplicacion(base, jtPotencia(base, decrementar(exponente)));
    }

    /*
     * R05) Conteo progresivo hasta n
     */
    public static void jtConteoProgresivoHasta(int n) {
        jtConteoDesde(1, n);
    }

    private static void jtConteoDesde(int i, int n) {
        if (i > n)
            return;
        System.out.println("Avance: " + i);
        jtConteoDesde(i + 1, n);
    }

    /*
     * R06) Conteo regresivo desde n hasta 0
     */
    public static void jtConteoRegresivo(int n) {
        if (n < 0)
            return;
        System.out.println("Avance: " + n);
        jtConteoRegresivo(n - 1);
    }
}
