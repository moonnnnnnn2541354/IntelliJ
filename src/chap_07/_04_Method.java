package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        
        b1.autoReport();// 신고기능 비활성화
        BlackBox.canAutoReport = true;
        b1.autoReport();// 신고기능 활성화

        b1.intserMemoryCard(256);

        // 일반 영상 : type 1
        // 이벤트 영상 (충돌감지) : type 2
        int fileCount = b1.getVideoFileCount(1);// 일반 영상
        System.out.println("일반 영상 파일 수 : " + fileCount + "개");

        fileCount = b1.getVideoFileCount(2);
        System.out.println("이벤트 영상 파일 수 : " + fileCount + "개");

    }
}
