/*
Recursive metot ile Fibonacci serisi hesaplanması
 1 1 2 3 5 8 13 21 ...
  f(1) = 1 , f(2) = 1 değerlerini biliyoruz
  f(3) = f(2) + f(1) = 1 + 1
  f(4) = f(3) + f(2) = 2 + 1
  f(5) = f(4) + f(3) = 3 + 2
  f(6) = f(5) + f(4) = 5 + 3
  .
  f(n) = f(n-1) + f(n-2)
 */

import java.util.Scanner;

public class Main {

    static int fnFibonnacciSeries(int iStopVal) {

        if (iStopVal == 1 || iStopVal == 2)
            return 1;
        return fnFibonnacciSeries(iStopVal - 1) + fnFibonnacciSeries(iStopVal - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayi girin : ");
        int iUserVal = sc.nextInt();
        System.out.print(fnFibonnacciSeries(iUserVal));

    }
}