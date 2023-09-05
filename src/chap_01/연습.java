package chap_01;

public class 연습 {
    public static void main(String[] args) {
        System.out.println("1500만원중 114만엔을 벌고 120만원이 남았다");

        int i_01 = 1500;
        int i_02 = 114;
        int i_03 = 120;
        System.out.println(i_01 + "만원중 " + i_02 +"만엔을 벌고 " + i_03 + "만원이 남았다.");

        long l_01 = 15_000_000_000l;
        long l_02 = 1_140_000l;
        long l_03 = 1_200_000l;
        System.out.println(l_01 + "원중 " + l_02 + "엔을 벌고 " + l_03 + "원이 남았다");

        float f = 1000000000000f; // 소수점에만 사용할것
        double d = 1000000000; // 소수점에만 사용할것
        System.out.println(f);
        System.out.println(d);

        char c = '중';
        String s = "벌고";
        boolean b = true;
        System.out.println("1500만원 " + c + " 114만엔을 " + s + " 120만원이 남았다 " + b );

        //System.out.println("눈물이 난다");
//        System.out.println("이 길을 걸으면");
//        System.out.println("그 사람 손길이");
        /*System.out.println("자꾸 생각이 난다");
        System.out.println("붙잡지 못하고");*/
        System.out.println("가슴만 떨었지");
        System.out.println("내 아름답던 사람아");

        s = "더라";
        c = '거';
        System.out.println("사랑이란게 참 스린" + c + s);
        System.out.println("잡으려 할수록 더 멀어지" + s);
        System.out.println("이별이란 게 참 쉬운" + c + s);





    }
}
