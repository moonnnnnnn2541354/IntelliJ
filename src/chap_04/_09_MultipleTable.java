package chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        //구구단

        for (int i = 2; i < 10; i++) { // 2~9까지만 나오게 설정된거야 <<<<<<<<<<< 1차실행
            for (int j = 1; j < 10; j++) { //<<<<<<<<<<<<<< 2차실행
                System.out.println(i + " * " + j + " = " + (i * j));// 2 * 1 = 2
            }
            System.out.println();

        }
    }
}
