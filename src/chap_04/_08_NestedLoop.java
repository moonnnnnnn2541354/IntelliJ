package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문

        // 직사각형 만들기
        for (int i = 0; i < 5; i++) { // j 5번 실행 (세로)
            for (int j = 0; j < 5; j++) { // * 5개 실행 (가로)
                System.out.print("*");
            }
            System.out.println();//줄 띄우기
        }

        //직삼각형 만들기
        for (int i = 0; i < 5; i++) { // j 5번 실행 (세로)
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //직삼각형 만들기 반대방향
        for (int i = 0; i < 5; i++) {// j 5번 실행 (세로)
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //마름모
//        aa**
//        a****
//        ******
//        a****
//        aa**
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("**");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2-i; k++) {
                System.out.print("**");

            }
            System.out.println();

        }
    }
}
