package day28_exceptions;

public class C07_ExceptionTurleri {
    public static void main(String[] args) {

        String str= "25";
        int x=Integer.parseInt(str);
        // str'a sayisal olarak 5 ekleyip yazdirin

        System.out.println(Integer.parseInt(str)+5);

        // eger str icinde sayi olmayan bir karakter olursa NumberFormatException
        int a=15;
        String c=String.valueOf(a);
        System.out.println(c);

        Object sayiObj= str;

        Integer sayiInt= null;//.ClassCastException
        try {
            sayiInt = (Integer)sayiObj;
            System.out.println(sayiInt);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("hello");



    }
}
