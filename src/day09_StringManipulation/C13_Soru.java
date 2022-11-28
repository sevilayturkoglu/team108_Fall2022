package day09_StringManipulation;

public class C13_Soru {
    public static void main(String[] args) {


    /*
           Kullanicidan bir cumle ve bir metin alin
           cumlede metnin durumuna gore
           1- cumle metni icermiyor
           2- cumle metni sadece 1 kere iceriyor
           3- cumle metni birden fazla iceriyor
           seceneklerinden uygun olani yazdirin
        */
        String str1 = "Yeni bir gun, yeni bir baslangic :";
        String str2 = "bir";



        if(str1.indexOf("bir")==-1) {
            System.out.println("cumle metni icermiyor");
        } else if (str1.indexOf(str2)==str1.lastIndexOf(str2)) {
            System.out.println("cumle metni sadece 1 kere iceriyor");
        }else {
            System.out.println("cumle metni birden fazla iceriyor");
        }

// if (!str1.contains(str2))//20. satira bu da yazilabilirdi
    }
}