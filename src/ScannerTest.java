import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        System.out.println("El numero mas pequeño es: "+getMasPequeno());
    }

    public static int getMasPequeno(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int devolver = 0;
        if (num1<num2){
            if (num1<num3){
                devolver=num1;
            } else {
                devolver=num3;
            }
        } else if (num2<num3) {
            devolver = num2;
        } else {
            devolver = num3;
        }

        return devolver;
    }
}

