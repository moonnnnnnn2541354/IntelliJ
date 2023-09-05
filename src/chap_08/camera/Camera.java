package chap_08.camera;

public abstract class Camera { // 추상클래스
    // Camera camera = new Camera(); : 못씀
    public void takePicture(){
        System.out.println("사진을 촬영 합니다.");
    }

    public void recordVideo() {
        System.out.println("동영상을 녹화합니다.");
    }

    public abstract void showMainFeature(); // 추상메소드 : 구현해야하는 메소드


}
