package figures;

public class Figures {
    
    /*Cuadrado con asteriscos hueco */
    public void jsFigure1(){
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size-1 || j == 0 || j == size-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Cuadrado hueco con * y + alternados
    public void jsFigure2() {
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print((i + j) % 2 == 0 ? "* " : "+ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Triángulo rectángulo izquierdo con asteriscos
    public void jsFigure3(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Triángulo rectángulo derecho con asteriscos
    public void jsFigure4(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Triangulo equilatero invertido con asteriscos
    public void jsFigure5(int filas) {
        for (int i = filas; i >= 1; i--) {
            for (int j = 0; j < filas - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }

    //Triángulo equilátero con asteriscos
    public void jsFigure6(int filas) {
        System.out.println("Pirámide con " + filas + " filas:");
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Escalera
    public void jsFigure7(int n) {  
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("    ");
            }
            System.out.println("|___");
        }
    }

    //Escalera invertida
    public void jsFigure8(int n) {  
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("    ");
            }
            System.out.println("___|");
        }
    }

    //Escalera doble
    public void jsFigure9(int niveles) {  
        for (int i = 0; i < niveles - 1; i++) {
            System.out.print("     "); 
        }
        System.out.println("    ___"); 
        for (int i = 0; i < niveles; i++) {
            for (int j = 0; j < niveles - i - 1; j++) {
                System.out.print("     "); 
            }
            System.out.print("___|  ");
            if (i > 0) {
                for (int j = 0; j < i * 10; j++) { 
                    System.out.print(" ");
                }
            }
            System.out.println(" |___");
        }
    }
    

    //Escalera con + y - alternados
    public void jsFigure10(int t) {  
        int espacios = 0;
        for (int c = 1; c <= t; c++) {
            for (int f = 0; f < espacios; f++) {
                System.out.print(" ");
            }   
            if (espacios > 0) {
                System.out.print("| ");
            }
            if (c % 2 == 0) {
                System.out.println("_-_");
            } else {
                System.out.println("_+_");
            }
            espacios += 6;
        }
    }

    //Escalera progresiva 
    public void jsFigure11(int levels, int baseSpaces) {
        for (int i = 1; i <= levels; i++) {
            for (int j = 1; j < i * baseSpaces; j++) {
                System.out.print(" ");
            }
        
            System.out.print("|");
            for (int k = 0; k < i; k++) {
                System.out.print("_");
            }   
        
            System.out.println();
        }
    }

    //Escalera numeral inversa
    public void jsFigure12(int rows) {
        System.out.println("Figura descendente numérica de " + rows + " filas:");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j); 
            }
            System.out.println(); 
        }
    }

    //Escalera numeral
    public void jsFigure13(int rows) {
        System.out.println("Triángulo numérico ascendente de " + rows + " filas:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j); 
            }
            System.out.println(); 
        }
    }

