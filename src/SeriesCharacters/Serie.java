package SeriesCharacters;

public class Serie {
    
    public void pwSecuenciac1(int n) {
        String signo_suma = "+";
        String signo_resta = "-";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                System.out.print(signo_suma);
            else
                System.out.print(signo_resta);
        }
    }

    public void pwSecuenciac2(int n) {
        String signo_suma = "+";
        int F1 = 1;
        int F2 = 0;
        int F0;
        if (n >= 1)
            System.out.print(signo_suma + " ");
        for (int i = 0; i < n; i++) {
            F0 = F1 + F2;
            for (int x = 1; x <= F0; x++)
                System.out.print(signo_suma);
            F2 = F1;
            F1 = F0;
            System.out.print(" ");
        }
    }

    public void pwSecuenciac3(int n) {
        String signo_suma = "+";
        int contador_nprimo = 0;
        int i = 2;
        while (contador_nprimo < n && i <= 10000) {
            boolean primo = true;
            int j = 2;
            while (j < i) {
                if (i % j == 0) {
                    primo = false;
                    j = i;
                } else {
                    j++;
                }
            }
            if (primo) {
                for (j = 1; j <= i; j++)
                    System.out.print(signo_suma);
                contador_nprimo++;
                System.out.print(" ");
            }
            i++;
        }
    }

    public void pwSecuenciac4(int n) {
        String cadenaCaracteres = "+-*/";
        for (int i = 0; i <= n - 1; i++) {
            char caracter = cadenaCaracteres.charAt(i % cadenaCaracteres.length());
            System.out.print(caracter + " ");
        }
    }

    public void pwSecuenciac5(int n) {
        String cadenaCaracteres = "\\|/-|";
        for (int i = 0; i <= n - 1; i++) {
            char caracter = cadenaCaracteres.charAt(i % cadenaCaracteres.length());
            System.out.print(caracter + " ");
        }
    }

    public void pwSecuenciac6(int n) {
        for (char i = 0; i <= n; i++) {
            char letra = (char) (97 + (i - 26 * (i / 26)));
            System.out.print(letra + " ");
        }
    }


    
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
