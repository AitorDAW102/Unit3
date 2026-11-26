import java.util.Scanner;

public class escaleraDeLetrasInvertidas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int x=sc.nextInt();
        for (int i=0; i<=x;i++){
            for (int y=0;y<(x-i);y++){
                if(y!=(x-i)-1){
                    if(i%2==0){
                        System.out.print("a");
                    } else {
                        System.out.print("b");
                    }
                } else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
