public class EjemploIf {
    public static void main(String[] args) {
        int matematicas = 5;
        int lengua = 3;

        if (matematicas>=5 && lengua>=5) {
            System.out.println("Has aprobado todas las asiganturas");
        } else if (matematicas >=5 || lengua >=5){
            System.out.println("Solo has aprobado una asiganatura");
        } else {
            System.out.println("Has suspendido todo");
        }
    }
}
