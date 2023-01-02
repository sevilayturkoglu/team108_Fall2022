package day24_StringBuilder;

public class EncapsuleClass {
    /* Java class uyelerine erisimin write and read olarak ayrilmasi istendiginde
      Encapsulation kullanir.
      Bunun icin oncelikle bu class uyelerine normal yollarla erisim kapatilir
       sonra istedigimiz yetkiyi verecek public method olustururuz
    */
    private static int satis;  // satis bolumunden deger girilebilsin ama degeri gorunemesin ==> setter
    private int toplamSatis; // gorulebilsin ama degistirilemesin ==> getter
    private int halkaAcikSayi = 10; // herkese acik olsun ==> getter, setter

    public int getHalkaAcikSayi() {
        return halkaAcikSayi;
    }

    public void setHalkaAcikSayi(int halkaAcikSayi) {
        this.halkaAcikSayi = halkaAcikSayi;

    }

    public  void setSatis(int satis) {
        this.satis = satis;
        toplamSatis += satis;

    }



    public int getToplamSatis() {
        return toplamSatis;
    }




}
