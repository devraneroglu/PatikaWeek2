
import java.util.HashSet;
import java.util.Set;

public class Main {

    static void fnRepeatEvenValOutput (int[]arr, int x ){               // Bir dizide tekrarlanan değerlerin sayısını çıkaran fonksiyon
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x && x % 2 == 0) {
                count++;
            }
        }
        if (count>0)
        System.out.println(x + " sayısı\t" + count + "\tkez tekrarlandı ");
    }

    public static void main(String[] args) {
        int[] iDefaultArr = {98,2,2,57,9,1,12,7,13,12,2,98};

        Set<Integer> uniqueVal = new HashSet<>();  // Set arabirimini uygulayan bir sınıftır ve yinelenen değerleri önlemek için kullanılır
        for (int iUniq : iDefaultArr) {        // Diziyi dolaşarak her elemanı hashsete ekle
            uniqueVal.add(iUniq);
        }

        Integer[] uniqueValArr = uniqueVal.toArray(new Integer[0]);  // hashseti tekrar diziye çevir

        fnRepeatEvenValOutput(iDefaultArr,uniqueValArr[0]);fnRepeatEvenValOutput(iDefaultArr,uniqueValArr[1]);fnRepeatEvenValOutput(iDefaultArr,uniqueValArr[2]);
    }
}