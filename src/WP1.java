import java.util.Scanner;

public class WP1 {
    public static void main(String[] args) {
        System.out.println("¿La suma de los 2 primeros numeros es igual al tercero?");
        if (correctSum()){
            System.out.println("La suma es correcta");
        } else  {
            System.out.println("La suma es incorrecta");
        }

    }

    private static boolean correctSum() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int sum = num1+num2;

        return sum == num3;
    }

}
