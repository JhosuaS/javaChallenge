package figures;

public class Figures {
    
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
