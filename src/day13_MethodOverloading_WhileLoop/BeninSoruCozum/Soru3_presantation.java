package day13_MethodOverloading_WhileLoop.BeninSoruCozum;

public class Soru3_presantation {
    public static void main(String[] args) {
        //Soru 3- While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
        //donduren bir method olusturun
        String str = "Java candir";

        System.out.println(tersYaz(str));

    }public static String tersYaz(String str){
        String ters="";
       int length= str.length()-1;
        while(length>=0){
            ters+=str.charAt(length);
           length--;
        }return ters;

    }
}
