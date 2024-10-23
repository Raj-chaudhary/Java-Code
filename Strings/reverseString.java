package Strings;

public class reverseString {

    public static char[]  reverse_String(char[] s){
        int n = s.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = s[i];
            s[i] = s[n - i - 1];
            s[n - i - 1] = temp;

        }
        return s;
    }
    public static void main(String[] args) {
        // Declare the character array (input string as char array)
        char[] s = {'h', 'e', 'l', 'l', 'o'};
       System.out.println( reverse_String(s));
        
     
    }
}
