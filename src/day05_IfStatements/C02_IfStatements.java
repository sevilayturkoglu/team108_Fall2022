package day05_IfStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alip
// pozitif ise "pozitif sayi",
// 100 ile 999 arasinda ise(sinirlar dahil) "pozitif 3 basamakli sayi"
// 3 ile bolunebiliyorsa "3'un kati"
// birler basamagi 7 ise "Mukemmel"
// seceneklerinden uygun olanlari yazdirin

        /*
            Basit if cumleleri kodun geri kalanindan bagimsizdir
            sadece 1 sarta odaklanir
            o sart true ise if body calisir
            sart false ise if body calismaz( KOD CALISIR)
            birden fazla bagimsiz if cumlesi kullanilmissa
            her cumle birbirinden bagimsiz olacagindan
            bazi degerler icin tum if body'leri calisirken
            bazi degerler icin hic bir if body'si CALISMAYABILIR
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double kullaniciSayisi=sc.nextDouble();
        if(kullaniciSayisi>=0){
            System.out.println("Sayi pozitif");
        }if(kullaniciSayisi>=100 && kullaniciSayisi<=999){
            System.out.println("sayiniz uc basamakli pozitif");
        }if(kullaniciSayisi%3==0){
            System.out.println("Sayi 3 un katlaridir");
        }if(kullaniciSayisi%10==7){
            System.out.println("mukemmel");
        }
        }
    }

