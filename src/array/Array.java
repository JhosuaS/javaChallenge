package array;

import java.util.Scanner;

public class Array {
   
    //attributes
    private String jsName = "";
    private String[] jsUserNames; 
    private final String jsMyName = "Jhosua Saa"; 

    //methods

    public void jsGetFullName() {
        try (Scanner jsScanner = new Scanner(System.in)) {
            System.out.print("Ingrese su nombre completo: ");
            jsName = jsScanner.nextLine();
            if (jsName.isEmpty()) {
                System.out.println("Nombre no puede estar vacío. Intente de nuevo.");
                jsGetFullName(); // Recursive call to ensure a valid name is entered
            } else {
                jsUserNames = jsName.split(" "); // <-- Llenar aquí
                System.out.println("Nombre completo ingresado: " + jsName);
            }
        }
    }

    /**
     * jsLoadingFullName
     * Ejercicio 1 de arrays
     * @description: Muestra una barra de carga con el nombre completo ingresado y los porcentajes de carga.
     */
    public void jsLoadingFullName (){
        jsGetFullName(); // Pide el nombre completo y lo guarda en jsName y jsUserNames
        int jsLoadingBarLength = 20; // Longitud de la barra de carga
        Scanner jsScanner = new Scanner(System.in);

        System.out.println("Ingrese los porcentajes de carga (uno por cada nombre, separados por espacio): ");
        String jsInputPercentages = jsScanner.nextLine();
        String[] jsPercentages = jsInputPercentages.split(" ");

        if (jsPercentages.length != jsUserNames.length) {
            System.out.println("La cantidad de porcentajes no coincide con la cantidad de nombres. Intente de nuevo.");
            jsScanner.close();
            return;
        }

        Integer[] jsPercentagesArray = new Integer[jsPercentages.length];
        for (int i = 0; i < jsPercentages.length; i++) {
            try {
                jsPercentagesArray[i] = Integer.parseInt(jsPercentages[i]);
            } catch (NumberFormatException e) {
                System.out.println("Porcentaje inválido: " + jsPercentages[i] + ". Debe ser un número entero.");
                jsPercentagesArray[i] = 0;
            }
        }

        for (int i = 0; i < jsUserNames.length; i++) {
            int percent = jsPercentagesArray[i];
            int bars = percent * jsLoadingBarLength / 100;
            StringBuilder bar = new StringBuilder("[");
            for (int j = 0; j < bars; j++) bar.append("=");
            bar.append(">");
            for (int j = bars + 1; j < jsLoadingBarLength; j++) bar.append(" ");
            bar.append("] ");
            bar.append(percent).append("% ");

            // Mostrar el nombre como barra de carga
            int nameLength = jsUserNames[i].length();
            int nameLetters = percent * nameLength / 100;
            for (int k = 0; k < nameLetters; k++) {
                bar.append(jsUserNames[i].charAt(k));
            }

            System.out.println(bar);
        }
        jsScanner.close();
    }

