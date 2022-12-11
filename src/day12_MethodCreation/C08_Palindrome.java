package day12_MethodCreation;

public class C08_Palindrome {
    public static void main(String[] args) {

    String duz="madama";

      String ters=C07_TersCevirmeMethodu.metniTerseCevir(duz);

      if(duz.equals(ters)){
          System.out.println("Bu metin polindrome dir");
      }else{
          System.out.println("Metin polindrome degildir");
      }
    }
}
