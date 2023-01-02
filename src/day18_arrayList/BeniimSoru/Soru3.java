package day18_arrayList.BeniimSoru;

import java.util.List;
import java.util.Scanner;

public class Soru3 {
    // Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip,
    // kalan kismini list olarak bize donduren bir method olusturun

    public static void main(String[] args) {
        List<String> istenmeyenler=Soru2.kullaniciList();
        System.out.println(istenenList(istenmeyenler));
    }public static List<String> istenenList( List<String> istenmeyenler){
        Scanner sc= new Scanner(System.in);
        System.out.println("Lutfen icerikte olasini istemediginiz elemani girin");
        String istenme=sc.next().toLowerCase().substring(0,1);

        for (int i = 0; i <istenmeyenler.size() ; i++) {
            if(istenmeyenler.get(i).contains(istenme)){
                istenmeyenler.remove(i);
            }
        }return istenmeyenler;
    }
}
