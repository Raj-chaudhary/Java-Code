package CodingClub;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        
        // create linked list
        LinkedList <String> linkedlist = new LinkedList<>();
        // add item 
        linkedlist.add("This");
        linkedlist.add("is");
        linkedlist.add("java");
        linkedlist.add("coding");
        linkedlist.add("club");

        // get item 
        System.out.println(linkedlist.get(0)); // prints "This"

        //size
        System.out.println(linkedlist.size()); // prints 5


        //Iterator
        Iterator<String> it = linkedlist.iterator();
        while (it.hasNext()) {
            String data = it.next();
            System.out.println(data);
        }

        // remove first
        System.out.println("Remove first element: " +linkedlist.removeFirst());
        // remove last
        System.out.println("Remove first element: " +linkedlist.removeLast());

    }
}
