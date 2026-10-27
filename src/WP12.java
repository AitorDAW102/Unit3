public class WP12 {
    public static void main(String[] args) {
        for (int x=1; x<=5;x++){
            for (int y=1; y<=5;y++){
                if (y==5-x+1){
                    System.out.print(x);
                }else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
