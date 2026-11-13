import java.util.Scanner;

public class WP19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime una frase: ");
        String frase1 = sc.nextLine();
        System.out.print("Dime otra frase: ");
        String frase2= sc.nextLine();
        boolean resultado = esAnagrama(frase1,frase2);

        if (resultado){
            System.out.println("Es anagrama");
        } else{
            System.out.println("NO es anagrama");
        }
    }

    private static boolean esAnagrama(String frase1, String frase2) {
        String frase1Limpia= limpiarCadena(frase1);
        String frase2Limpia= limpiarCadena(frase2);

        if (frase1Limpia.length()!=frase2Limpia.length()){
            return false;
        }
        StringBuilder frase2LimpiaSb = new StringBuilder(frase2Limpia);
        for (int pos=0; pos<frase1Limpia.length();pos++){
            char c= frase1Limpia.charAt(pos);
            int posicionEncontrada=frase2Limpia.indexOf(c);
            if (posicionEncontrada==-1){
                return false;
            } else {
                frase2LimpiaSb.deleteCharAt(posicionEncontrada);
            }
        }
        return true;
    }

    private static String limpiarCadena(String frase) {
        StringBuilder fraseLimpia= new StringBuilder();
        String fraseMinuscula = frase.toLowerCase();
        for (int pos = 0; pos < fraseLimpia.length(); pos++){
            char c = fraseMinuscula.charAt(pos);
            if (Character.isLetterOrDigit(c)){
                fraseLimpia.append(c);
            }
        }
        return fraseLimpia.toString();
    }
}
