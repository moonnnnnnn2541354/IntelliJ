package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러개를 저장하는 연속된 공간
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + " 하나");
        System.out.println(coffeeRachel + " 하나");
        System.out.println(coffeeChandler + " 하나");
        System.out.println(coffeeMonica + " 하나");
        System.out.println("주세요.");
        
        // 배열 선언 방법 (첫번째)
//       1. String[] coffees = new String[4];
//       2. String coffees[] = new String[4];  1,2 출력되는건 동일함

        // 배열 선언 방법 (두번째)
//        String[] coffees = new String[4];
//        coffees[0] = "아메리카노"; // 시작은 0부터 시작
//        coffees[1] = "카페모카";
//        coffees[2] = "라떼";
//        coffees[3] = "카푸치노";

        // 배열 선언 방법 (세번째)
//        String[] coffees = new String[] {"아메리카노","카페모카","라떼","카푸치노"};

        // 배열 선언 방법 (네번째)
//        String[] coffees = {"아메리카노","카페모카","라떼","카푸치노"};

        String[] coffees = {"아메리카노","카페모카","라떼","카푸치노"};
        System.out.println(coffees[0] + " 하나");
        System.out.println(coffees[1] + " 하나");
        coffees[2] = "에스프레소";
        System.out.println(coffees[2] + " 하나"); // 라떼 -> 에스프레소로 변경
        System.out.println(coffees[3] + " 하나");
        System.out.println("주세요.");

        // 다른 자료형?
        int[] i = new int [3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);

        double [] d = new double[] {10.0, 11.2, 13.5};
        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);

        boolean[] b = {true, true, false};
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
    }
}
