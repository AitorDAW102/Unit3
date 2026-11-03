import java.util.Scanner;

public class WP7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero primo y te digo su omirp en caso de que lo sea: ");
        int num= sc.nextInt();
        sc.close();
        int invertedo = invertirNumero(num);

        if (WP5.comprobarPrimo(num)==WP5.comprobarPrimo(invertedo)){
            System.out.println("Los numeros"+num+" y "+invertedo+" son primos");
        } else {
            System.out.println("Los numeros "+num+" y "+invertedo+" no son primos");
        }
    }

    static int invertirNumero(int num){
        int numTemp = num;
        int newNum=0;
        while (numTemp>0){
            int digito = numTemp%10;
            newNum=(newNum*10)+digito;
            numTemp=numTemp/10;
        }
        return newNum;
    }
}
