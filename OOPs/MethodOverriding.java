public class MethodOverriding {

    // method overriding - Parent and child classes both contain the same fucntion
    // with a different definition.
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat(); // this will return deer class
    }
}

class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer {
    void eat() {
        System.out.println("eats grass"); // this will return deer class
    }
}