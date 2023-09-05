package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        int hour = 11;
        
        // if  하나의 문장만 쓸때는 {} 필요없음
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷 추가");
        }
        System.out.println("커피 주문 완료 #1");


        hour = 10;
        boolean morningCoffee = false;
        if (hour < 14 && !morningCoffee == true){
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");

        hour = 15;
        morningCoffee = true;
        if (hour >= 14 || morningCoffee == true){
            System.out.println("아이스 아메리카노");
            }
        System.out.println("커피 주문 완료 #3");



    }

}