    /**
     * jsDrawMatrix
     * Ejercicio 2 de arrays
     * @description: Dibuja una matriz con una J y una S usando un caracter dado.
     * @param jsLevel: Nivel de la matriz (número positivo).
     * @param jsChar: Caracter para dibujar la J y la S.
     */
    public void jsDrawMatrix(int jsLevel, char jsChar) {
        if (jsLevel < 0) {
            System.out.println("El nivel debe ser un número positivo.");
            return;
        }
        String jsCharToDraw = String.valueOf(jsChar);
        String [] [] jsMatrix = new String[jsLevel][(jsLevel)*2 + 1];
        int jsMatrixMiddle = jsLevel;

        // Inicializar la matriz con espacios
        for (int i = 0; i < jsLevel; i++) {
            for (int j = 0; j < (jsLevel * 2 + 1); j++) {
                jsMatrix[i][j] = " ";
            }
        }

        //dibujar la J
        for (int i = 0; i < jsLevel; i++) {
            jsMatrix[0][i]= jsCharToDraw; // Primera fila
            jsMatrix[i][(jsMatrixMiddle - 1) / 2] = jsCharToDraw; // Columna central
            if (i <= (jsMatrixMiddle - 1) / 2) {
                jsMatrix[jsLevel - 1][i] = jsCharToDraw; // ultima fila
            }
        }

        //dibujar la S a la izquierda
        for (int i = jsLevel + 1; i < (jsLevel)*2 + 1; i++) {
            jsMatrix [0][i] = jsCharToDraw; // Primera fila
            jsMatrix[(jsMatrixMiddle - 1) / 2][i] = jsCharToDraw; // fila central
            jsMatrix[jsLevel - 1][i] = jsCharToDraw; // Ultima fila
        }
        for (int i = 0; i < jsLevel - 1; i++) {
            if (i <= (jsMatrixMiddle - 1) / 2){
                jsMatrix[i][jsMatrixMiddle + 1] = jsCharToDraw;
            }
            if (i >= (jsMatrixMiddle - 1) / 2 && i < jsLevel) {
                jsMatrix[i][(jsLevel)*2] = jsCharToDraw;
            }
        }

        System.out.println("Hola mi nombre es Jhosua Saa y y voy a dibujar una J y una S con el caracter '" + jsChar + "' en una matriz de nivel " + jsLevel + ":");    
        for (String[] row : jsMatrix) {
                for (String cell : row) {
                    System.out.print(cell);
                }
                System.out.println();
        }
    }

    /*
     * jsDrawXy
     * Ejercicio 3 de arrays 
     * @description: Dibuja una función lineal en un plano cartesiano con el nombre "Jhosua Saa" y un nivel dado.
     * @param jsLevel: Nivel del plano cartesiano (número positivo).
     */
    public void jsDrawXy(int jsLevel) {
        if (jsLevel < 0) {
            System.out.println("El nivel debe ser un número positivo.");
            return;
        }
        int jsXsize = jsLevel + 1;
        int jsYsize = jsLevel + 2;
        String[][] jsMatrix = new String[jsXsize][jsYsize];
        
        // Inicializar la matriz con espacios
        for (int i = 0; i < jsXsize; i++) {
            for (int j = 0; j < jsYsize; j++) {
                jsMatrix[i][j] = " ";
            }
        }

        // Dibujar eje y
        for (int i = 0; i < jsXsize; i++) {
            jsMatrix[jsXsize - 1 - i][0] = String.valueOf(i); // Diagonal principal
            jsMatrix[jsXsize - 1 - i][1] = "|"; // Diagonal secundaria
        }

        // Dibujar eje x
        for (int i = 2; i < jsYsize; i++) {
            jsMatrix[jsXsize - 1][i] = "_"; // Diagonal principal
        }

        // Dibujar nombre como funcion lineal
        for (int i = 0; i < jsMyName.length(); i++) {
            if (i < jsYsize - 2) // Asegurarse de no exceder el tamaño de la matriz
                jsMatrix[jsXsize - 2 - i][i + 2] = String.valueOf(jsMyName.charAt(i));
        }

        System.out.println("Dibujando" + jsMyName + " como una funcion lineal en un plano de nivel " + jsLevel + ":");
        for (String[] row : jsMatrix) {
            for (String cell : row) {
                System.out.print(cell);
            }
        System.out.println();
        }
    } 

