package chap_07.camera;

// Camera > FactoryCam
public class FactoryCam extends Camera {// 자식 클래스 (extends Camera)
    public FactoryCam() {//생성자
        //this.name = "공장 카메라";
        super("공장 카메라");
    }

    public  void  recordVideo(){
        // 동영상 녹화 메소드
        //System.out.println(this.name + " : 동영상을 녹화합니다.");
        super.recordVideo();
        detectFire();
    }
    
    public void detectFire(){
        //화재 감지
        System.out.println("화재를 감지합니다.");
    }

    public void showMainFeature(){
        System.out.println(this.name + "의 주요기능 : 화재감지");
    }
}
