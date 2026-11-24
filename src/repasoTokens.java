import java.util.Scanner;
import java.util.StringTokenizer;

public class repasoTokens {
    public static void main(String[] args) {
        String frase;
        String palabra;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingresa una frase: ");
            frase = sc.nextLine().toLowerCase();
            System.out.print("Ingresa una palabra: ");
            palabra = sc.nextLine().toLowerCase();
        } while (frase.isEmpty()||palabra.isEmpty());

        char primerChar = palabra.charAt(0);
        char ultimoChar = palabra.charAt(palabra.length()-1);

        StringTokenizer st = new StringTokenizer(frase);
        int contadorCumplen=0;
        int contadorNoCumplen=0;

        while (st.hasMoreTokens()){
            String pal =st.nextToken();
            if (pal.charAt(0)==primerChar&&pal.charAt(pal.length()-1)==ultimoChar){
                contadorCumplen++;
            }
            if (pal.charAt(0)!=primerChar||pal.charAt(pal.length()-1)!=ultimoChar){
                contadorNoCumplen++;
            }
        }
        System.out.println(contadorNoCumplen-contadorCumplen);
    }
}
