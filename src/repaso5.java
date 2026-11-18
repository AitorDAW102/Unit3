import java.util.Scanner;
import java.util.StringTokenizer;

public class repaso5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("aitor@AitorServer:~ $ ");
        String comando = sc.nextLine();

        if (comprobarComando(comando)){
            System.out.println("aitor@AitorServer:~ $ ");
        } else{
            System.out.println("command not found");
            System.out.println("aitor@AitorServer:~ $ ");
        }
    }

    private static boolean comprobarComando(String comando) {
        StringTokenizer st = new StringTokenizer(comando);
        if (st.countTokens()<2){
            return false;
        }

        String orden = st.nextToken();
        if (orden.equals("cp")||orden.equals("mkdir")||orden.equals("rmdir")){
            return true;
        } else if (orden.equals("mv")|| orden.equals("rm")) {
            System.out.println("¿Esta seguro de esta accion en este fichero?");
            return true;
        } else {
            return false;
        }

    }
}
