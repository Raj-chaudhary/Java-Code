class Inheritance {

  public static void main(String[] args) {

    // Fish shark = new Fish();
    // shark.eat();

    Dog dobby = new Dog();
    dobby.eat();
    dobby.legs = 4;
    System.out.println(dobby.legs);
  }
}

// Base class
class Animal {
  String color;

  void eat() {
    System.out.println("Eats");
  }

  void breath() {
    System.out.println("Breathes");
  }
}

// Derived Class / subclass

class Fish extends Animal {
  int fins;

  void swim() {
    System.out.println("Swims in water");
  }
}


// multi-level inheritence
class Mammal extends Animal {
  int legs;
}

class Dog extends Mammal {
  String breed;
}