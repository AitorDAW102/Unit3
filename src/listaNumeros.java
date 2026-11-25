import java.util.Scanner;

public class listaNumeros {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=0;
        int sum=0;
        int impar=0;
        int contador=0;
        double media=0;
        do{
            System.out.print("Dame numero: ");
            num= sc.nextInt();
            sum=sum+num;
            if (num%2==1){
                if(num>impar){
                    impar=num;
                }
            }
            if (num!=0){
                contador++;
            }
        }while (num!=0);
        sc.close();
        media= (double) sum /contador;
        System.out.println("Suma: "+sum);
        System.out.println("Media: "+media);
        System.out.println("Mayor impar: "+impar);
        System.out.println("Numero de numeros: "+contador);
    }
}
