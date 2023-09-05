package chap_09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크
        // 1. List
        // 2. Set
        // 3. Map

        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("짱구");
        list.add("철수");
        list.add("훈이");
        list.add("맹구");
        list.add("유리");

        // 데이터 조회
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println();

        // 삭제
        System.out.println("학생 수 (제외 전) : " + list.size());
        list.remove("맹구");
        System.out.println("학생 수 (제외 후) : " + list.size());
        System.out.println("4번째 학생 : " + list.get(3));//
        System.out.println();

        System.out.println("남은 학생 수 (제외 전) : " + list.size());
        list.remove(list.size() - 1);
        System.out.println("남은 학생 수 (제외 후) : " + list.size());
        
        System.out.println();

        // 순회
        System.out.println("남은 인원 명단 :");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println();
        
        // 변경
        System.out.println("수강권 양도 전 : " + list.get(0));
        list.set(0,"미선");
        System.out.println("수강권 양도 후 : " + list.get(0));

        System.out.println();

        // 확인
        System.out.println(list.indexOf("훈이"));

        // 포함 여부(ture,false)
        System.out.println("훈이 수강여부 : " + list.contains("훈이"));
        System.out.println("유리 수강여부 : " + list.contains("유리"));
        
        if (list.contains("훈이")){
            System.out.println("수강중");
        }else{
            System.out.println("수강중이지 않습니다");
        }

        System.out.println();
        
        // 전체 삭제
        list.clear();
        if (list.isEmpty()){
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다");
        }
        System.out.println();

        // 새로 작성
        list.add("짱구");
        list.add("철수");
        list.add("훈이");
        list.add("맹구");
        list.add("유리");

        // 정렬
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }




    }
}
