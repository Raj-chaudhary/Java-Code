package CodingClub;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add items in ArrayList
        list.add("Welcome");
        list.add("to");
        list.add("New");
        list.add("Year");
        list.add("2025");
        list.add("!!!!!!!");

        //get the element from the ArrayList
        System.out.println("Element at index 3: " +list.get(2));


        // Update the element from the ArrayList
        list.set(1, "in");
        

        // Size 
        System.out.println("Size of ArrayList: " + list.size());

        // Remove element from ArrayList
        list.remove(5);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
