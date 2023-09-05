package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        // 배열활용
        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras){
            cam.showMainFeature();
        }

        System.out.println();

        // 슈퍼클래스 안에 있는것 외의것을 불러올때
        if(camera instanceof Camera){
            System.out.println("카메라 입니다.");
        }

        if (factoryCam instanceof FactoryCam){
            ((FactoryCam) factoryCam).detectFire();
        }

        if (speedCam instanceof SpeedCam){
            ((SpeedCam) speedCam).recognizeLicensePlate();
            ((SpeedCam) speedCam).checkSpeed();
        }

        // Object 배열
        Object[] objs = new Object[3];
        objs[0] = new Camera();
        objs[1] = new FactoryCam();
        objs[2] = new SpeedCam();




    }
}
