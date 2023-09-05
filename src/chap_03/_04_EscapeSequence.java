package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수문자, 이스케이프 문자
        //명칭(Escape Sequence, Escape Character, Special Character) 모두 같은말
        // \n \t \\ \" \'

        // \n : 줄바꿈
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");
        System.out.println("자바가\n너무\n재밌어요");
        
        // \t : 띄어쓰기
        System.out.println("해물파전 9000원");
        System.out.println("해물파전\t9000원");
        System.out.println("해물파전\t\t9000원");

        // \\ : \ 표시됨
        System.out.println("C:\\Program Files\\Java");
        
        // \",\' : ",' 표시됨
        System.out.println("단비가 \"냐옹\"이라고 했어요");
        System.out.println("단비가 \'냐옹\'이라고 했어요");// ""사이에 '' 넣어도 상관없음
        System.out.println("단비가 '냐옹'이라고 했어요");

        // \' : ' 표시됨
        char c = 'A';
        c = '\'';
        System.out.println(c);
        
    }
}
