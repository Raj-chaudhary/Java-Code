public class Abstract_class {

    public static void main(String[] args) {
        Mustang mc = new Mustang();
        // Animal --> horse ---> mustang
        System.out.println(
                "Heirarchy which is followed is animal abstract class then horse extends animal and mustang extends horse");

        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // // System.out.println(h.color);
        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
    }
}

abstract class Animal {
    String color;

    Animal() {
        // color = "brown";
        System.out.println("Animal constructor called...");

    }

    void eat() {
        System.out.println("Eating...");
    }

    abstract void walk();
}

class Horse extends Animal {

    Horse() {
        System.out.println("Horse constructor called...");
    }

    void walk() {
        System.out.println("Walk on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("mustang constructor called...");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walk on 2 legs");
    }
}