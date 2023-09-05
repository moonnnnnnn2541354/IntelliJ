package chap_07.camera;

// Camera > ActionCam > SlowActionCam
public class SlowActionCam { // ActionCam은 상속할수 없게 되었음
    public String name;

    public SlowActionCam() {
        this.name = ("슬로우 액션 카메라");
    }

    public void makeVideo(){
        System.out.println("자체 개발 비디오 제작 가능");
    }
    
    public void recordVideo(){
        System.out.println("비디오 녹화중");
    }
}
