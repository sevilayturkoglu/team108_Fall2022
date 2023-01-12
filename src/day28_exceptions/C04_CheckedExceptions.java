package day28_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class C04_CheckedExceptions {
    public static void main(String[] args) throws IOException {

        FileInputStream fls = new FileInputStream("src/day28_exceptions/metin.txt");
        int k = 0;
     //   while ((k = fls.read()) != (-1)) {//txt metnini okuduk
        //    System.out.println((char) k);
       // }
        int read = fls.read();
        System.out.println(read);

        //   System.out.println((char) k);
 /*
            Bazi kodlari yazdigimizda Java compile time sirasinda
            o kodlarda exception riskini gorur ve bizden bir cozum bekler
            Ozellikle dosya okuma ve yazma ile ilgili
            IO (Input/Output) islemlerinde Java ya okuyamazsam, ya yazamazsam diyerek
            bizden compile time'da cozum ister
            bu durumda biz exception ile karsilasildiginda
            kod dursun diyorsak : method satirina throws keyword kullanarak
                                  beklenilen exception(lar)i deklare edebiliriz
                                  Bu sadece olayin farkinda oldugumuzu deklare eder
                                  exception firlatmanin ve kodu durdurmanin onune gecmez
            kod calismaya devam etsin : try-catch-(finally) blogu kullanabiliriz
         */


        }
    }
