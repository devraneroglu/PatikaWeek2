import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String bir ifade yazın : ");
        String userInputWord = sc.nextLine();

            if(isPalindrome(userInputWord)){
                System.out.println("Palindrom Kelimedir (+)");
            }
            else{
                System.out.println("Palindrom Kelime Değildir (-)");
            }

    }
}