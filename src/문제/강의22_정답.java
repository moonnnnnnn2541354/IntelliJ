package 문제;

public class 강의22_정답 {
    public static void main(String[] args) {
        //조건
        // 키가 120cm 이상만 탑승가능
        //삼항 연산자 이용할것

        int height = 120;
        String result = (height >= 120) ? "가능합니다" : "불가능합니다";
        System.out.println("키가 " + height + "cm 이므로 탑승이 " + result);

        // ln 빼면 이렇게도 가능
        System.out.print("키가 ");
        System.out.print(height);
        System.out.print("cm 이므로 탑승이 ");
        System.out.print(result);

    }
}
