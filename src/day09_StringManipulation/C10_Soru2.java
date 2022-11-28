package day09_StringManipulation;

public class C10_Soru2 {
    public static void main(String[] args) {
      /*  Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
                input1 : “15.30 €” , input2 : “11.40 €”
        output : 36.70*/

        String s1="15.30 €";
        String s2="11.40 €";
        s1=s1.replace("€","").trim();
        s2=s2.replace("€","").trim();
        s1=s1.replace(".",".");
        s2=s2.replace(".",".");

        System.out.println(Double.parseDouble(s1) + Double.parseDouble(s2));

double d1=15.3;
double d2=11.4;
        System.out.println(d2 + d1);

    }
}
