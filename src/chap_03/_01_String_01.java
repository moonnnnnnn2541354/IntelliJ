package chap_03;

public class _01_String_01 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        //문자열의 길이 *몇글자 이상 적으시오 등등 문구를 남길때 사용
        System.out.println(s.length()); // 29 = 문자열 수
        
        //대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로 변경
        System.out.println(s.toLowerCase()); // 소문자롤 변경

        // 포함 관계 (포함되면 true, 아니면 false)
        System.out.println(s.contains("Java")); // true
        System.out.println(s.contains("C#")); // false
        System.out.println(s.indexOf("Java")); // 7 : 몇번째 문자열부터인지
        System.out.println(s.indexOf("C#")); // -1 : 없는걸 적으면 -1
        System.out.println(s.indexOf("and"));
        System.out.println(s.lastIndexOf("and")); // 마지막 and의 위치
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true
        System.out.println(s.endsWith(".")); // 이 문자열로 끝이나면 ture
    }
}
