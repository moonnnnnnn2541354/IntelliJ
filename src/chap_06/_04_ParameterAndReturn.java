package chap_06;

public class _04_ParameterAndReturn {
    // 전달값 Parameter + 반환값 Return 활용
    // public static int 명칭(전달값) {
    //        int result = 전달값 * 전달값;
    //        return result;

    // public static int 명칭(전달값1, 전달값2) {
    //        int result = 1;
    //        for (int i = 0; i < 전달값2; i++) {
    //            result *= 전달값1;
    //        }
    //        return result;


//    public static void power(int number){ // Parameter 매개변수
//        int result = number * number;
//        System.out.println(number + " 의 2 승은 " + result);
//    }

    public static int getPower(int number) {
        int result = number * number;
        return result;
        // return number * number;
    }
//    public static void powerByExp(int number, int exponent){
//        int result = 1;
//        for (int i = 0; i < exponent; i++) {
//            result *= number; // result는 re * nu
//
//        }
//        System.out.println(number + "의 " + exponent + " 승은 "+ result);
//    }

    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number; // result는 re * nu
        }
        return result;

    }


    public static void main(String[] args) {

        int retVal = getPower(2);
        System.out.println(retVal); // 2 * 2 = 4

        retVal = getPower(3);
        System.out.println(retVal); // 3 * 3 = 9

        retVal = getPowerByExp(3, 3);
        System.out.println(retVal); // 3 * 3 * 3 = 27

        // retVal = getPowerByExp(2,4); 생략하고 sout에 직접 써도됨
        System.out.println(getPowerByExp(2, 4));// 2 * 2 * 2 * 2 = 16

    }


}
