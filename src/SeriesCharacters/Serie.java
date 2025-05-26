package SeriesCharacters;

public class Serie {
    //Serie de abecedario alternando letras y signos
    public void jsSeries6B(int cantidad) {
        char letra = 'a';
        for (int i = 1; i <= cantidad; i++) {
            System.out.print(letra);
            letra += 2;
            if (i < cantidad) {
                System.out.print(i % 2 == 1 ? " + " : " - ");
            }
        }
        System.out.println();
    }

    //Serie de abecedario con letras repetidas
    // y separadas por espacios
    public void jsSeries7(int cantidad) {
        char letra = 'a';
        for (int i = 1; i <= cantidad; i++) {
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print(letra);
            }
            System.out.print(" ");
            letra++;
        }
        System.out.println();
    }

    //Serie de abecedario con letras repetidas
    // y separadas por espacios, con incremento de repeticiones
    public void jsSeries8(int cantidad) {
        char letter = 'a';
        for (int i = 1; i <= cantidad; i++) {
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print(letter);
            }
            System.out.print(" ");  
            letter++;
        }
        System.out.println();  
    }

    //Serie de abecedario con letras repetidas
    // y separadas por espacios, con incremento de repeticiones a partir de la d
    public void jsSeries9(int cantidad) {
        char letter = 'a';
        int repetitions = 1;
        int increment = 0;
        for (int i = 1; i <= cantidad; i++) {
            for (int j = 0; j < repetitions; j++) {
                System.out.print(letter);
            }
            System.out.print(" "); 
            letter++;
            if (i >= 3) {
                repetitions += increment;
                increment = (increment == 0) ? 1 : increment * 2;
            }
        }
        System.out.println(); 
    }
}
