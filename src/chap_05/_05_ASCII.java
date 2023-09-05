package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드 (ANSI) : 미국 표준 코드
        // 숫자는 0부터 시작하며 아스키코드는  48 ~
        // 알파벳 대문자 는 65 ~
        // 알파벳 소문자 는 97 ~

        char c = 'A';
        System.out.println(c);
        System.out.println((int)c);

        c = 'B';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        //
        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) { //세로
            for (int j = 0; j < seats3[i].length; j++) { //가로
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }
        for (int i = 0; i < seats3.length; i++) { // 세로값
            for (int j = 0; j < seats3[i].length; j++) { // 가로값
                seats3[7][8] ="___"; // 설정값 변경 가능
                System.out.print(seats3[i][j] + ",");
            }
            System.out.println();
        }
    }

}
