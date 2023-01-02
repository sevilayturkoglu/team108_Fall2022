package day26_inheritance;

 class calisma {
  String esya="silgiParent";
  calisma(String s){
   System.out.println("okul : "+s );
  }



}public class Sinif extends calisma{
String esya="silgiChild";
  Sinif(String k){
   super("kalem");
   System.out.println("sinif : " + k);
 //  this.esya="childconsIciSilgi";
  }

 public static void main(String[] args) {

  Sinif obj=new Sinif("canta");
  String esya="mainSilgi";//bunu asla kullanmaz
  System.out.println(obj.esya);
  System.out.println("********************");
calisma obj2=new Sinif("kitap");
  System.out.println(obj2.esya);
 }
}
