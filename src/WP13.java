import java.util.Scanner;

public class WP13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("De que numero vas a querer saber si es Armstrong o no: ");
        int num = sc.nextInt();
        sc.close();
        if (armstrong(num)){
            System.out.println(num+" es un numero de armstrong");
        } else {
            System.out.println(num+" no es un numero de armstrong");
        }

    }

    static boolean armstrong(int num){
        int cubo = 0;
        int resto=num;
        int digitos=num;
        int nDigitos=0;

        while (digitos>0) {
            digitos=digitos/10;
            nDigitos++;
        }
        for (int i=1; i <= nDigitos; i++){
            cubo = cubo + (int) Math.pow(resto % 10, nDigitos);
            resto=resto/10;
        }
        return cubo == num;
    }
}
