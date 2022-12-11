package day10_stringManipulation;

public class C07_forLoop {
    public static void main(String[] args) {
// 10 kere "Hello World" yazdiralim
        // ama her yazisinda 1'den 10'a kadar(10 dahil) sira no ile yazdiralim
        System.out.println("1- Hello World");
        System.out.println("2- Hello World");
        System.out.println("3- Hello World");
        System.out.println("4- Hello World");
        System.out.println("5- Hello World");
        System.out.println("6- Hello World");
        System.out.println("7- Hello World");
        System.out.println("8- Hello World");
        System.out.println("9- Hello World");
        System.out.println("10- Hello World");
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i + "- Hello World");
        }
        String input1="15.30 €";
        String input2="11.40 €";
        char parabirimi=input1.charAt(input1.length()-1);

        input1=input1.replace("€","");
        input2=input2.replace("€","");

        System.out.println(input2);
        double fiyatString=Double.parseDouble(input1);


        double fiyat2String=Double.parseDouble(input2);



        double yenifiyat=(fiyatString+fiyat2String);

        System.out.println(yenifiyat+" "+parabirimi);
    }
}
