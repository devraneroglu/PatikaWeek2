/*
Hesap Makinesi örneğinde metotların kullanılması ;
 */

import java.util.Scanner;

public class Main {
/*1- Toplama İşlemi
2- Çıkarma İşlemi
3- Çarpma İşlemi
4- Bölme işlemi
5- Üslü Sayı Hesaplama
6- Faktoriyel Hesaplama
7- Mod Alma
8- Dikdörtgen Alan ve Çevre Hesabı*/


    static void Toplam() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksin: ");
        int n = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int number;
            System.out.println(i + ". sayı: ");
            number = sc.nextInt();
            result += number;

        }
        System.out.println("toplam: " + result);


    }

    static void Fark() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksin:");
        int n = sc.nextInt();
        int number, result = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayı :");
            number = sc.nextInt();
            if (n == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }


    static void Carpim() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksin:");
        int n = sc.nextInt();
        int number, result = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayı :");
            number = sc.nextInt();
            if (n == 1) {
                result *= number;
                continue;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }
    static void Bolme() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksin:");
        int n = sc.nextInt();
        int number;
        double result = 1.0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayı :");
            number = sc.nextInt();
            if (n == 1) {
                System.out.println("bölen girmelisiniz: ");
                result = number;
                continue;
            }
            if (i != 1 && number == 0) {
                System.out.println("sayı 0'a bölünemez.");
                break;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }


    static int UsAl(int a, int b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("taban sayısı: ");
        a = sc.nextInt();
        System.out.println("Üs sayısı: ");
        b = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println(a + "^" + b + " = " + result);
        return result;
    }

    static int Faktoriyel(int a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("faktöriyeli alınmak istenen sayı: ");
        a = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println(a + "! = " + result);
        return result;
    }

    static int Mod(int a, int b) {
        Scanner input = new Scanner(System.in);
        System.out.println("bölünen sayı: ");
        a = input.nextInt();
        System.out.println("bölen sayı: ");
        b = input.nextInt();
        int result = a % b;
        System.out.println(a + " sayısının " + b + " ile bölümünden kalan " + result);
        return result;
    }

    static int AlanveCevre(int a, int b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dikdörtgenin birinci kenar uzunluğu: ");
        a = sc.nextInt();
        System.out.println("dikdörtgenin ikinci kenar uzunluğu: ");
        b = sc.nextInt();
        int result1 = a * b;
        int result = 2 * (a + b);
        System.out.println("dikdörtgenin alanı: " + result1 + "\ndikdörgenin çevresi: " + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = input.nextInt();
            switch (select) {
                case 1:


                    Toplam();
                    break;
                case 2:

                    Fark();
                    break;
                case 3:

                    Carpim();
                    break;
                case 4:

                    Bolme();
                    break;
                case 5:

                    UsAl(1, 1);
                    break;
                case 6:

                    Faktoriyel(1);
                    break;
                case 7:

                    Mod(1, 1);
                    break;
                case 8:

                    AlanveCevre(1, 1);
                    break;

                default:
                    System.out.println("Hatalı giriş\t Seçim ekranına yönleneceksin ");
                    break;
            }
        } while (select != 0);
    }
}