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

        if (num1 + num2 == num3){
            System.out.println("La suma de "+num1+", "+ num2+" es igual a "+num3);
            return true;
        } else if (num1 + num3 == num2){
            System.out.println("La suma de "+num1+", "+ num3+" es igual a "+num2);
            return true;
        }else if (num2 + num3 == num1) {
            System.out.println("La suma de " + num2 + ", " + num3 + " es igual a " + num1);
            return true;
        } else {
            return false;
        }
    }

}
