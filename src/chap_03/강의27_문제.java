package chap_03;

public class 강의27_문제 {
    public static void main(String[] args) {
        // 901231-1234567 = 901231-1(남자)

        String m = "901231-1234567";
        System.out.println(m.substring(0,8));
        System.out.println(m.substring(m.indexOf("9"),m.lastIndexOf("2")));
        System.out.println(m.substring(0,m.indexOf("-") + 2));




    }
}
