package day10_stringManipulation;

public class C03_replaceAll_Regex {
    public static void main(String[] args) {
        // bu metindeki sayilardan kurtulun
        String str= "J6a1va 566G1u6,z1e6l-d61ir1";
        System.out.println(str.replace("1","")
                .replace("5","")
                .replace("6","")); // Java Gu,zel-dir

        /*
           replace() zaten istenen degisikligi verilen ozellige uyan tum degerler icin yapar
           eger genellemeyi butun sayilari, butun space'leri, butun ozel karakterleri
           gibi genisletmek istersek replace() yerine replaceAll() kullaniriz
           Java bu genellemeleri yazabilmemiz icin regex(regular expressions) tanimlamistir
           \\d : butun digit'ler

          REGENTS:
          Regex (Regular Expressions)
   \\s : space                \\S : space olmayan hersey
   \\s+ : yanyana birden fazla space
   \\d : digits               \\D : digit olmayan hersey
   \\w : harf veya rakam      \\W : harf veya rakam olmayan hersey
 */
        str= "Ja7va,; og436ren,./dikce guzelle=-098siyor";

        str=str.replaceAll("\\d","");
        System.out.println(str); //  Java,; ogren,./dikce guzelle=-siyor

        // ozel karakterlerden de kurtulun
        // space de ozel karakter oldugundan bu durumda space'in yok olmamasi icin
        // once space yerine metinde olmayan bir deger atayalim

        str=str.replace(" ","5");//Java,;5ogren,./dikce5guzelle=-siyor
        str=str.replaceAll("\\W",""); //Java5ogrendikce5guzellesiyor
        str=str.replace("5"," ");
        System.out.println(str);//Java ogrendikce guzellesiyor

        // buradaki harf sayisini bulun
        String input3="Ali Can, Merve Star, Mark Tom";
        input3=input3.replaceAll("\\W","");
        System.out.println(input3.length());//22

    }
}
