package chap_03;

public class _02_String_02 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        
        // 문자열 변환
        System.out.println(s.replace(" and",","));
        // " and"를 ","로 변환시켜줌

        System.out.println(s.substring(7));
        //인덱스 기준 7번째 이전 내용은 삭제
        System.out.println(s.substring(s.indexOf("Java")));
        //Java부터 시작
        System.out.println(s.substring(s.indexOf("Java"),(s.indexOf("."))));
        // Java 부터 .이전문자 입력
        
        // 공백 제거
        s = "           I love Java.           ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞뒤 공백 모두 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + "," + s2);
        System.out.println(s1.concat(",").concat(s2)); // 문자 결합



    }
}
