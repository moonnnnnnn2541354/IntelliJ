package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // For 사용
        int max = 20; // 최대 수
        int sold = 0; // 현재 수
        int noShow = 17; // 소모되지 않은 수
        for (int i = 1; i < 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            if (i == noShow){
                System.out.println(i + "번 손님, 안계시면 다음번호 부릅니다.");
                continue;
            }

            sold++; // 판매처리
            if (sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다");
                break;
            }

        }
        System.out.println("영업을 종료합니다");

        // While 문
        sold = 0;
        int index =0; // 번호
        //while (index <= 50){
        while (true){ //밑에 if(sold == max) 가 있어서 이렇게 해도 무한루프에 안빠짐
            index++;// while할때는 꼭 넣어야함 ********************
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");

            if(index == noShow){
                System.out.println(index + "번 손님, 안계시면 다음번호 부릅니다.");
                continue;
            }

            sold++; //판매처리
            if (sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");
    }
}
