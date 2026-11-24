import java.util.Scanner;
import java.util.StringTokenizer;

public class comprobarWebSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url;
        int contador=0;
        boolean subdominio=false;
        do {
            System.out.print("Inserte Web: ");
            url = sc.nextLine().toLowerCase();
        } while (url.isEmpty());

        StringTokenizer st1 = new StringTokenizer(url,"/");
        String protocolo= st1.nextToken();
        if (protocolo.equals("https:")){
            System.out.println("Conexion segura: SI");
        } else {
            System.out.println("Conexion segura: NO");
        }
        StringTokenizer st2 = new StringTokenizer(st1.nextToken(),".");
        while (st2.hasMoreTokens()){
            String token = st2.nextToken();
            if (contador==0) {
                if (token.equals("www")) {
                    System.out.println("Comprobando conexion: OK");
                } else {
                    System.out.println("Comprobando conexion: ERROR");
                    return;
                }
            } else if (st2.countTokens()==0) {
                if (token.equals("es")){
                    System.out.println("conexion nacional");
                } else if (token.equals("org")){
                    System.out.println("conexion gubernamental");
                }else if(token.equals("com")){
                    System.out.println("conexion global");
                } else {
                    System.out.println("conexion desconocida");
                }
            } else {
                if (!subdominio){
                    System.out.println("mostrando pagina: "+token);
                    subdominio=true;
                } else {
                    System.out.println("subdominio: "+token);
                }
            }
            contador++;
        }
    }
}
