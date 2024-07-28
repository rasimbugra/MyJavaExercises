
package project3;

import java.util.Random;

/*
    Tüm değişkenler,fonksiyonlar,isimlendirmeler vs. PRINT İÇİ DE DAHİL İNGİLİZCE isimlendirilecek.
    20 elemanlı 0-100 arasındaki RANDOM tam sayılardan oluşan bir dizi oluşturulacak.
    Dizi ekrana yazdırılacak

    Bir aranacak sayi belirlenecek. 
    Bu sayi dizi içerisinde var mı diye bakılacak.
    Sayı bulunursa: Aranan "x...." sayısı bulundu. yazılacak
    altına da bulunan sayının 2 katının 8 fazlasının 4 eksiğininin yarısını ekrana yazdıracak.

    Aranan sayı bulunamazsa: Aranan "x...." sayısı BULUNAMADI ! yazılacak.


  */
  //System.out.println("sayi : " + sayi + " dirrrrr.");

public class Project3 {

    
    public static void main(String[] args) {

    int[] array = new int[20];
    int searchNumber = 7;
    
    Random randomObject = new Random();
        
        for(int i = 0; i < array.length; i++) 
        {
            array[i] = randomObject.nextInt(100);
            System.out.println("Generated number : " + array[i]);
        }
        
        for(int i = 0; i < array.length; i++) 
        {
            if(array[i] == searchNumber)
            {
                System.out.println("Aranan " + searchNumber + " sayısı bulundu.");
                System.out.println((searchNumber * 2 + 4) / 2);
            }
            /*else
            {
                System.out.println("Aranan " + searchNumber + " sayısı bulunamadı.");
            }*/ 
        }
         
    }
    
}
