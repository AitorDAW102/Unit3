public class Piramiderara {
    public static void main(String[] args) {
        int i=0;
        bucleext:
        while(i<20){
            i++;
            for (int k=1;k<(20-i);k+=2){
                System.out.print("_");
            }
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(""+i);

        }

    }
}
