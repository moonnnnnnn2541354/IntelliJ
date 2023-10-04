package chap_10;

public class _02_AnonymousClass2 {// 추상클래스
    public static void main(String[] args) {
        HomeMadeBurger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();
        System.out.println();

        HomeMadeBurger broMadeBurger = getBroMadeBurger();
        broMadeBurger.cook();
        System.out.println();
    }



    public static HomeMadeBurger getMomMadeBurger(){ // 추상 클래스
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 엄마표 수제 버거");
                System.out.println("재료 : 빵, 소고기패티, 해쉬브라운, 양상추, 마요네즈, 피클");
            }
        };
    }

    private static HomeMadeBurger getBroMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 동생표 군대리아");
                System.out.println("재료 : 빵, 치킨패티, 양배추샐러드, 딸기잼, 치즈, 삶은 계란");
            }
        };
    }
}

abstract  class HomeMadeBurger{
    public abstract void cook();
}