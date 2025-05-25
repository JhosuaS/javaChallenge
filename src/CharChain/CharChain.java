package charchain;

import java.util.Scanner;

public class CharChain {

    //attributes    
    private String jsVocals = "aeiouáéíóúAEIOUÁÉÍÓÚ";
    private String jsConsonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
    private int jsLettersCount = 0;

    //methods
    /*
     * jsCharCount
     * @param jsIsVocal boolean 
     * @param jsInput String
     * @return int
     * @description: Count the number of vowels or consonants in a string
     */
    public int jsCharCount (String jsInput ,boolean jsIsVocal){
        if (jsIsVocal) {
            for (int i = 0; i < jsInput.length(); i++) {
                char jsChar = jsInput.charAt(i);
                if (jsVocals.indexOf(jsChar) != -1) {
                    jsLettersCount++;
                }
            }
        } else {
            jsLettersCount = 0; // Reset count for consonants
            for (int i = 0; i < jsInput.length(); i++) {
                char jsChar = jsInput.charAt(i);
                if (jsConsonants.indexOf(jsChar) != -1) {
                    jsLettersCount++;
                }
            }
        }
        return jsLettersCount;
    }

    /*
     * jsDeleteChar
     * @param jsIsVocal boolean 
     * @param jsDeleteJ boolean
     * @param jsCharToDelete char
     * @return String
     * @description: Delete the indicated vowel or consonant in a string
     */
    public String jsDeleteChar (String jsInput,boolean jsDeleteJ, char jsCharToDelete){
        jsInput = jsInput.replace(jsCharToDelete, ' ');
        if (jsDeleteJ) {
            jsInput = jsInput.replace('j', ' ');
            jsInput = jsInput.replace('J', ' ');
            jsInput.replaceAll(" ", "");
            return jsInput.toUpperCase();
        }
        return jsInput;
    }
    
    /*
     * jsLowerCaseIntoUpperCase
     * @param jsIsVocal boolean 
     * @param jsAlternate boolean
     * @description: Change the case of the vowels or consonants in a string and return the reverse string, except for jsAlternate
     * @return String
     */
    public String jsLowerCaseIntoUpperCase(String jsInput, boolean jsIsVocal, boolean jsAlternate) {
        StringBuilder jsBuildedString = new StringBuilder();

        if (jsAlternate) {
            // Alternar mayúsculas y minúsculas en toda la cadena
            for (int i = 0; i < jsInput.length(); i++) {
                char c = jsInput.charAt(i);
                if (i % 2 == 0) {
                    jsBuildedString.append(Character.toLowerCase(c));
                } else {
                    jsBuildedString.append(Character.toUpperCase(c));
                }
            }
            return jsBuildedString.toString();
        }

        // Si jsAlternate es false, convertir solo vocales o consonantes a mayúsculas y luego invertir la cadena
        for (int i = 0; i < jsInput.length(); i++) {
            char c = jsInput.charAt(i);
            if (jsIsVocal && jsVocals.indexOf(c) != -1) {
                jsBuildedString.append(Character.toUpperCase(c));
            } else if (!jsIsVocal && jsConsonants.indexOf(c) != -1) {
                jsBuildedString.append(Character.toUpperCase(c));
            } else {
                jsBuildedString.append(c);
            }
        }
        return jsBuildedString.reverse().toString();
    }

    /*  
     * jsAnagramGame
     * @description: A simple anagram game where the user has to guess the correct word from a given pool of words.
     */
    public void jsAnagramGame (){
        String [] jsWordPool  = {"delira", "lidera", "ballena", "llenaba", "alondra", "ladrona", "roma", "amor", "quieren", "enrique"};
        int jsAnagramCount = 0;
        int jsWordRandomIndex = (int) (Math.random() * 9);
        String jsCorrectWord;
        Scanner jsScanner = new Scanner(System.in);
        System.out.println("Resuelve el anagrama " + jsWordPool[jsWordRandomIndex]);
        if (jsWordRandomIndex % 2 == 0){
            jsCorrectWord = jsWordPool[jsWordRandomIndex + 1];
        } else {
            jsCorrectWord = jsWordPool[jsWordRandomIndex - 1];   
            }

        while (jsAnagramCount < 3){
            String jsUserInput = jsScanner.nextLine();
            if (jsUserInput.equals(jsCorrectWord)){
                System.out.println("Correcto");
                break;
            } else {
                jsAnagramCount++;
                if (jsAnagramCount == 3) {
                    System.out.println("Perdiste, la palabra correcta era " + jsCorrectWord);
                    break;
                }
                System.out.println("Incorrecto, intenta de nuevo");
            }
        }
        
        jsScanner.close();
    }
}

