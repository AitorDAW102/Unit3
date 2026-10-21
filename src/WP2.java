import java.util.Scanner;

public class WP2 {
    public static void main(String[] args) {
        System.out.println("Comprobador de par o impar");
        if (isPar()){
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
    private static boolean isPar(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num % 2 == 0;

    }
}
