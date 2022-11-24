package day04_Increment_Concatenation;

public class C05_OdevCozum {
    public static void main(String[] args) {
        /*12 Java kolay  , 7 Java kolay  ,  34 Java kolay ,  Java 12 kolay , Java 34 kolay , Java 7 kolay  */
        String s1="Java";
        String s2=" ";
        String s3="kolay";
        String s4="";
        int a = 3;
        int b = 4;
        System.out.println(a*b+s2+s1+s2+s3);//12 Java kolay
        System.out.println(a+b+s2+s1+s2+s3);//7 Java kolay
        System.out.println(s4+a+b+s2+s1+s2+s3);//34 Java kolay
        System.out.println(s1+s2+(a*b)+s2+s3);//Java 12 kolay
        System.out.println(s1+s2+a+b+s2+s3);//Java 34 kolay
        System.out.println(s1+s2+(a+b)+s2+s3);//Java 7 kolay

    }
}
