package day09_StringManipulation;

public class C10_Soru {
    public static void main(String[] args) {
      /*  Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
                input1 : “15.30 €” , input2 : “11.40 €”
        output : 36.70*/

        String s1="15.30 €";
        String s2="11.40 €";
        String yeniS1=s1.replace("€","").trim();
        String yeniS2=s2.replace("€","").trim();
        System.out.println(Double.parseDouble(yeniS1) + Double.parseDouble(yeniS2));



    }
}
