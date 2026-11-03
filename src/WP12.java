import java.util.Scanner;

public class WP12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("De cuanto vas a querer la matriz: ");
        int tamaño = sc.nextInt();
        sc.close();

        for (int x=1; x<=tamaño;x++){
            for (int y=1; y<=tamaño;y++){
                if (y==tamaño-x+1){
                    System.out.print(x);
                }else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
