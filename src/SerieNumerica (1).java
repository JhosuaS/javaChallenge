package series;

public class SerieNumerica {

    private final int n;

    public SerieNumerica(int n) {
        this.n = n;
    }

    public void g4_imprimeTodasSeries() {

        System.out.println("Series:");
        secuencia1();
        System.out.println(" ");
        secuencia2();
        System.out.println(" ");
        secuencia3();
        System.out.println(" ");
        secuencia4();
        System.out.println(" ");
        secuencia5();
        System.out.println(" ");
        secuencia6();
        System.out.println(" ");
        secuencia7();
        System.out.println(" ");
        secuencia8();
        System.out.println(" ");
        secuencia9();
        System.out.println(" ");
        secuencia10();
        System.out.println(" ");
        secuencia11();
        System.out.println(" ");
    }

    public void secuencia1() {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + ", ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public void secuencia2() {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(num + ", ");
                num += 2;
            } else {
                System.out.print("0, ");
            }
        }
    }

    public void secuencia3() {
        int num = 0;
        for (int i = 1; i <= n; i++) {
            num += i;
            System.out.print(num + ", ");
        }
    }

    public void secuencia4() {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(num + ", ");
            num += 2;
        }
    }

    public void secuencia5() {
        int num = 2;
        for (int i = 3; i <= n; i++) {
            System.out.print(num + ", ");
            num += 3;
        }
    }

    public void secuencia6() {
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + ", ");
        }
    }

    public void secuencia7() {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(num + ", ");
            num += 3;
        }
    }

    public void secuencia8() {
        int num = 3;
        for (int i = 3; i <= n; i++) {
            System.out.print(num + ", ");
            num += 5;
        }
    }

    public void secuencia9() {
        int num = 2;
        for (int i = 2; i <= n; i++) {
            System.out.print(num + ", ");
            num += num;
        }
    }

    public void secuencia10() {
        int num = 3;
        for (int i = 3; i <= n; i++) {
            System.out.print(num + ", ");
            num = num * 3;
        }
    }

    public void secuencia11() {
        for (int i = 1; i <= n; i++) {
            int num = i * (i + 1);
            System.out.print(num + ", ");
        }
    }
}
// serie uno
public class g4_serieFibonacci {
    public void ejecutar(){
        int n = 0 , a = 0 , b= 1 , siguiente = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de términos de la serie: ");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            System.out.print (a + " ");
            siguiente = a + b;
            a = b;
            b = siguiente;
        }
        System.out.println();
        scanner.close();
        
    }
}
// serie dos
public class g4_serieAlterna {
    public void ejecutar(){
        int n = 0, impar = 1 ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de términos de la serie: ");
        n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            if ( i % 2 == 0){
                System.out.print(impar + " ");
                impar += 2;
            }else{
                System.out.print("0 ");
            }
        }
        System.out.println();
        scanner.close();

    }
}
// serie tres 
public class g4_serieMixto {
    public void ejecutar() {
        int n = 0, a = 0, b = 1, siguiente = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de términos de la serie: "); 
        n = scanner.nextInt();
        for ( int i = 0; i < n; i++){
            if (i == 0 ){
                System.out.print(a + "/1 ");
            }else if (i == 1){
                System.out.print(b + "/3 ");
            }else{
                siguiente = a + b;
                System.out.print(siguiente + "/" + ( 1 + 2 *i) + " ");
                a = b;
                b = siguiente;
            } 
            }
        System.out.println(); 
        scanner.close();
        }
        
    }
   
//serie cuatro 
public class g4_serieMixto2 {
    public void ejecutar(){
        int n = 0, a = 0, b = 1, siguiente = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de términos de la serie: ");
        n = scanner.nextInt();

        for( int i = 0; i < n; i++){
            if (i == 0){
                System.out.print(a + "/2 ");
            }else if (i == 1) {
                System.out.print(b + "/4 ");
            }else{
                siguiente= a + b;
                System.out.print(siguiente + "/" + (2 * (i+1)) + " ");
                a = b;
                b = siguiente;
            }
        }
        System.out.println();
        scanner.close();
    }


}
// serie cinco 
public class g4_seriePrimos {
    private boolean esPrimo(int numero){
        if (numero <= 1){
            return false;
        }
        for (int i = 2; i <=Math.sqrt(numero); i++){
            if (numero % i == 0){
                return false;
            }
        }    
        return true;
        }
   
    public void ejecutar(){
        int n = 0, contador = 0, numeroActual = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de términos para la serie: ");
        n = scanner.nextInt();

        while (contador < n){
            if (esPrimo(numeroActual)){
                System.out.print(numeroActual + " ");
                contador++;
            }
            numeroActual++;
        }
        System.out.println();
        scanner.close();

    }

    
}
