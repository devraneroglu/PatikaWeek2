/*
Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
Tekrar Sayıları
10 sayısı 3 kere tekrar edildi.
20 sayısı 4 kere tekrar edildi.
5 sayısı 1 kere tekrar edildi.
 */

import java.util.HashSet;
import java.util.Set;

public class Main {

    static void fnRepeatValOutput (int[]arr, int x ){               // Bir dizide tekrarlanan değerlerin sayısını çıkaran fonksiyon
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println(x + " sayısı\t" + count + "\tkez tekrarlandı ");
    }

    public static void main(String[] args) {
        int[] iDefaultArr = {10, 20, 20, 10, 10, 20, 5, 20};

        Set<Integer> uniqueVal = new HashSet<>();  // Set arabirimini uygulayan bir sınıftır ve yinelenen değerleri önlemek için kullanılır
        for (int iUniq : iDefaultArr) {        // Diziyi dolaşarak her elemanı hashsete ekle
            uniqueVal.add(iUniq);
        }

        Integer[] uniqueValArr = uniqueVal.toArray(new Integer[0]);  // hashseti tekrar diziye çevir

        fnRepeatValOutput(iDefaultArr,uniqueValArr[0]);fnRepeatValOutput(iDefaultArr,uniqueValArr[1]);fnRepeatValOutput(iDefaultArr,uniqueValArr[2]);
    }
}