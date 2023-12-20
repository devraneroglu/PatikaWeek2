
/*
Dizi : {15,12,788,1,-1,-778,2,0}
Girilen Sayı : 5
Girilen sayıdan küçük en yakın sayı : 2
Girilen sayıdan büyük en yakın sayı : 12
 */
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] iDefaultArr = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir değer giriniz : ");
        int iUserVal = sc.nextInt();
        Arrays.sort(iDefaultArr);
        int iIndex = 0;
        int iLowerstVal = iDefaultArr[iIndex];                        // sıralandırılmıs dizinin ilk değeri dizideki min değer olacak;
        int iHighestVal = iDefaultArr[iDefaultArr.length - 1];       // sıralandırılmıs dizinin son değeri dizideki max değer olacak;
        System.out.println(Arrays.toString(iDefaultArr));            // sıralandırılmıs diziyi göster;

        int iLowNearestNumber = 0;
        for (int i : iDefaultArr) {                  // for eachle sıralanmış dizinin elemanlarını dön ;
            if (i < iUserVal) {
                iLowNearestNumber = i;               // sıralanmış dizinin elemanlarından kullanıcıdan alınan değer küçük olduğu andaki son değeri ata ;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + iLowNearestNumber);
        int iHighNearestNumber = Arrays.binarySearch(iDefaultArr, iLowNearestNumber) + 1;   //  dizi sıralanmış olduğu için iLowNearestNumber den bir sonraki indexi almak yeterli;
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + iDefaultArr[iHighNearestNumber]);
    }
}


