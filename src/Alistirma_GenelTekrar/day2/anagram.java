package Alistirma_GenelTekrar.day2;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        //iki stringin anagram olup olmadigini soyleyen bir method yaziniz
        //ex:listen *silent are anagram
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram2("listentar", "silentztt"));
    }

    private static boolean isAnagram(String one, String two) {
        if (one.length() != two.length()) {
            return false;
        }
        char[] oneArr = one.toCharArray();
        char[] twoArr = two.toCharArray();

        Arrays.sort(oneArr);
        Arrays.sort(twoArr);

        System.out.println(Arrays.toString(oneArr));
        System.out.println(Arrays.toString(twoArr));
        return Arrays.equals(oneArr, twoArr);
    }

    private static boolean isAnagram2(String one, String two) {
        if (one.length() != two.length()) {
            return false;
        }
        for (int i = 0; i < one.length(); i++) {
            two=two.replaceFirst(one.substring(i,i+1),"");//one ile two arasinda bulunan ortak elemanlari siler

        }
        System.out.println(one+"  one");
        System.out.println(two+" two");
        return two.isEmpty();
    }
}