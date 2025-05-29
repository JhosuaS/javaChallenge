import CharChain.*;
import array.*;
import figures.*;

public class Controller {
    //TODO incluir toda la lógica de los modelos necesarios

    //metodos de ingreso de datos
    public char jsGetChar(){
        char jsChar = ' ';
        try {
            System.out.print("Ingrese un letra: ");
            jsChar = (char) System.in.read();
            System.in.skip(System.in.available()); // Limpiar el buffer
        } catch (Exception e) {
            System.out.println("Error al leer el caracter: " + e.getMessage());
        }
        return jsChar;
    }

    public String jsGetString() {
        StringBuilder jsInput = new StringBuilder();
        try {
            System.out.print("Ingrese una cadena de texto: ");
            int jsChar;
            while ((jsChar = System.in.read()) != '\n') {
                jsInput.append((char) jsChar);
            }
        } catch (Exception e) {
            System.out.println("Error al leer la cadena: " + e.getMessage());
        }
        return jsInput.toString();
    }

    public int jsGetInt() {
        int jsNumber = 0;
        try {
            System.out.print("Ingrese un número entero: ");
            jsNumber = Integer.parseInt(System.console().readLine());
        } catch (Exception e) {
            System.out.println("Error al leer el número: " + e.getMessage());
        }
        return jsNumber;
    }

    //metodos de salida de datos
    //probando charChain
    
    public void jsShowAllCharChain() {
        CharChain jsCharChain = new CharChain();
        int vocalCount = jsCharChain.jsCharCount(jsGetString(), true);
        System.out.println("Cantidad de vocales: " + vocalCount);

        int consonantCount = jsCharChain.jsCharCount(jsGetString(), false);
        System.out.println("Cantidad de consonantes: " + consonantCount);

        String deletedString = jsCharChain.jsDeleteChar(jsGetString(), false, jsGetChar());
        System.out.println("Cadena modificada: " + deletedString);
        
        deletedString = jsCharChain.jsDeleteChar(jsGetString(), true,' ');
        System.out.println("Cadena sin J: " + deletedString);

        String modifiedString = jsCharChain.jsLowerCaseIntoUpperCase(jsGetString(),true, false);
        System.out.println("Vocales a mayúsculas e invertida: " + modifiedString);
        modifiedString = jsCharChain.jsLowerCaseIntoUpperCase(jsGetString(), false, false);
        System.out.println("Consonantes a mayúsculas e invertida: " + modifiedString);
        modifiedString = jsCharChain.jsLowerCaseIntoUpperCase(jsGetString(), false, true);
        System.out.println("Mayúsculas alternadas: " + modifiedString);

        jsCharChain.jsAnagramGame();
    } 
    

    //probando Array
    public void jsShowAllArray() {
        Array jsArray = new Array();
        System.out.println("Ejercicios con Arrays:");
        jsArray.jsLoadingFullName();
        jsArray.jsDrawMatrix(jsGetInt(),jsGetChar());
        jsArray.jsDrawXy(jsGetInt());
        jsArray.jsDrawCross();
        jsArray.jsRandonMatrixName();
    }

    public void jsShowAllFigures() {
        Figures jsFigures = new Figures();
        System.out.println("Ejercicios con Figuras:");
        jsFigures.jsFigure1();
        jsFigures.jsFigure2();
        jsFigures.jsFigure3(4); 
        jsFigures.jsFigure4(4);
        jsFigures.jsFigure5(5);
        jsFigures.jsFigure6(jsGetInt());
        jsFigures.jsFigure7(6, 5);
        jsFigures.jsFigure8(6, 5);
        jsFigures.jsFigure9(5, 4);
        jsFigures.jsFigure10(4, 6);
        jsFigures.jsFigure11(4, 4);
        jsFigures.jsFigure12(jsGetInt());
        jsFigures.jsFigure13(jsGetInt());
        jsFigures.jsFigure14(jsGetInt());
        jsFigures.jsFigure15(jsGetInt());
        jsFigures.jsFigure16(jsGetInt());
        jsFigures.jsFigure17(jsGetInt());
        jsFigures.jsFigure18(jsGetInt());
        jsFigures.jsFigure19(jsGetInt());
    }

    public void jsShowAllSeriesCharacters() {
        SeriesCharacters.Serie jsSeries = new SeriesCharacters.Serie(); 
        System.out.println("Ejercicios con Series de Caracteres:");
        System.out.println("Series:");
        System.out.println("Secuencia 1: ");
        jsSeries.secuenciac1(jsGetInt());
        System.out.println("");
        System.out.println("Secuencia 2: ");
        jsSeries.secuenciac2(jsGetInt());
        System.out.println("");
        System.out.println("Secuencia 3: ");
        jsSeries.secuenciac3(jsGetInt());
        System.out.println("");
        System.out.println("Secuencia 4: ");
        jsSeries.secuenciac4(jsGetInt());
        System.out.println("");
        System.out.println("Secuencia 5: ");
        jsSeries.secuenciac5(jsGetInt());
        System.out.println("");
        System.out.println("Secuencia 6: ");
        jsSeries.secuenciac6(jsGetInt());
        jsSeries.jsSeries6B(jsGetInt());
        jsSeries.jsSeries7(jsGetInt());
        jsSeries.jsSeries8(jsGetInt());
        jsSeries.jsSeries9(jsGetInt());
    }

}
