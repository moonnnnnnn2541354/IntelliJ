package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // 문자열비교, 같으면 true,아니면 false
        System.out.println(s1.equals("Java")); // true
        System.out.println(s2.equals("python")); // false

        System.out.println(s2.equalsIgnoreCase("python"));
        //대소문자 구분없이 문자열 내용만 같은지 확인

        // 문자열 비교 심화버전
        s1 = "1234"; //
        s2 = "1234"; //
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // ture
        
        // new String 을 쓰게 되면 같은 내용이라면 저장위치가 달라짐
        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false = 메모리 저장위치가 달라서 false

        

    }
}
