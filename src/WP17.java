import java.util.Scanner;
import java.util.StringTokenizer;

public class WP17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime tu nombre y apellidos: ");
        String nombre = sc.nextLine();
        sc.close();
        System.out.println(iniciales(nombre.toUpperCase()) +" son tus inicales");
    }
    public static String iniciales(String nombre){
        StringTokenizer st = new StringTokenizer(nombre);
        StringBuilder nombreSb = new StringBuilder();
        while (st.hasMoreTokens()){
            String palabra = st.nextToken();
            char c = palabra.charAt(0);
            nombreSb.append(c);
        }
        return nombreSb.toString();
    }
}
