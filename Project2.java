package project2;

import java.util.Random;

  /*
    Tüm değişkenler,fonksiyonlar,isimlendirmeler vs. İNGİLİZCE isimlendirilecek.
    15 elemanlı 0-1000 arasındaki RANDOM tam sayılardan oluşan bir dizi oluşturulacak.
    
    Bu dizideki sayılardan mükemmel sayı olanlar ayrı bir diziye atanacak ve mükemmel sayılar ekrana yazdırılacak.
    Mükemmel sayıyı bulmak için ayrı bir fonksiyon yaz onu kullan.
    
    Mükemmel sayı,pozitif bölenlerinin toplamı kendisine eşit olan pozitif tam sayıdır. 
    Bir mükemmel sayı,tüm pozitif bölenlerinin toplamı (kendisinden başka) sayının kendisine eşit olan sayıdır.
    En bilinen örneklerden bazıları şunlardır:

    1. 6: 6’nın pozitif bölenleri 1, 2, 3 ve 6’dır. 6 hariç diğer bölenlerin toplamı 1 + 2 + 3 = 6 eder.
    2. 28: 28’in pozitif bölenleri 1, 2, 4, 7, 14 ve 28’dir. 28 hariç diğer bölenlerin toplamı 1 + 2 + 4 + 7 + 14 = 28 eder.

    Diğer mükemmel sayılar arasında 496 ve 8128 de bulunmaktadır.
  */
    
public class Project2 {

    public static boolean isPerfect(int number)
    {
       int k = 0,total = 0;
       if (number <= 5) return false;
       for(int i = 1; i < number; i++)
       {
           if(number % i == 0)
           {
               total += i;
               k++;
           }
       }
       if(total != number) return false;
        
       return true;
    }
    
    public static void main(String[] args) {

        int[] array = new int[15];
        int[] perfectNumberArray = new int[15];
        int k = 0;
        
        Random randomObject = new Random();
        
        for(int i = 0; i < array.length; i++) 
        {
            array[i] = randomObject.nextInt(1001);
            System.out.println("Generated number : " + array[i]);
        }
        
        for(int i = 0; i < array.length; i++)
        {
            if(isPerfect(array[i]))
            {
                perfectNumberArray[k] = array[i];
                k++;
            }
        }
        
        System.out.println("Perfect numbers: ");
        for (int i = 0; i < k; i++)
        {
            System.out.println(perfectNumberArray[i]);
        }
        
    }
     
}
