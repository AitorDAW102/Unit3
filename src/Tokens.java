import java.util.StringTokenizer;

public class Tokens {
    public static void main(String[] args) {
        String texto = "Lunes Martes Miercoles Jueves Viernes Sabado Domingo";
        StringTokenizer st = new StringTokenizer(texto);
        while (st.hasMoreTokens()) {
            String palabra = st.nextToken();
            System.out.println(palabra);
        }
    }
}
