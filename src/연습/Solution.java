package 연습;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution { // 코딩테스트 연습

    // 몫 구하기
//    public int solution(int num1, int num2) {
//        int answer = num1 / num2;
//        return answer;
//    }

    // 최빈값
//    public int solution(int[] array) {
//        int maxCount = 0;
//        int answer = 0;
//        Map<Integer, Integer> map = new HashMap<>(); // 해쉬맵 사용
//        for(int number : array){
//            int count = map.getOrDefault(number, 0) + 1;
//            if(count > maxCount){
//                maxCount = count;
//                answer = number;
//            }
//            else  if(count == maxCount){
//                answer = -1;
//            }
//            map.put(number, count);
//        }
//        return answer;
//    }

    // 배열 곱하기
//    public int[] solution(int[] numbers) {
//        // return Arrays.stream(numbers).map(i -> i * 2).toArray();
//        int[] answer = new int[numbers.length]; // 배열 설정
//        for (int i = 0; i < numbers.length; i++) { // 배열수만큼 실행
//            answer[i] = numbers[i] * 2; // 해당자리 배열의수는 *2 후 저장
//        }
//        return answer;
//    }

    // 배열 순서 반전
//    public int[] solution(int[] num_list) {
//        int[] answer = new int[num_list.length]; // 배열 설정
//        for(int i = 0; i< num_list.length; i++){ // 배열수만큼 실행
//            answer[i] = num_list[num_list.length-i-1]; // 배열 역순으로 생성
//        }
//        return answer;
//    }

    // 문자열 뒤집기 : .reverse().toString();
//    public String solution(String my_string) {
//        // return new StringBuilder(my_string).reverse().toString(); // 한줄코드
//        StringBuilder answer = new StringBuilder(my_string); // StringBuilder 설정
//        return answer.reverse().toString(); // 뒤집어서 출력
//    }

    // 가위바위보 : StringBuilder, charAt(i), setCharAt(i,'0'), switch
//    public String solution(String rsp) {
//        StringBuilder answer = new StringBuilder(rsp);
//        for (int i = 0; i < answer.length(); i++) {
//            char ch = answer.charAt(i);
//            switch (ch){
//                case '2' : answer.setCharAt(i,'0'); break;
//                case '0' : answer.setCharAt(i,'5'); break;
//                case '5' : answer.setCharAt(i,'2'); break;
//                default : break;
//            }
//        } return answer.toString();
//    }

    // 배열 점의 위치 구하기
//    public int solution(int[] dot) {
//        int[] answer = new int[dot.length];
//        for (int i = 0; i < answer.length; i++) {
//            answer[i] = dot[i];
//        }
//        int result = 0;
//        if (answer[0]>0&&answer[1]>0){
//            result = 1;
//        } else if (answer[0]<0&&answer[1]>0){
//            result = 2;
//        } else if (answer[0]<0&&answer[1]<0){
//            result = 3;
//        } else if (answer[0]>0&&answer[1]<0){
//            result = 4;
//        }
//        return result;
//    }

    // 배열중 곱셈 최대값 구하기
//    import java.util.*;
//    class Solution {
//        public int solution(int[] numbers) {
//            int answer = 0;
//
//            Arrays.sort(numbers);
//
//            return numbers[numbers.length-1]*numbers[numbers.length-2];
//        }
//    }

    // 문자열에서 숫자만골라서 정렬하기 : .replaceAll
//    public int[] solution(String my_string) {
//        my_string = my_string.replaceAll("[a-z]","");
//        int[] answer = new int[my_string.length()];
//        for(int i = 0; i < answer.length; i++){
//            answer[i] = my_string.charAt(i) - '0';
//        }
//        Arrays.sort(answer);
//        return answer;
//    }

    // 중복된 문자 삭제 : HashSet
//    public String solution(String my_string) {
//        StringBuilder answer = new StringBuilder(); // String 뼈대생성
//        Set<Character> seen = new HashSet<>(); // Character hashset 뼈대생성(중복문자 지우기 위해필요함)
//
//        for (char ch : my_string.toCharArray()) { // my_string을 char배열로 만들어 실행
//            if (!seen.contains(ch)){
//                answer.append(ch); // hashset에 char배열문자가 없으면 String에 입력
//                seen.add(ch); // hashset에 char배열문자가 없으면 hashset에 입력
//            }
//        }
//        return answer.toString(); // String 값으로 실행
//    }



    public static void main(String[] args) {
        String my_string = "people";
        StringBuilder answer = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (char ch : my_string.toCharArray()) {
            if (!seen.contains(ch)){
                answer.append(ch);
                seen.add(ch);
            }
        }
        System.out.println(answer.toString());

    }



    // 문자열 출력
//    public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            String str = sc.next();
//            int a = str.length();
//
//            if(a >= 1 && a <= 1000000){
//                System.out.println(str);
//            }
//    }

    // 실수 -> 정수 변형하기 : (int)
//    public int solution(double flo) {
//        return (int)flo; //
//    }

    // 대문자 전환 : toUpperCase()
//    public String solution(String myString) {
//        return myString.toUpperCase();
//    }
    // 소문자 전환하기 : toLowerCase()
//    public String solution(String myString) {
//        return myString.toLowerCase();
//    }

    // 반복 실행하기 : 반복문
//    public String solution(String my_string, int k) {
//        StringBuilder result = new StringBuilder();
//
//        for (int i = 0; i < k; i++) {
//            result.append(my_string);
//        }
//        return result.toString();

    // 문자 변화하기 : replaceAll("","")
//    public String solution(String rny_string) {
//        return rny_string.replaceAll("m","rn");
//    }

    // 공배수 구하기 : if문
//    public int solution(int number, int n, int m) {
//        return number % n == 0 && number % m == 0 ? 1 : 0;
//    }

    // 길이에 따른 연산
//    public int solution(int[] num_list) {
//        int sum = 0;
//        if(num_list.length >= 11){
//            for (int num : num_list) {
//                sum += num;
//            }
//        } else {
//            sum = 1;
//            for (int num : num_list) {
//                sum *= num;
//            }
//        }
//        return sum;
//    }

    // 문자열 -> 숫자열 변형하기 : Integer.parseInt( )
//    public int solution(String n_str) {
//        return Integer.parseInt(n_str);
//    }

    // Array 조건문 :
//    public int[] solution(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] >= 50 && arr[i] % 2 == 0){
//                arr[i] /= 2;
//            } else if (arr[i] < 50 && arr[i] % 2 != 0) {
//                arr[i] *= 2;
//            }
//        }
//        return arr;
//    }

    // n의 배수 :
//    public int solution(int num, int n) {
//        // return (num % n == 0 ? 1 : 0); // return 한줄방식
//        int answer = (num % n == 0 ) ? 1 : 0;
//        return answer;
//    }

    // 조건 다른값 변환하기 :
//    public int solution(int a, int b, boolean flag) {
//        // return flag ? a + b : a - b; // return 한줄방식
//        int answer = 0;
//        if (flag){
//            answer = a + b;
//        } else {
//            answer = a - b;
//        }
//        return answer;
//    }

    // n번째 원소까지 :
//    public int[] solution(int[] num_list, int n) {
//        // return Arrays.copyOfRange(num_list, 0, n); // return 한줄방식
//        int[] result = new int[n];
//        for (int i = 0; i < n; i++) {
//            result[i] = num_list[i];
//        }
//        return result;
//    }



    // 정수 나누고-> 실수 1000곱해서 -> 정수값 출력
//    public int solution(int num1, int num2) {
//        // return num1 * 1000 / num2; // 실수과정 안걸치고 계산하는방법
//        double result = ((double)num1 / num2) * 1000;
//        return (int)result;
//    }

    // 4가지 조건문
//    public int solution(int angle) {
//        // return angle == 180 ? 4 : angle > 90 ? 3 : angle == 90 ? 2 : angle < 90 ? 1 : 0;
//        int answer = 0;
//        if (angle < 90) {
//            answer = 1;
//        } else if (angle == 90) {
//            answer = 2;
//        } else if (angle >= 91 || angle > 180) {
//            answer = 3;
//        } else if (angle == 180) {
//            answer = 4;
//        }
//        return answer;
//    }


//    public int solution(int n) {
//        int answer = 0;
//        for (int i = 0; i < n; i++) {
//
//        }
//        return answer;
//    }

    // 짝수의 합
//    public int solution(int n) {
//        int sum = 0;
//        for (int i = 2; i <= n; i += 2) {
//            sum += i;
//        }
//        return sum;
//    }

    // 배열의 평균값
//    public double solution(int[] numbers) {
//        // return Arrays.stream(numbers).average().orElse(0);
//        double answer = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            answer += numbers[i];
//        }
//        return answer / numbers.length;
//    }

    // 양꼬치
//    public int solution(int n, int k) {
//        int answer = (n*12000)+(k*2000)-((n/10)*2000);
//        return answer;
//    }

    // 스위치문
//    public int solution(int n, String control) {
//        int answer = n;
//        for(char ch : control.toCharArray()) {
//            switch(ch) {
//                case 'w': answer += 1; break;
//                case 's': answer -= 1; break;
//                case 'd': answer += 10; break;
//                case 'a': answer -= 10; break;
//                default:break;
//            }
//        }
//
//        return answer;
//    }

    // 배열에 boolean 사용




}












