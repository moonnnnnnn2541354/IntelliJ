package 연습;

import java.util.Scanner;

public class 랜덤_숫자_맞추기 {
    public static void main(String[] args) {
        int input = 0, answer = 0;

        answer = (int) (Math.random() * 100) + 1;//1~100사이
        System.out.println("answer=" + answer);
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1~100사이 숫자 입력");
            input = scanner.nextInt();

            if (input > answer) {
                System.out.println("다운");
            } else if (input < answer) {
                System.out.println("업");

            }
        } while (input != answer);
        System.out.println("정답");


    }
}