import java.util.Scanner;
import java.util.StringTokenizer;

public class WP21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un frase: ");
        String cadena = sc.nextLine();
        procesarPalabras(cadena);
    }
    private static void procesarPalabras(String cadena) {
        StringTokenizer st = new StringTokenizer(cadena);
        StringBuilder sb = new StringBuilder();
        int contador = 0;
        while (st.hasMoreTokens()){
            String token = st.nextToken();
            if (token.charAt(0)=='p'){
                sb.insert(0,token+" ");
                contador++;
            }
        }
        String procesada=sb.toString();
        System.out.println("Las "+contador+ " palabras son las que empiezan por 'p' son: " + procesada);
    }

}
