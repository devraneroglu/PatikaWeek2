/*
Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programın yazılması
 */
import java.util.Scanner;

public class Main {
    static int fnPowerofNumber(int base, int pow) {

        if (pow == 0){
            return 1;             // a ^ 0 = 1 ;
        }

        else if (pow == 1) {                          // Burada üslü sayılardaki (3^3 = 3 * 3^2 ) özelliğini kullancağız
                                                 // Kuvvet 1 değeri tabanın yani sayının kendine eşit olacak -- çıkış noktası
            return base;
        } else {

            return base * fnPowerofNumber(base, (pow - 1));  // üssü bir azalt temel duruma ulaşana kadar tekrar tekrar çağır
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base value : "); // Tavan ve üs değerlerini kullanıcıdan al
        int iBaseVal = sc.nextInt();
        System.out.print("Power value : ");
        int iPowVal = sc.nextInt();

        System.out.println(iBaseVal + "^" + iPowVal + "\tResult = " + fnPowerofNumber(iBaseVal, iPowVal));

    }
}
