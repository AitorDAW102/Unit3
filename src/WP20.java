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

        char letra;
        int posicion;

        while (!descubierto){
            System.out.println(adivinando);
            System.out.print("Dime una letra de la palabra: ");
            letra = sc.nextLine();

            posicion=adivinando.in
            if (posicion!=-1){
                adivinando.setCharAt(posicion, letra);
            }
        }
    }
}
