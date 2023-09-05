package 연습;

public class 확률 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            int percent = 75;
            if (percent >= Math.random()*100){
                System.out.println("강화 성공");
            }else{
                System.out.println("강화 실패");
            }

        }

    }
}
