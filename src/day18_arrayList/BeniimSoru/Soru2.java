package day18_arrayList.BeniimSoru;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru2 {
    /*
         // Soru 2- Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.

     */
    public static void main(String[] args) {

        System.out.println(kullaniciList());

    }

    public static List<String> kullaniciList() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen listinizi olusturmak icin isim giriniz");
        String girilen="";
        List<String>listOlustur=new ArrayList<>();
        while (!girilen.equalsIgnoreCase("q")){
            girilen=sc.nextLine();
            if (!girilen.equalsIgnoreCase("q")){
                listOlustur.add(girilen);
            }
        }
return listOlustur;
    }
}