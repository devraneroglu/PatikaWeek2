/*
Kullanıcıdan alınan sayının asal olup olmadığının Recursive methot kullanarak kontrol edilmesidir.
Kendisi dışında başka bir böleni bulunmaz
 */
import java.util.Scanner;

public class Main {

    private static boolean fnIsPrimeValue(int iVal, int iDivisor) {
        if (iDivisor == iVal) {      //tam bölüyor mu
            return true;
        } else {
            if (iVal % iDivisor == 0) {
                return false;
            } else {
                return fnIsPrimeValue(iVal, iDivisor + 1);  //kullanıcının girdiği sayıya kadar böleni bir artırarak sayının kendinden baska böleni var mı bak
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı girin : ");
        int iUserValue = sc.nextInt();

        if (iUserValue < 2)                           //en küçük asal sayı ikidir
            System.out.println("Asal sayı değildir");
         else {
            if (fnIsPrimeValue(iUserValue, 2)) {   // en küçük asal sayı değer ile fonksiyonu tetikle

                System.out.println("Asal sayıdır (+)");
            } else
                System.out.println("Asal sayı değildir (-)");

        }
        sc.close();
    }
}


