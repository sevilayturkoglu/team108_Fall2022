package day25_inheritance;

public class DToyota extends CCar{
    String marka="Toyota";
    String uretimYeri="Toyota farkli ulkelerde uretilir";
 DToyota(){


     System.out.println("Parametresiz Toyota constructor'i calisti");
    }

    DToyota(String param1){
      //  super("navt");

        System.out.println("Parametreli toyota constructor'i calisti");
    }




}
