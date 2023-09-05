package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        //삼항 연산자
        // 결과 = 조건 ? 참의 경우 결과값 : 거짓의 경우 결과값
        int x = 3;
        int y = 5;
        int max = (x > y) ? x : y;
        System.out.println(max); // x가 크다 진실, 작다 거짓

        int min = (x < y) ? x : y;
        System.out.println(min); // x가 작다 진실, 크다 거짓

        boolean b = (x == y) ? true : false;
        System.out.println(b); // x,y가 같으면 진실, 아니면 거짓
        
        String s = (x != y) ? "달라요" : "같아요";
        System.out.println(s); // x가 같지않다 달라요, 같다면 같아요
    }
}
