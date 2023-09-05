package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        int distance = 25; // 목표
        int move = 0; // 현재
        int height = 2; // 보너스
        while (move + height < distance) {//거짓일 경우 move가 +3 씩 증가
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 이동거리
        }
        System.out.println("도착");
        System.out.println("----- 반복문 #1 -----");

        //height가 엄청 클경우
        move = 0;
        height = 1;
//        while (move + height < distance){ // false
//            System.out.println("발차기를 계속 합니다.");
//            System.out.println("현재 이동 거리 : " + move);
//            move += 3;
//        }
//        System.out.println("도착");
//        System.out.println("----- 반복문 #2 -----");

        // Do While 반복문 *조건이 맞지 않아도 최초 1회는 실행
        do {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        while (move + height < distance);
        System.out.println("도착");
    }
}
