package chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지 (랜덤클래스)
        Random random = new Random();
        System.out.println("랜덤 정수 : "+ random.nextInt());
        System.out.println("랜덤 정수 (범위) : "+ random.nextInt(10));// 0~9 중
        System.out.println("랜덤 실수 : "+ random.nextDouble());

        // 5.0 ~ 10.0 실수를 랜덤으로 뽑으려면?
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 (범위) : "+ (min + (max - min) * random.nextDouble()));

        System.out.println("랜덤 boolean : "+ random.nextBoolean());

        // 로또 번호를 랜덤으로 뽑는 방법 1~45
        for (int i = 0; i < 6; i++) {
            System.out.println("로또번호 : " + (random.nextInt(45) + 1));
        }

    }
}
