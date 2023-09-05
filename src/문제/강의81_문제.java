package 문제;

public class 강의81_문제 {
    public static void main(String[] args) {
        Ham_Burger[] ham_Burgers = new Ham_Burger[3];
        ham_Burgers[0] = new Ham_Burger();
        ham_Burgers[1] = new Cheese_Burger();
        ham_Burgers[2] = new Shrimp_Burger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("---------------");
        for (Ham_Burger ham_Burger : ham_Burgers) {
            ham_Burger.cook();
            System.out.println("---------------");
        }
        System.out.println("메뉴 준비가 완료 되었습니다.");
    }





}
class Ham_Burger{
    public String name;

    public Ham_Burger() {
        this.name = "햄버거";
    }
    public Ham_Burger(String name) {
        this.name = name;
    }

    public void cook() {
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");
    }
}

class Cheese_Burger extends Ham_Burger {
    public Cheese_Burger() {
        super("치즈버거");
    }

    public void cook() {
        super.cook();
        System.out.println("+ 치즈");
    }


}

class Shrimp_Burger extends Ham_Burger {
    public Shrimp_Burger() {
        super("새우버거");
    }

    public void cook() {
        super.cook();
        System.out.println("+ 새우");
    }

}



