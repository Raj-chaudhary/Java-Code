package Strings;

import java.util.Scanner;

public class StringPallindrome {
    public static boolean isPallindrome(String str) {
        int n = str.length();
        
  //  for Convert the string to lowercase and remove all non-alphanumeric characters
//   String cleanedString = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();      
//   int n = cleanedString.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String name: ");
        String str = sc.nextLine();
        System.out.println(isPallindrome(str));

        sc.close();
    }
}
