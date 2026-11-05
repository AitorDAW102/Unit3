public class EjPosibleExamen2b {
    public static void main(String[] args) {
        int num =13;
        for (int i = 1; i <= num; i++) {
            if (i == num) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("+");
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    if (j == 1 || j == i) {
                        System.out.print("+");
                    } else {
                        if (j % 2 != 0 && j != num - 1) {
                            System.out.print(2);
                        } else {
                            System.out.print(1);
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
