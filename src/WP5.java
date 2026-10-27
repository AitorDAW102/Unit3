import java.util.Scanner;

public class WP5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("DIME EL NUMERO A COMPROBAR SI ES PRIMO: ");
        int num= sc.nextInt();
        sc.close();
        if (comprobarPrimo(num)){
            System.out.println(num+ " es primo");
        } else{
            System.out.println(num + " no es primo");
        }

    }
    public static boolean comprobarPrimo(int num){
        boolean esPrimo = true;
        if (num <= 1) {
            esPrimo = true;
        } else if (num == 2) {
            esPrimo = true;
        } else if (num % 2 == 0) {
            esPrimo = false;
        } else if (num==5) {
            esPrimo=true;
        } else if (num == 7) {
            esPrimo=true;
        } else {
            for (int i = 3; i * i <= num; i += 2) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        return esPrimo;
    }


}
