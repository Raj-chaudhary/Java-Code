package Strings;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        // c[] = { 'ahar arr', 'b', 'c', 'd' };
        // String str = "abcd";
        // String str1 = new String("abcd");

        // Strings are IMMUTABLE

        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine(); // it prints complete line
        // String name1 = sc.next(); // it prints only first word

        // System.out.println(name);
        // System.out.println(name1);

        String FullName = "Raj Chaudhary";

        System.out.println(FullName.length()); // .length help to get the length of string

        // Concatenation
        String FirstName = "Raj";
        String LastName = "Chaudhary";
        String fullName = FirstName + " " + LastName;
        System.out.println(fullName);

        // CharAt

        System.out.println(fullName.charAt(6));

        sc.close();
    }
}
