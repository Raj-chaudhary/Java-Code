package CodingClub;

import java.util.ArrayList;
import java.util.*;

public class Sort_In_Java {
    public static void main(String[] args) {
        ArrayList <String> emails = new ArrayList<>();
        emails.add("john.doe@gmail.com");
        emails.add("jane.doe@gmail.com");
        emails.add("admin@gmail.com");
        emails.add("admin2@gmail.com");
        emails.add("contact@gmail.com");

        for(String mail: emails){
            System.out.println(mail);
        }

        Collections.sort(emails);

        System.out.println("###########aftersort###########");
        for(String mail: emails){
            System.out.println(mail);
        }

        System.out.println("######################");
        int arr[] = {43,4, 25, 50, 79, 100, 100};
        Arrays.sort(arr);
        
        for(int i: arr){
            System.out.print(i+ " ");

    }
}
}
