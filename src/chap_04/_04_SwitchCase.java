package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그외 : 장학금 대상 아님


        //if else 이용
        //여러 조건 또는 범위에 해당하는 조건
        int ranking = 4;
        if (ranking == 1){
            System.out.println("전액 장학금");
        }
        else if (2 <= ranking && ranking <= 3){
            System.out.println("반액 장학금");
        }
        else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");



        // Switch Case 이용
        // 명확한 케이스가 있는 경우
        ranking = 5;
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

        // case 다음 break 를 안쓰면 그 전까지 모두 적용됨
        ranking = 4;
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #3");
        
        // case 다음 break 를 안쓰면 그 전까지 모두 적용됨
        int grade = 5;
        int price = 7000;
        switch (grade){
            case 4:
                price += 1000; // 1,2,3 적용 price + 3000
            case 10:
                price += 1000; // 2,3 적용 price + 2000
            case 1:
                price += 1000; // 3 적용 price + 1000
                break;
        }
        System.out.println(grade + "등급 제품의 가격 :" + price + "원");

    }
}
