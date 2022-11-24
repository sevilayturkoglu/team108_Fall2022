package day09_StringManipulation;

public class C02_Contains {
    public static void main(String[] args) {
        String str= "Java ogren, mutlu ol";
        // str mutlu iceriyor mu ?
        System.out.println(str.contains("mutlu")); // true
        // charSequence : char dizisi
        System.out.println(str.contains("j")); // false
        System.out.println(str.contains(" ")); // true
        // contains method'u kactane olduguna degil,
        // sadece var olup olmadigana bakar
        System.out.println(str.contains("Java") && str.contains("mutlu")); // true
    }
}
