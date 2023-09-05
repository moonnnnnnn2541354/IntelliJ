package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        //참조
        // 기본 자료형(int, float, double, long ,boolean ...)

        int[] i = new int[3];
        System.out.println(i[0]);//0


        double[] d = new double[3];
        System.out.println(d[0]);//0.0

        // 참조 자료형( String ... )
        // 메소드를 가짐

        String[] s = new String[3];
        System.out.println(s[0]); // null

        Camera[] c = new Camera[3];
        System.out.println(c[0]); // null

        System.out.println();

        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a);
        System.out.println(b);

        b = 30;
        System.out.println(a);
        System.out.println(b);

        System.out.println();

        System.out.println("1차");
        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name);
        System.out.println(c2.name); // 따로 작용

        System.out.println("2차 c2=c1");
        c2 = c1; //  c1,c2 같이 작용하게끔 변하게됨
        System.out.println(c1.name);
        System.out.println(c2.name);

        System.out.println("3차 c2 변경");
        c2.name = "고장난 카메라"; // 이미 같이 묶였기 때문에 c1,c2 "고장난 카메라"
        System.out.println(c1.name);
        System.out.println(c2.name);

        System.out.println("4차 메소드 적용");
        changeName(c2);// 이후에는 어떻게 해도 c1,c2 모두 같이 바뀜
        System.out.println(c1.name);
        System.out.println(c2.name);

        System.out.println("5차 해제");
        c2 = null; // c2 해제
        System.out.println(c1.name);
        // System.out.println(c2.name); 실행 안됨


    }

    public static void changeName (Camera camera){
        camera.name = "잘못된 카메라";

    }
}
