package chap_07.camera;

// Camera > SpeedCam
public class SpeedCam extends Camera { // 자식 클래스 (extends Camera)
    public SpeedCam() {//생성자
        //this.name = "과속단속 카메라";
        super("과속단속 카메라");
    }

    public void takePicture(){
        // 사진 촬영 메소드
        //System.out.println(this.name + " : 사진을 촬영합니다.");
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }

    public void checkSpeed(){
        // 속도 체크 메소드
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate(){
        // 번호 인식
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override // annotation
    public void showMainFeature() {
        System.out.println(this.name + "의 주요기능 : 속도측정,차량번호 인식");
    }
}