    /**
     * jsDrawCross
     * Ejercicio 4 de arrays
     * @description: Dibuja una cruz en una matriz con el nombre jsMyName ("Jhosua Saa") y el tamaño basado en la longitud del nombre más largo.
     */
    public void jsDrawCross(){ 
        String jsFirstName = jsMyName.split(" ")[0]; // Obtener el primer nombre
        String jsLastName = jsMyName.split(" ")[1]; // Obtener el apellido
        int jsSize = (jsFirstName.length() > jsLastName.length()) ? jsFirstName.length() : jsLastName.length(); // Tamaño de la matriz
        String jsBiggerName = (jsFirstName.length() > jsLastName.length()) ? jsFirstName : jsLastName; // Nombre más largo
        String jsShorterName = (jsFirstName.length() < jsLastName.length()) ? jsFirstName : jsLastName; // Nombre más corto
        String[][] jsMatrix = new String[jsSize][jsSize];

        // Inicializar la matriz con espacios
        for (int i = 0; i < jsSize; i++) {
            for (int j = 0; j < jsSize; j++) {
                jsMatrix[i][j] = " ";
            }
        }

        StringBuilder jsCrossName = new StringBuilder();
        // Dibujar la cruz
        for (int i = 0; i < jsSize; i++) {
            jsMatrix[i][i] = String.valueOf(jsBiggerName.charAt(i)); // Diagonal principal
            if (i < jsShorterName.length()) {
                jsCrossName.append(jsShorterName.charAt(i)); // Construir el nombre de la cruz
            } else {
                jsCrossName.append(" "); // Rellenar con espacios si el nombre más corto es más pequeño
            }
            jsMatrix[i][jsSize - 1 - i] = String.valueOf(jsCrossName.charAt(i)); // Diagonal secundaria
        }

        System.out.println("Dibujando una cruz en una matriz de nivel " + jsSize + ":");
        for (String[] row : jsMatrix) {
            for (String cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }

    /**
     * jsRandonMatrixName
     * Ejercicio 5 de arrays
     * @description: Crea una matriz aleatoria de nombres y los coloca en posiciones aleatorias, asegurando que no se repitan en filas o columnas.
     */
    public void jsRandonMatrixName() {
        String[] jsNames = {"Jhosua", "Israel", "Saa", "Gonzalez"};
        int jsSize = 8;
        String[][] jsMatrix = new String[jsSize][jsSize];

        // Inicializar la matriz con espacios
        for (int i = 0; i < jsSize; i++) {
            for (int j = 0; j < jsSize; j++) {
                jsMatrix[i][j] = " ";
            }
        }

        // Unir todos los caracteres de los nombres en una lista
        java.util.List<String> chars = new java.util.ArrayList<>();
        for (String name : jsNames) {
            for (char c : name.toCharArray()) {
                chars.add(String.valueOf(c));
            }
        }

        // Mezclar aleatoriamente los caracteres
        java.util.Collections.shuffle(chars);

        // Crear lista de posiciones posibles y mezclarla
        java.util.List<int[]> positions = new java.util.ArrayList<>();
        for (int i = 0; i < jsSize; i++) {
            for (int j = 0; j < jsSize; j++) {
                positions.add(new int[]{i, j});
            }
        }
        java.util.Collections.shuffle(positions);

        // Llenar la matriz con los caracteres mezclados en posiciones aleatorias
        int idx = 0;
        for (; idx < chars.size() && idx < positions.size(); idx++) {
            int[] pos = positions.get(idx);
            String currentChar = chars.get(idx);

            boolean existsInRow = false;
            boolean existsInCol = false;

            // Verificar si el carácter ya existe en la fila
            for (int j = 0; j < jsSize; j++) {
                if (jsMatrix[pos[0]][j].equals(currentChar)) {
                    existsInRow = true;
                    break;
                }
            }
            // Verificar si el carácter ya existe en la columna
            for (int i = 0; i < jsSize; i++) {
                if (jsMatrix[i][pos[1]].equals(currentChar)) {
                    existsInCol = true;
                    break;
                }
            }

            if (existsInRow || existsInCol) {
                jsMatrix[pos[0]][pos[1]] = "*";
            } else {
                jsMatrix[pos[0]][pos[1]] = currentChar;
            }
        }

        // Imprimir la matriz
        System.out.println("Matriz aleatoria de nombres de nivel " + jsSize + ":");
        for (int i = 0; i < jsSize; i++) {
            for (int j = 0; j < jsSize; j++) {
                System.out.print(jsMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    

}
