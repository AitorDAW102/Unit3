import java.util.StringTokenizer;

public class WP21 {
    public static void main(String[] args) {
        String cadena = "pájaro pluma cabeza pico";
        StringTokenizer st = new StringTokenizer(cadena);
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()){
            String token = st.nextToken();
            if (token.charAt(0)=='p'){
                sb.append(token+" ");
            }
        }
        System.out.println(sb);
    }
}
