/*
Bu örnekte, Recursive kullanarak bir sayının değerini azaltarak ve artırarak özel bir desen oluşturulmuştur.
Sırasıyla (n : 16, 10, 25 5 ) için çıktılar ;
16 11 6 1 -4 1 6 11 16
10 5 0 5 10
25 20 15 10 5 0 5 10 15 20 25
5 0 5
 */

import java.util.Scanner;
public class Main {
    private static void fnAccordingPattern(int n) {
        System.out.print(n + " ");
        if (n > 0) {
            fnAccordingPattern(n - 5);
            System.out.print(n + " ");       // methodun Recusive çağrısı tamamlandıktan n değeri tekrar ekrana yazdırarak tersine doğru olan deseni oluştur.
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" n : ");
        int iUserNumber = sc.nextInt();

        fnAccordingPattern(iUserNumber);
    }
}


