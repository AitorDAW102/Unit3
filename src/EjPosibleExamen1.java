import java.util.Scanner;

public class EjPosibleExamen1 {
    public static void main(String[] args) {
        int year=0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Que año vas a querer comprobar si es bisiesto o no: ");
            year = sc.nextInt();
        } while (year<0);
        sc.close();

        if (comprobarBisiesto(year)){
            System.out.println("El año es bisiesto");
        } else{
            System.out.println("El año no es bisiesto");
        }


    }

    public static boolean comprobarBisiesto(int num){
        if (num%4==0 && num%100!=0 || num%400==0 ){
            return true;
        } else if (num%100==0) {
            return false;
        } else{
            return false;
        }

    }
}
