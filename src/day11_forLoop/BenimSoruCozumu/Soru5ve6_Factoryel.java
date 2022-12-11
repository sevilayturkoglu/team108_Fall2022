package day11_forLoop.BenimSoruCozumu;

public class Soru5ve6_Factoryel {
    public static void main(String[] args) {
       /* Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
                hesaplayin */

        int input=20;
        int fact=1;
        String str="";
        for (int i = input; i >=1; i--) {
            fact*=i;
             str+= i + " * ";
        }

        System.out.println(input+"! = "+str.substring(0,str.length()-2)+"= "+fact);

    }
}
