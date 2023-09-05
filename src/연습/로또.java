package 연습;

public class 로또 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            System.out.println();
            System.out.println("로또번호");
            for (int j = 1; j <= 6; j++) {
                System.out.print((int) (Math.random() * 44) + 1 + ",");
            }
            System.out.println();
        }

    }
}
