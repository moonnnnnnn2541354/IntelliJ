package chap_07.camera;

public final class ActionCam extends Camera{// ActionCam은 상속할수 없게 설정됨
    public final String lens; // = "광각렌즈";
    public ActionCam() {//생성자
        super("액션 카메라");
        lens = "광각렌즈";

    }

    public final void makeVideo(){ // SlowActionCam 에서는 활용할수 없게 됨
        System.out.println(this.name + " : " + this.lens + "로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
    }


}
