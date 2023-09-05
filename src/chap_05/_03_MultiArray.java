package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 다차원 배열
        // 오늘은 2차원배열 수업

        // 영화관 좌석
        // A1 - A5
        // B1 - B5
        // C1 - C5

        // 1차원 배열
//        String[] A = {"A1","A2","A3","A4","A5"};
//        String[] B = {"B1","B2","B3","B4","B5"};
//        String[] C = {"C1","C2","C3","C4","C5"};
        
        // 2차원 배열
        String[][] seats = new String[][]{
                {"A1","A2","A3","A4","A5"},
                {"B1","B2","B3","B4","B5"},
                {"C1","C2","C3","C4","C5"}
        };
        // 출력방법
        System.out.println(seats [1][1]); // B2
        System.out.println(seats [2][4]); // C5

        //
        String[][] seats2 = {
                {"A1","A2","A3"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}
        };
        System.out.println(seats2[0][2]);
        System.out.println(seats2[1][3]);
        System.out.println(seats2[2][4]);




    }
}
