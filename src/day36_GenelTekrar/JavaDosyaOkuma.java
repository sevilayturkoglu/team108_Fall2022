package day36_GenelTekrar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class JavaDosyaOkuma {
    public static void main(String[] args) throws IOException {
//sistemimizdeki dosyalari okumanin birkac yolu var
        //YOL 1:
    FileReader read=new FileReader("src/hello") ;
        BufferedReader br=new BufferedReader(read);
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());




//YOL 2:
        Scanner sc=new Scanner(new FileReader("src/hello"));
       System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());
//loop ile de yazdirabiliriz
        while (sc.hasNextLine()){
           System.out.println(sc.nextLine());
       }


    }
}