import java.util.Scanner;

public class EjemploTry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num1=sc.nextInt();
        System.out.print("Introduce otro numero: ");
        int num2=sc.nextInt();
        sc.close();
        int num3;
        try { //se coloca el codigo que puede dar error
            num3=num1/num2;
            System.out.println("El resultado de la division es "+num3);
        } catch (Exception e){ //en caso de error lo muestra
            System.out.println(e.getMessage());
            System.out.println("No dividas por ese numero");
        } finally { //siempre se ejecuta da igual error o no
            System.out.println("Listo");
        }
        System.out.println("------------FINAL------------");
    }
}
