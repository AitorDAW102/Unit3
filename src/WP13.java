import java.util.Scanner;

public class WP13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("De que numero vas a querer saber si es Armstrong o no: ");
        int num = sc.nextInt();
        if (armstrong(num)){
            System.out.println(num+" es un numero de armstrong");
        } else {
            System.out.println(num+" no es un numeor de armstrong");
        }

    }

    static boolean armstrong(int num){
        int cubo = 0;
        int resto=num;
        for (int i = 1; i <= 3; i++){
            cubo = cubo + (int) Math.pow(resto % 10, 3);
            resto=resto/10;
        }
        return cubo == num;
    }
}
