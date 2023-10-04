package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {// 스트림

    public static void main(String[] args) {
        // Stream 생성
        // Arrays.stream 방식
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);

        // Arrays.stream 방식2
        String[] langs = {"python","java","javascript","c","c++","c#"};
        Stream<String> langStream = Arrays.stream(langs);

        // Collection.stream 방식
        List<String> langList = new ArrayList<>();
        langList = Arrays.asList("python","java","javascript","c","c++","c#");
        Stream<String> langListStream = langList.stream();

        // Stream.of 방식
        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");

        
        // Stream 활용
        // 중간 연산 (Intermediate Operation) : filter, map, sorted, distinct, skip ...
        // 최종 연산 (Terminal Operation) : count, min, max, sum, forEach, anyMatch, allMatch ...

        // 90점 이상인 점수만 출력
//        Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x)); // x가 90 이상
        System.out.println();

        // 90점 이상인 사람의 수
        int count = (int) Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);
        System.out.println();
        
        // 90 점 이상인 사람의 점수의 합
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);
        System.out.println();

        // 정렬
        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
        System.out.println();

        // String[] langs = {"python","java","javascript","c","c++","c#"};

        // 조회 : startsWith
        Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out::println);
        System.out.println();

        // 조회 : contains
        Arrays.stream(langs).filter(x -> x.contains("java")).forEach(System.out::println);
        System.out.println();

        // 4글자 이하의 언어를 정렬해서 출력 : x.length()
        langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println();

        // 4글자 이하의 언어중 c언어 만 : filter 2중사용 : x.length(),x.contains()
        langList.stream()
                .filter(x -> x.length() <= 4) // 4글자 이하 문자중
                .filter(x -> x.contains("c")) // c를 포함한 문자는
                .forEach(System.out::println); // 출력
        System.out.println();

        // 4글자 이하의 언어중 c언어 있는지 확인 : anyMatch
        boolean anyMatch = langList.stream()
                .filter(x -> x.length() <= 4) // 4글자 이하 문자중
                .anyMatch(x -> x.contains("c")); // c를 포함한 문자가 있는지
        System.out.println(anyMatch); // 확인
        System.out.println();

        // 4글자 이하의 언어들은 모두 c 인지 확인 : allMatch
        boolean allMatch = langList.stream()
                .filter(x -> x.length() <= 4) // 4글자 이하 문자는
                .allMatch(x -> x.contains("c")); // c를 포함한 문자인지
        System.out.println(allMatch); // (모두포함인지) 확인
        System.out.println();

        // 4글자 이하의 언어들중 c언어는 뒤에 (어려워요) 같이 출력 : map
        langList.stream()
                .filter(x -> x.length() <= 4) // 4글자 이하
                .filter(x -> x.contains("c")) // c를 포함한 문자는
                .map(x -> x + "(어려워요)") // (어려워요) 문구추가해서
                .forEach(System.out::println); // 출력
        System.out.println();

        // c를 포함한 언어는 대문자로 출력 : x.contains
        langList.stream()
                .filter(x -> x.contains("c")) // c를 포함한 문자는
                .map(String::toUpperCase) // 대문자로
                .forEach(System.out::println); // 출력
        System.out.println();
        
        // c를 포함한 언어는 대문자로 변경하여 리스트로 저장 : .collect(Collectors.toList())
        List<String> lengListStartsWithC = langList.stream()
                .filter(x -> x.contains("c")) // c를 포함한 문자는
                .map(String::toUpperCase) // 대문자로
                .collect(Collectors.toList()); // 저장
        lengListStartsWithC.stream().forEach(System.out::println);
        System.out.println();

    }
}
