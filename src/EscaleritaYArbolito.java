import java.util.Scanner;

public class EscaleritaYArbolito {
    public static void main(String[] args) {
        System.out.println("ESCALERA");
        for (int x = 1; x <=5; x++){
            for (int y = 1; y <= x; y++){
                System.out.print("@");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("ARBOLITO");
        Scanner sc=new Scanner(System.in);

        System.out.print("De cuantos pisos quieres el arbolito: ");
        int num = sc.nextInt();
        System.out.println();
        sc.close();
        for (int x = 1; x <= num ; x++){
            for (int i = 1; i <=num-x; i++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*x-1); k++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
