package chap_06;

public class _02_Parameter {
    // Parameter 매개변수 (전달값)
    // public  static void 명칭(전달값) ***************
    // public static void main(String[] args){
    //    명칭();}

    public static void power(int number) {
        int result = number * number;
        System.out.println(number + "의 2승은 " + result);
    }

    // public  static void 명칭(전달값1,전달값2){ ***************
    // int result = 1;
    // for (int i = 0; i < 전달값2; i++){
    // result *= 전달값1;}
    // sout()}
    // public static void main(String[] args){
    //    명칭(전달값1 수치,전달값2 수치);}
    public static void powerByExp(int number, int exponent){//exponent : 몇승
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number; // result * number
        }
        System.out.println(number + "의 " + exponent + "승은 " + result);
    }


    public static void main(String[] args) {
        power(2);
        power(3);

        powerByExp(2,3);
        powerByExp(3,4);


    }
}
