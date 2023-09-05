package chap_04;

public class 강의43_문제 {
    public static void main(String[] args) {
        //키워드 시간
        //차량 여부
        //시간당 4000원, 일일최대 30000원
                
        // 경차 또는 장애인차량은 50% 할인
        // 일반 차량 5시간 주차 시 20000원
        // 경차 5시간 주차 시  10000원
        // 장애인 차량 10시간 주차 시 15000원
        //조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오.

        int hour = 10;
        boolean sCar = true;
        boolean dCar = false;
        int fee = hour * 4000; //시간당 4000원
        if (fee > 30000){
            fee = 30000;
        }

        if(sCar || dCar){
            fee /= 2;
        }

        System.out.println("주차요금 " + fee + "원 나왔습니다.");
        

    }
}
