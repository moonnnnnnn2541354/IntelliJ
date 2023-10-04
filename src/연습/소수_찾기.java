package 연습;

public class 소수_찾기 {
    public static void main(String[] args) {

        
        boolean result = true; // 소수 여부를 저장하는 변수
        int n = 93;
        System.out.println("숫자 입력 : " + n);

        if (n <= 1) {
            result = false; // 1. 입력한 숫자가 1 이하 인지 확인
        } else {
            for (int i = 2; i * i < n; i++) { // 2. 2부터 n의 제곱근까지 나눔
                if (n % i == 0) {
                    result = false; // 결과값이 0이 나오면 소수가 아님(false)
                    break; // 소수 여부를 판별했으므로 더 이상 반복할 필요가 없습니다.
                }
            }
        }

        if (result) { // 결과갑 출력
            System.out.println("소수가 맞습니다."); // 소수일 경우 "true" 출력
        } else {
            System.out.println("소수가 아닙니다."); // 소수가 아닐 경우 "false" 출력
        }
    }
}
