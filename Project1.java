package project1;

import java.util.Random;


    /*
        Bir int dizisi oluşturulacak.
        bu dizi 10 elemanlı olacak. dizi adı : dizi1
        
        
        bu diziye 10 tane 0-100 arasında RANDOM tam sayı eklenecek
        
        Bu dizi içerisindeki asal olan sayılar bulunacak ve bu asal sayılar başka bir diziye aktarılacak.
        aktarılacak dizi adı : asalSayilarDizisi
        ve en son bu dizi ekrana yazdıralacak.
    */
        

public class Project1 {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;  // 0 and 1 are not prime numbers
        if (num == 2) return true;   // 2 is the only even prime number
        for (int i = 2; i < num ; i ++) { // check for factors from 3 to the square root of the number
            if (num % i == 0) return false;
        }
        return true;
    }
    

    public static void main(String[] args) {
        
        

        // Create an array with 10 elements named dizi1
        int[] array = new int[10];
        
        // This will store the prime numbers, its size is initially set to the same as dizi1
        int[] arrayPrime = new int[10];
        
        int k = 0;  // Counter for the number of prime numbers found

        Random randomObject = new Random();

        // Fill dizi1 with random numbers between 0 and 100
        for (int i = 0; i < array.length; i++) {
            array[i] = randomObject.nextInt(101); // nextInt(101) gives numbers between 0 and 100
            System.out.println("Generated number: " + array[i]);
        }

        // Check each number in dizi1 if it is prime and add it to asalSayilarDizisi
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                arrayPrime[k] = array[i];
                k++;
            }
        }

        // Print the prime numbers
        System.out.println("Prime numbers: ");
        for (int i = 0; i < k; i++) {
            System.out.println(arrayPrime[i]);
        }
    }    
}