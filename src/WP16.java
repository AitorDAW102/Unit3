import java.util.Scanner;

public class WP16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean esPar=true;
        int num=1;
        do {
            System.out.print("De cuantos pisos quieres el rombo: ");
            num = sc.nextInt();

            if (num%2==1){
                esPar=false;
            } else {
                System.out.println("NO ES UN NUMERO IMPAR");
            }
        } while (esPar);
        sc.close();

        int mitad= (int) (((double) num /2)+0.5);
        for (int x = 1; x <= num ; x++){
            if (x<mitad){
                for (int i = 1; i <=mitad-x; i++){
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2*x-1); k++){
                    System.out.print("@");
                }
            }  else if (x > mitad) {
                for (int i = 1; i <= (x - mitad); i++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * (num - x) + 1); k++) {
                    System.out.print("@");
                }
            } else {
                for (int k = 1; k <= (2*x-1); k++){
                    System.out.print("@");
                }
            }
            System.out.println();

        }
    }
}
