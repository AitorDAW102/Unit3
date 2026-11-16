import java.util.Scanner;

public class WP20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la frase para adivinar luego: ");
        String palabra = sc.nextLine().toUpperCase();
        boolean descubierto = false;

        StringBuilder adivinando = new StringBuilder();
        for (int i = 0; i < palabra.length(); i++) {
            adivinando.append("_");
        }

        String letra;

        while (!descubierto){
            System.out.println(adivinando);
            System.out.print("Dime una letra de la palabra: ");
            letra = sc.nextLine().toUpperCase();

            char c= letra.charAt(0);
            for (int i = 0; i < adivinando.length(); i++) {
                if (palabra.charAt(i) == c) {
                    adivinando.setCharAt(i, c);
                }
            }
            if (adivinando.indexOf("_")==-1){
                descubierto = true;
            }
        }
        System.out.println("HAS GANADO TU PALABRA ES: " + adivinando);
    }
}
