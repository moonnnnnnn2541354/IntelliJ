package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // Break
        // 치킨 집에서 매일 20마리만 판매 (1인당 1마리만 구매 가능)

        // For 사용
        int max = 20;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
            if(i == max) {
                System.out.println("금일 재료가 모두 소진되었습니다");
                break; // max 값만큼만 실행하고 종료
            }
        }
        System.out.println("영업을 종료 합니다.");


        // while 사용
        int index = 1; // 대기번호
        while (index <= 50){
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");
            if(index == max){
                System.out.println("금일 재료가 모두 소진 되었습니다.");
                break;
            }
            index++;// while 사용시 꼭 넣어야함
        }
        System.out.println("영업을 종료 합니다.");
    }
}