    //Escalera de pascal
    public void jsFigure14(int filas) {
        System.out.println("Triángulo de Pascal de " + filas + " filas:");
        
        for (int i = 0; i < filas; i++) {
            // Espacios para centrar
            for (int j = 0; j < filas - i - 1; j++) {
                System.out.print("  ");
            }
            
            int numero = 1;
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", numero);
                numero = numero * (i - j) / (j + 1); 
            }
            System.out.println();
        }
    }

    public void jsFigure15(int numFilas) {
        System.out.println("Triángulo de Pascal aplanado de " + numFilas + " filas:");
        
        for (int i = 0; i < numFilas; i++) {
            int filaReal = 2 * i;  
            int numero = 1;
            
            for (int s = 0; s < numFilas - i - 1; s++) {
                System.out.print("  ");
            }
            
            for (int j = 0; j <= filaReal; j++) {
                System.out.printf("%4d", numero);  
                numero = numero * (filaReal - j) / (j + 1);  
            }
            System.out.println();
        }
    }


    /*
     * Dibuja una cruz en una matriz de tamaño jsSize.
     * La cruz se dibuja con '-' en las diagonales y '+' en las esquinas y el centro.
     */
    public void jsFigure16(int jsSize){ 
        String[][] jsMatrix = new String[jsSize][jsSize];

        // Inicializar la matriz con espacios
        for (int i = 0; i < jsSize; i++) {
            for (int j = 0; j < jsSize; j++) {
                jsMatrix[i][j] = " ";
            }
        }

        // Dibujar la x
        for (int i = 0; i < jsSize; i++) {
            jsMatrix[i][i] = "-"; // Diagonal principal
            jsMatrix[i][jsSize - 1 - i] = "-"; // Diagonal secundaria
        }

        //casos especiales
        jsMatrix[0][0] = "+"; // Esquina superior izquierda
        jsMatrix[jsSize - 1][0] = "+"; // Esquina inferior izquierda
        jsMatrix[0][jsSize - 1] = "+"; // Esquina superior derecha
        jsMatrix[jsSize - 1][jsSize - 1] = "+"; // Esquina inferior derecha
        if (jsSize % 2 == 1) {
            jsMatrix[jsSize / 2][jsSize / 2] = "+"; // Centro de la matriz
        }

        System.out.println("Dibujando una cruz en una matriz de nivel " + jsSize + ":");
        for (String[] row : jsMatrix) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    /*
     * Dibuja una cruz en una matriz de tamaño jsSize.
     * La cruz se dibuja con '0' en las diagonales y '1' en las esquinas y el centro.
     */
    public void jsFigure17(int jsSize){ 
        String[][] jsMatrix = new String[jsSize][jsSize];

        // Inicializar la matriz con espacios
        for (int i = 0; i < jsSize; i++) {
            for (int j = 0; j < jsSize; j++) {
                jsMatrix[i][j] = " ";
            }
        }

        // Dibujar la x
        for (int i = 0; i < jsSize; i++) {
            jsMatrix[i][i] = "0"; // Diagonal principal
            jsMatrix[i][jsSize - 1 - i] = "0"; // Diagonal secundaria
        }

        //casos especiales
        jsMatrix[0][0] = "1"; // Esquina superior izquierda
        jsMatrix[jsSize - 1][0] = "1"; // Esquina inferior izquierda
        jsMatrix[0][jsSize - 1] = "1"; // Esquina superior derecha
        jsMatrix[jsSize - 1][jsSize - 1] = "1"; // Esquina inferior derecha
        if (jsSize % 2 == 1) {
            jsMatrix[jsSize / 2][jsSize / 2] = "1"; // Centro de la matriz
        }
        
        System.out.println("Dibujando una cruz en una matriz de nivel " + jsSize + ":");
        for (String[] row : jsMatrix) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    /**
     * Dibuja una pirámide de números en una matriz de tamaño jsSize.
     * La pirámide se construye con números que se suman de acuerdo a las reglas especificadas.
     * 
     * @param jsSize Tamaño de la matriz y nivel de la pirámide.
     */
    public void jsFigure18(int jsSize){ 
        String[][] jsMatrix = new String[jsSize][jsSize];

        // Inicializar la matriz con espacios
        for (int i = 0; i < jsSize; i++) {
            for (int j = 0; j < jsSize; j++) {
                jsMatrix[i][j] = " ";
            }
        }

        for (int i = 0; i < jsSize; i++) {
            jsMatrix[i][0] = "1"; // Columna izquierda
        }
        
        for (int i = 0; i < jsSize; i++) {
            for (int j = 0; j < jsSize; j++) {
                if (i == j) {
                    jsMatrix[i][j] = "2"; // Fila superior e inferior
                } else if (j > 0 && i > 1 && i > j) {
                    jsMatrix[i][j] = Integer.toString((Integer.parseInt(jsMatrix[i - 1][j - 1]) + Integer.parseInt(jsMatrix[i - 1][j]))); // Columna derecha
                }
            }
        }

        System.out.println("Dibujando una pirámide de nivel " + jsSize + ":");
        for (String[] row : jsMatrix) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public void jsFigure19(int jsSize){ 
        String[][] jsMatrix = new String[jsSize][jsSize];

        // Inicializar la matriz con espacios
        for (int i = 0; i < jsSize; i++) {
            for (int j = 0; j < jsSize; j++) {
                jsMatrix[i][j] = " ";
            }
        }

        for (int i = 0; i < jsSize; i++) {
            jsMatrix[i][0] = "+"; // Columna izquierda
        }
        
        for (int i = 0; i < jsSize; i++) {
            for (int j = 0; j < jsSize; j++) {
                if (i == j) {
                    jsMatrix[i][j] = "*"; 
                }
                if (j == 1 && i > 1) {
                    jsMatrix[i][j] = Integer.toString(i+1); 
                }
                if (j + 1 == i && i > 2) {
                    jsMatrix[i][j] = Integer.toString(Integer.parseInt(jsMatrix[i - 1][j - 1]) + 2); // Columna derecha
                }else if (j > 1 && i > 3 && i > j) {
                    jsMatrix[i][j] = Integer.toString((Integer.parseInt(jsMatrix[i - 1][j - 1]) + Integer.parseInt(jsMatrix[i - 1][j]))); // Columna derecha
                }
            }
        }

        System.out.println("Dibujando una pirámide de nivel " + jsSize + ":");
        for (String[] row : jsMatrix) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
