package chap_04;

public class _02_Else {
    public static void main(String[] args) {
        //조건문 If Else
        int hour = 10;
        if (hour < 14){
            System.out.println("아이스 아메리카노 +1");
        }
        else{ // if 조건 외의 경우이면 실행
            System.out.println("아이스 아메리카노 (디카페인) +1");
        }
        System.out.println("커피 주문 완료 #1");

        hour = 13;
        boolean morningCoffee= false;
        if(hour >= 14 || morningCoffee == true){
            System.out.println("아이스 아메리카노 (디카페인) +1");
        }
        else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");
    }
}
