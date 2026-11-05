public class EjPosibleExamen2 {
    public static void main(String[] args) {
        int num =5;
        for (int x = 1; x <= num ; x++){
            for (int i=1; i<=x; i++)
                System.out.print(" ");
            for (int k=1; k <= (2*(num-x)-1); k++){
                if (k==num-(num-1)||k==2*(num-x)-1){
                    System.out.print("@");
                } else {
                    System.out.print(".");
                }
            }

            System.out.println();
        }
    }
}
