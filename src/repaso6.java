import java.util.Scanner;
import java.util.StringTokenizer;

public class repaso6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime una frase: ");
        String cadena = sc.nextLine();

        System.out.println("Tamaño con espacios: "+cadena.length());

        StringTokenizer st = new StringTokenizer(cadena);
        System.out.println("Hay "+st.countTokens()+" palabras en la frase");


        String primeraPalabra = st.nextToken();
        String masCorta=primeraPalabra;
        String masLarga=primeraPalabra;
        int sumaLetras=0;
        while (st.hasMoreTokens()){
            String palabra = st.nextToken();
            sumaLetras+=palabra.length();
            if (palabra.length()>masLarga.length()){
                masLarga=palabra;
            }
            if (palabra.length()<masCorta.length()){
                masCorta=palabra;
            }
        }
        System.out.println("La palabra mas larga es: "+masLarga);
        System.out.println("La palabra mas corta es: "+masCorta);
        System.out.println("Tamaño sin espacios: "+cadena.length());
    }
}
