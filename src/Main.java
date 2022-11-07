import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String str) {
        //burada scanner sınıfı ile kullanıcıdan input aldım.
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Kelime Giriniz: ");
        str = input.next();
        int i = 0, j = str.length() - 1;
        // while döngüsü ile aldığım inputu palindromik olup olmadığını sorguladım.
        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
                System.out.println("Seçtiğiniz kelime Palindrom!");
                return true;
            }

            System.out.println("Seçtiğiniz kelime Palindrom değil!");
            return false;
        }
       return false;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(""));

    }
}