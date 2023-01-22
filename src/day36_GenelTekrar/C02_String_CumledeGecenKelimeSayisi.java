package day36_GenelTekrar;

public class C02_String_CumledeGecenKelimeSayisi {
    public static void main(String[] args) {
        // Verilen bir cumlede istenen kelimenin kac kere gectigini bulup yazdiran
        // bir method olusturalim

        String cumle = "Java basladi ve bitti. Java meger ne guzelmis. Ne phyton ne C, JaJavava en iyisiJava";

        String istenenKelime = "Java";
        System.out.println("cumle = " + cumle);
        kullanimSayisiBul1(cumle,istenenKelime);
       // kullanimSayisiBul2(cumle,istenenKelime);
        //kullanimSayisiBul3(cumle, istenenKelime);
    }

    private static void kullanimSayisiBul3(String cumle, String istenenKelime) {
        // Java buldukca silerek yapildi
        // ama JaJavava varsa buradan 2 Java buluyordu
        // bunun yerine hiclik degil _ kullandik ve sorun cozuldu
        int kullanimSayisi = 0;

       while (cumle.contains(istenenKelime)) {

           cumle = cumle.replaceFirst(istenenKelime, "-");
            kullanimSayisi++;
       }
       if (kullanimSayisi == 0) {
            System.out.println("Cumlede aranan kelime yok");
        } else {
            System.out.println("Kelime cumlede " + kullanimSayisi + " adet kullanilmistir.");
        }
        System.out.println(cumle);
    }

    private static void kullanimSayisiBul2(String cumle, String istenenKelime) {
        int kullanimSayisi = 0;
        // forloop ve substring ile yapalim
        for (int i = 0; i <= cumle.length() - istenenKelime.length(); i++) {

            if(cumle.substring(i,i+istenenKelime.length()).equalsIgnoreCase(istenenKelime)){
                kullanimSayisi++;
            }
        }

        if (kullanimSayisi == 0) {
            System.out.println("Cumlede aranan kelime yok");
        } else {
            System.out.println("Kelime cumlede " + kullanimSayisi + " adet kullanilmistir.");
        }

    }

    private static void kullanimSayisiBul1(String cumle, String istenenKelime) {
        int kullanimSayisi = 0;
        int index = 0;

        while (index < cumle.length()) {
            index = cumle.indexOf(istenenKelime, index);
            System.out.println("index = " + index);
            if (index == -1) {
                if (kullanimSayisi == 0) {
                    System.out.println("Cumlede aranan kelime yok");
                   break;
                } else {
                    System.out.println("Kelime cumlede " + kullanimSayisi + " adet kullanilmistir.");
                    break;
                }
            } else {
                kullanimSayisi++;
                index++;
            }

        }
        if(kullanimSayisi>0){
            System.out.println("kullanimSayisi = " + kullanimSayisi);
        }else{
            System.out.println("\"kelime yok\" = " + "kelime yok");
        }
    }
}
/*
while(str.contains(istenenKelime)) {
            if (str.contains(istenenKelime)) {
                counter++;
                str = str.replaceFirst(istenenKelime, "");
            }
        }
 */