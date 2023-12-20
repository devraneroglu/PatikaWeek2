/*
Dizinin boyutunu ve elemanlarını kullancıdan al ve diziyi Asc sırala
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" Dizi uzunluğunu girin : ");
        int iArrayLenght = sc.nextInt();
        int iUserVal, iClock = 0;
        int[] iUserArr = new int[iArrayLenght];
        do {                                                        // Kullanıcıdan sırasıyla dizinin indislerine karşılık gelen değerleri al  iUserArr dizisine ata
            System.out.print("iUserArr[" + iClock + "].İndis  : ");
            iUserVal = sc.nextInt();
            iUserArr[iClock] = iUserVal;
            iClock++;
        }
        while (iClock < iArrayLenght);

        for (int i : iUserArr) {           // dizideki değerleri for each ile ekrana yazdir
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.sort(iUserArr);       // array sınıfları kullanarak sırala ve ekrana yazdir
        System.out.println("ORDER BY ASC -->\t" + Arrays.toString(iUserArr));
    }
}