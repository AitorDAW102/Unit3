import java.util.Scanner;

public class WP6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("DIME UN NUMERO Y TE DIGO TODOS LOS PRIMOS ANTERIORES: ");
        int num = sc.nextInt();
        sc.close();
        for (int i = 1; i <= num; i++){
            if (WP5.comprobarPrimo(i)){
                System.out.println(i);
            }

        }
    }
}
