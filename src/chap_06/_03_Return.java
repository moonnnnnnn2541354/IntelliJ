package chap_06;

public class _03_Return {
    // Return 반환값
    // public static 예약어 명칭(){
    // return 결과값;
    // public static void main(String[] args) {
    // System.out.println(명칭());

    public static String getPhoneNumber() {
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }

    public static String getAddress(){
        return "서울";
    }
    
    public static String getActivities(){
        return "볼링,탁구,노래방 ...";
    }

    public static void main(String[] args) {
        String contactNumber = getPhoneNumber();
        System.out.println(getPhoneNumber());
        System.out.println(contactNumber);

        String address = getAddress();
        System.out.println(getAddress());
        System.out.println(address);

        System.out.println(getActivities());






    }
}
