package day14_doWhileLoop_Scope;

public class Hastane {
    static String hastaneismi="Yildiz Hastanesi";
    static String hastaneAdres="Cankaya/Ankara";

    public String personelIsmi;
    public String personelAdresi;
    public String personelTel;

    @Override
    public String toString() {
        return "Hastane{" +
                "personelIsmi='" + personelIsmi + '\'' +
                ", personelAdresi='" + personelAdresi + '\'' +
                ", personelTel='" + personelTel + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Hastane p1=new Hastane();
        p1.personelIsmi="Sevil";
        p1.personelAdresi="Cankaya";
        p1.personelTel="12345678";
        System.out.println(p1.toString());

        Hastane p2=new Hastane();
        p2.personelIsmi="Sevil";
        p2.personelAdresi="Cankaya";
        p2.personelTel="12345678";
        hastaneismi="Cankaya tip";
    }
}
