import java.util.Scanner;

public class EjPosibleExamen1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=0;
        int num2=0;
        System.out.println("Dime 2 años y te digo todos los años bisiestos");
        do {
            System.out.print("Dime el primer año: ");
            num1=sc.nextInt();

            System.out.print("Dime el segundo año: ");
            num2=sc.nextInt();

        } while (num1<0&&num2<0);

        System.out.println("Estos son los años");

        for (int i=num1; i<=num2; i++){
            if (EjPosibleExamen1.comprobarBisiesto(i)){
                System.out.println(i);
            }
        }
    }
}
