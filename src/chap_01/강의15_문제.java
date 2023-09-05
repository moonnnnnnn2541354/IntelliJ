package chap_01;

public class 강의15_문제 {
    public static void main(String[] args) {
        String s = "상암08";
        int i = 3;
        double d = 1.2;
        System.out.println(s + "번 버스");
        System.out.println("약 " + i + "분 후 도착");
        System.out.println("남은 거리 " + d + "km");

        String ss = "1234";
        ss = Integer.toString(1234);
        i = Integer.parseInt("3");
        d = Double.parseDouble("1.2");
        System.out.println(ss + "번 버스");
        System.out.println("약 " + i + "분 후 도착");
        System.out.println("남은 거리 " + d + "km");
    }
}
