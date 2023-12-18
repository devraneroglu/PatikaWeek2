/*
  iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılara denir ;
  tek haneli sayılar direkt Palindrom sayi olur

  Yaklaşım ;

  While-1
  1548 % 10 ile son basamağı 8 yi bulduk
   8 = 8
  1548 / 10 = 154.8 interger olarak 154
  While-2
  154 % 10 ile son basamağı 4 yi bulduk
  84 = 8*10 + 4
  154 / 10 = 15
  While-3
  15 % 10 ile son basamağı 5 yi bulduk
  845 = 84*10 + 5
  15 / 10 = 1
  While-4
  1 % 10 ile son basamağı 1 yi bulduk
  8451  = 845*10 + 1
  1 / 10 = 0
  While den çık

 */

import java.util.Scanner;

public class Main {

    static boolean fnisPalindrom(int PalindromNumber) {

        int TempValue = PalindromNumber, ReverseValue = 0, iLastDigit;

        while (TempValue != 0) { // 0 olana kadar aşağıdaki işlemi yap
            iLastDigit = TempValue % 10; // sayının 10 a bölümünden kalan ile son basamak değerini bul
            ReverseValue = (ReverseValue * 10) + iLastDigit; // Ters olusturacağımız değişken ilk anda son dijite eşit
            // ol
            TempValue /= 10; // (int / int ) bölümünden faydalanarak kalan sayı bul.
        }
        if (PalindromNumber == ReverseValue) // if den sonra tek satır kullandık {}
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayi girin : ");
        int iUserValue = sc.nextInt();

        String sOutput = fnisPalindrom(iUserValue) == true ? "Palindrom Sayıdır (+)" : "Palindrom Sayı Değildir(-)";
        System.out.println(iUserValue + " : " + sOutput);

    }

}
