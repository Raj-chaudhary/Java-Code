package CodingClub;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class set_In_java {
    public static void main(String[] args) {

        ArrayList<String> emails = new ArrayList<>();
        emails.add("john.doe@gmail.com");
        emails.add("jane.doe@gmail.com");
        emails.add("john.doe@yahoo.com");
        emails.add("john.doe@gmail.com");
        emails.add("john.doe@gmail.com");

        // Declare a set - set is used to remove the multiple elements/entries it stores
        // only unique value
        Set<String> uniqueEMails = new HashSet<String>();
        uniqueEMails.add("hr@gmail.com");
        uniqueEMails.addAll(emails);
        System.out.println("Unique Emails: " + uniqueEMails);

        // iterator
        Iterator<String> iterator = uniqueEMails.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator showing: " + iterator.next());
        }

        // for loop for iteratoring
        for (String email : uniqueEMails) {
            System.out.println("For loop showing: " + email);
        }

        // size of set
        System.out.println("Size of set: " + uniqueEMails.size());

        //remove
        uniqueEMails.remove("jane.doe@gmail.com");

    }
}
