/*
boyutları ve değerleri kullancıdan alınan (m x n ) matrisin transpozunun yapılması
 */

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static void fnCreateArray(int[][] arr) {

        int iUserVal, iClockM = 0;
        do {
            int iClockN = 0;                          // kullanıcı satır bazlı değerleri girer ;
            do {
                System.out.print("iUserArr[" + iClockM + "][" + iClockN + "] hücre  : ");
                iUserVal = sc.nextInt();
                arr[iClockM][iClockN] = iUserVal;
                iClockN++;
            }
            while (iClockN < arr[iClockM].length);
            iClockM++;
        } while (iClockM < arr.length);

    }

    static void fnShowArray(int[][] arr, int iM, int iN) {    // kullanıcının oluşturduğu matrisi göster ;
        System.out.println("--------------------\n" +
                " iUserArr[" + iM + "][" + iN + "] ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void fnAddValueToArray(int[][] arrDef, int[][] arrTrans, int tM, int tN) {  // transpoze matrisi oluştur ;
        for (int i = 0; i < tM; i++) {
            for (int j = 0; j < tN; j++) {             // arrDef matrisindeki i. satır ve j. sütundaki değer,  arrTrans matrisindeki j. satır ve i. sütuna ekleniyor
                arrTrans[j][i] = arrDef[i][j];
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" (m x n) Matris için satır(m) değerinin girin : ");
        int iArrayLenghtM = sc.nextInt();
        System.out.print(" (m x n) Matris için sütun(n) değerinin girin : ");
        int iArrayLenghtN = sc.nextInt();
        System.out.println(" (" + iArrayLenghtM + " x " + iArrayLenghtN + ") 'lik matris oluşturacaksınız  ");

        int[][] iUserArr = new int[iArrayLenghtM][iArrayLenghtN];   //default matrisi tanımı
        fnCreateArray(iUserArr);                                    // default matrise kullanıcının girdiği değerleri atayan metot
        fnShowArray(iUserArr, iArrayLenghtM, iArrayLenghtN);        // default matrisi  gösteren fonksiyon

        int[][] iTransposeArr = new int[iArrayLenghtN][iArrayLenghtM];  //transpoze matrisi tanımı
        fnAddValueToArray(iUserArr, iTransposeArr, iArrayLenghtM, iArrayLenghtN);  //   default matrisi üzerinden transpoze matris oluşturan metot
        fnShowArray(iTransposeArr, iArrayLenghtN, iArrayLenghtM);   // transpoze matrisi  gösteren fonksiyon


    }
}