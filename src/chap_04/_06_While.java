package chap_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 While
        int distance = 25; //전체거리
        int move = 0; //이동거리
        while (move < distance) {// 전체거리보다 작으면 반복수행
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; //3만큼 이동
        }
        System.out.println("도착");

        // 무한루프
//        move = 0;
//        while (move < distance) {// 전체거리보다 작으면 반복수행
//            System.out.println("발차기를 계속 합니다.");
//            System.out.println("현재 이동 거리 : " + move);
//        }
//        System.out.println("도착");
    }
}
