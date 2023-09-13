package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        // 주민번호 출력
        // 1. 901231-1 (901231-1234567)
        // 2. 030708-4 (030708-4123456)


        String m = "901231-1234567";
        System.out.println(m.substring(m.indexOf("9"),m.lastIndexOf("2")));

        String w = "030708-4123456";
        System.out.println(m.substring(0,8));

    }
}
