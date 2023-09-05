package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        // 매장의 경우
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        // 매장 인사말이 바뀐경우
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        //매장 이름이 바뀐경우
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("----- 반복문 사용 -----");
        
        // For 사용
        for (int i = 0 ; i < 10 ; i++ ){
            // System.out.println("어서오세요. 나코입니다." + i);
            // System.out.println("환영합니다. 나코입니다." + i);
            System.out.println("환영합니다. 코나입니다.");
        }

        // 짝수만 출력 (for i 만 적고 엔터)
        for (int i = 0 ; i < 10 ; i += 2){
            System.out.print(i); // println 에서 ln 빼면 줄 띄우기 없어짐
        }
        System.out.println(); // 줄 띄우기용

        // 홀수만 출력
        for (int i = 1 ; i < 10 ; i += 2){
            System.out.print(i);
        }
        System.out.println(); // 줄 띄우기용

        // 거꾸로
        for (int i = 5 ; i > 0 ; i--){
            System.out.print(i);
        }
        System.out.println(); // 줄 띄우기용

        // 1~10총합 = 55
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
            System.out.println("현재까지 총합은 " + sum + "입니다.");
            }
        System.out.println("1~10 총합은 " + sum + "입니다.");

    }
}
