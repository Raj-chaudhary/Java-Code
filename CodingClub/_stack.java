package CodingClub;
import java.util.Iterator;
import java.util.Stack;

public class _stack {
    public static void main(String[] args) {
        // Stack <String> stack = new Stack<>();
        Stack <Integer> stackInteger = new Stack<>();

        // push or add
        stackInteger.push(2);
        stackInteger.push(5);
        stackInteger.push(7);
        stackInteger.push(8);
        stackInteger.push(10);
        System.out.println(stackInteger);

        // pop or remove element
        System.out.println(stackInteger.pop()); // top element popped i.e 10

        // what is at the top
        System.out.println("top element of stack: "+stackInteger.peek()); // 8

        // search the stack
        int index = stackInteger.search(5);
        System.out.println("search index of 5: "+index); // 3
        int index2 = stackInteger.search(200);
        System.out.println("search index of 200: "+index2); // -1

        // iterator stack
        Iterator<Integer> integerIterator = stackInteger.iterator();
        while (integerIterator.hasNext()) {
            System.out.println("Iterator showing element: "+integerIterator.next());
        }

             System.out.println("######################");

        // check whether stack is empty or not
        while (! stackInteger.empty()) {
            int topElement = stackInteger.pop();
            System.out.println("popped: "+topElement);
        }


    }
}
