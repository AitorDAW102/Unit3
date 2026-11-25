import java.util.Scanner;

public class ullman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;
        do{
            System.out.print("Introduce un numero mayor que 1: ");
            num=sc.nextLong();
        }while(num<2);
        comprobadorUllman(num);
    }

    private static void comprobadorUllman(long num) {
        System.out.println(num);
        while (num!=1){
            if (num%2==0){
                num=num/2;
            } else{
                num=num*3+1;
            }
            System.out.println(num);
        }
    }
}
