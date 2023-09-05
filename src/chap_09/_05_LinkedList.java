package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        list.add("짱구");
        list.add("철수");
        list.add("훈이");
        list.add("맹구");
        list.add("유리");

        // 데이터 조회 list.get()
        System.out.print(list.getFirst() + " ");//리스트 처음 출력
        System.out.print(list.get(1) + " ");
        System.out.print(list.get(2) + " ");
        System.out.print(list.get(3) + " ");
        System.out.println(list.getLast());//리스트 마지막 출력

        System.out.println();
        // 추가
        list.addFirst("형만"); // 앞에 추가
        list.addLast("미선"); // 마지막에 추가
        for (String s : list){
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println();
        // 위치지정해서 추가
        list.add(1,"짱아");
        for (String s : list){
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println();
        // 삭제
        list.remove(list.size()-1);
        System.out.println("list.size()-1 : " + list.size());
        list.removeFirst();
        System.out.println("list.removeFirst() : " + list.size());
        list.removeLast();
        System.out.println("list.removeLast() : " + list.size());
        System.out.println();
        for (String s : list){
            System.out.print(s + " ");
        }
        System.out.println();

        // 변경
        list.set(1,"헤이호");
        for (String s : list){
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println();
        // 전체 삭제
        list.clear();
        System.out.println("현재인원 : " + list.size());

        // 정렬
        list.add("짱구");
        list.add("철수");
        list.add("훈이");
        list.add("맹구");
        list.add("유리");

        System.out.println(list.getFirst());

        Collections.sort(list);
        for (String s : list) {
            System.out.print(s + " ");

        }
        System.out.println();

        System.out.println(list.getFirst());




    }
}
