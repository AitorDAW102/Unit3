import java.util.Locale;
import java.util.Scanner;

public class repaso3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la frase");
        String cadena = sc.nextLine().toLowerCase();
        if (mouseElephant(cadena)){
            System.out.println("Se repiten el mismo numero de veces");
        } else {
            System.out.println("No se repiten el mismo numero de veces");
        }
    }

    private static boolean mouseElephant(String cadena) {
        int contadorElephant = 0;
        int contadorMouse = 0;

        int index = cadena.indexOf("elephant");
        while (index != -1) {
            contadorElephant++;
            index = cadena.indexOf("elephant", index + "elephant".length());
        }
        index = cadena.indexOf("mouse");
        while (index != -1) {
            contadorMouse++;
            index = cadena.indexOf("mouse", index + "mouse".length());
        }

        return contadorElephant == contadorMouse;
    }
}
