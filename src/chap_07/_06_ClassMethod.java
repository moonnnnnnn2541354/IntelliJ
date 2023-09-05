package chap_07;

public class _06_ClassMethod {
    public static void main(String[] args) {
        //Class명 설정명 = new Class명();
        BlackBox b1 = new BlackBox(); //다른 Class에서 따올때 기본설정
        b1.callServiceCenter();

        BlackBox b2 = new BlackBox();
        b2.callServiceCenter();

        BlackBox.callServiceCenter();

        String s = String.valueOf(3);
    }
}
