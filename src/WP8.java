import java.util.Scanner;

public class WP8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero y te digo su factorial: ");
        long num = sc.nextLong();
        sc.close();
        System.out.println("Su factorial es: "+factorial(num));
    }

    public static long factorial(long num){
        long factorial = 1;
        for (int i=1; i <= num; i++){
            factorial=factorial*i;
        }
        return factorial;
    }
}
