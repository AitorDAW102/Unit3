import java.util.Scanner;

public class repaso2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime que frase palabra quieres repetir: ");
        String palabra=sc.nextLine();

        System.out.print("Dime con que lo quieres separar: ");
        String seperador=sc.nextLine();

        System.out.print("Dime cuantas veces: ");
        int repe=sc.nextInt();




        System.out.println(addToken(palabra,repe, seperador));
    }

    private static String addToken(String palabra, int repe, String separador) {
        StringBuilder sb= new StringBuilder();
        for (int i =0; i<repe;i++){
            sb.append(palabra+separador);
        }
        String procesada = sb.toString();
        return procesada;
    }
}
