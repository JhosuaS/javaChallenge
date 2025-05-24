import CharChain.*;

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

    //metodos de salida de datos
    //probando charChain
    public void jsShowAllCharChain() {
        CharChain jsCharChain = new CharChain(jsGetString());
        int vocalCount = jsCharChain.jsCharCount(true);
        System.out.println("Cantidad de vocales: " + vocalCount);

        int consonantCount = jsCharChain.jsCharCount(false);
        System.out.println("Cantidad de consonantes: " + consonantCount);

        String deletedString = jsCharChain.jsDeleteChar(false, jsGetChar());
        System.out.println("Cadena modificada: " + deletedString);
        
        deletedString = jsCharChain.jsDeleteChar(true,' ');
        System.out.println("Cadena sin J: " + deletedString);

        String modifiedString = jsCharChain.jsLowerCaseIntoUpperCase(true, false);
        System.out.println("Vocales a mayúsculas e invertida: " + modifiedString);
        modifiedString = jsCharChain.jsLowerCaseIntoUpperCase(false, false);
        System.out.println("Consonantes a mayúsculas e invertida: " + modifiedString);
        modifiedString = jsCharChain.jsLowerCaseIntoUpperCase(false, true);
        System.out.println("Mayúsculas alternadas: " + modifiedString);

        jsCharChain.jsAnagramGame();
    }

    
}
