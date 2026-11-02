public class Punishment {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000000; i++){
            System.out.println("Prometo quelo ejecutaré más rápido, for: " +i);
        }
        System.out.println();
        int x = 1;
        while (x<=1000000){
            System.out.println("Prometo quelo ejecutaré más rápido, while: "+x);
            x++;
        }
        System.out.println();
        x=1;
        do {
            System.out.println("Prometo quelo ejecutaré más rápido, do while: "+x);
            x++;
        } while(x<=1000000);
    }
}
