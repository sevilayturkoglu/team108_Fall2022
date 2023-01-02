package day26_inheritance;

class Okul{//ikinci classi public acamayiz
    String okulIsmi="Yildiz Koleji";
    String telefon="3123456543";

}
public class C01_Sinif extends Okul{
    String sinif="11-C";
    String telefon="5122343434";
    C01_Sinif(String telefon){
        System.out.println(telefon);//4222342323
        System.out.println(this.telefon);//5122343434
        System.out.println(super.telefon);//3123456543
        System.out.println(okulIsmi);//Yildiz Koleji
        System.out.println(this.okulIsmi);//Yildiz Koleji
        System.out.println(super.okulIsmi);//Yildiz Koleji
        System.out.println(sinif);//11-C
        System.out.println(this.sinif);//11-C

        // System.out.println(super.sinif);
        // Java'da parent'da bulamadigini gidip child'a sorayim OLMAZ
        // parent class'da aranan sinif degeri olmadigindan CTE verir
    }
    public static void main(String[] args) {
        C01_Sinif obj= new C01_Sinif("4222342323");
        System.out.println(obj.telefon);//5122343434  //hocaya sor
    }

}
