package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        boolean 김치찌개 = false;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;
        System.out.println(김치찌개||계란말이||제육볶음); // 하나라도 true이면 true
        System.out.println(김치찌개 && 계란말이 && 제육볶음);//모두 true이면 true

        김치찌개 = true;
        계란말이 = true;
        제육볶음 = true;
        System.out.println(김치찌개 && 계란말이 && 제육볶음);//모두 true이면 true

        // &&는 모두 true 면 true
        System.out.println((5 > 3) && (3 > 1));//true
        System.out.println((5 > 3) && (3 < 1));//false
        System.out.println((5 < 3) && (3 < 1));//false

        // ||는 하나라도 true 면 true
        System.out.println((5 > 3) || (3 > 1));//true
        System.out.println((5 > 3) || (3 < 1));//true
        System.out.println((5 < 3) || (3 < 1));//false
        
        //논리 부정연산자
        System.out.println(!true); //false
        System.out.println(!false); //true
        System.out.println(!(5 == 5)); //false
        System.out.println(!(5 == 3)); //true
    }
}
