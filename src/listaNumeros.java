import java.util.Scanner;

public class listaNumeros {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=0;
        int sum=0;
        int sumPar=0;
        int impar=0;
        int contador=0;
        double media=0;
        do{
            System.out.print("Dame numero: ");
            num= sc.nextInt();
            sum=sum+num;
            if (num%2!=0){
                if(impar==0||num>impar){
                    impar=num;
                }
            }else {
                sumPar=sumPar+num;
            }
            if (num!=0){
                contador++;
            }
        }while (num!=0);
        sc.close();
        media= (double) sum /contador;
        System.out.println("Suma: "+sum);
        System.out.println("Suma par: "+sumPar);
        System.out.println("Media: "+media);
        if (impar==1){
            System.out.println("Mayor impar: "+impar);
        } else{
            System.out.println("No ha habido impares");
        }
        System.out.println("Numero de numeros: "+contador);
    }
}
