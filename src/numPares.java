public class numPares {
    public static void main(String[] args) {
        int num = 2;

        for (int i = 1; i <= 5; i++){
            System.out.println("for: "+i*num);
        }
        System.out.println();
        int x = 1;
        while (x<=5){
            System.out.println("while: "+num*x);
            x++;
        }
        System.out.println();
        x=1;
        do {
            System.out.println("do-while: "+num*x);
            x++;
        } while(x<=5);
    }
}
