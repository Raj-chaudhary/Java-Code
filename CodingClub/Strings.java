package CodingClub;

public class Strings {
    public static void main(String[] args) {
        
        String str = "Hello world";
        System.out.println(str);

        String str1 = str + "!";
        System.out.println(str1);

        // length of string
        System.out.println(str.length());

        // substring
        System.out.println(str.substring(0,5));

        // uppercase
        System.out.println(str.toUpperCase());

        //lowercase
        System.out.println(str.toLowerCase());

        //index of 
        System.out.println(str.indexOf("world"));

        // charAt
        System.out.println(str.charAt(6));
    }
}
