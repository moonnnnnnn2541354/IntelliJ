package chap_10;

import chap_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();

        converter.convert(1);
        convertUSD(converter,2);
        convertUSD((USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원"),3);
        Convertible convertible = (USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
        convertUSD(convertible,4);

        // 전달값 없이 할때
        ConvertibleWithNoParams c1 = () -> System.out.println("1 달러 = 1400 원");
        c1.convert();

        // 두 줄 이상의 코드가 있을때
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + " 달러 = " + (USD * KRW) + " 원");
        };
        c1.convert();

        // 전달값이 2개 일때
        ConvertibleWithTwoParams c2 = (USD,KRW) -> {
            System.out.println(USD + " 달러 = " + (USD * KRW) + " 원");
        };
        c2.convert(6,1400);

        // 반환값이 있을때
        // ConvertibleWithReturn c3 = (USD,KRW) -> USD * KRW
        ConvertibleWithReturn c3 = (USD,KRW) -> {
            return  USD * KRW;
        };

        int result = c3.convert(7,1400);
        System.out.println("7 달러 = " + result + " 원");
    }

    public static void convertUSD(Convertible converter, int USD) {
        converter.convert(USD);
    }
}
