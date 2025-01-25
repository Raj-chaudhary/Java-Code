package CodingClub;
public class Car {

    // in this code we learned static and non-static attributes and methods and how
    // class works
    // constructor

    public static int wheelCount = 4;
    int maxSpeed = 400;
    int currentSpeed = 0;

    // constructor
    String numberPlate;

    public Car(String numberPlate) {
        // this means current object's reference
        this.numberPlate = numberPlate;
    }

    void accelerate() {
        System.out.println("Speeding Up " + numberPlate);
        currentSpeed += 10;
    }

    public static void main(String[] args) {

        
        Car audi = new Car("audi 007");
        audi.accelerate();
        audi.wheelCount = 8;

        Car BMW = new Car("BMW 001");
        BMW.accelerate();
        BMW.currentSpeed += 100;

        System.out.println("current speed of Audi: " + audi.currentSpeed);
        System.out.println("current speed of BMW: " + BMW.currentSpeed);
        System.out.println("Audi wheel count: " + audi.wheelCount);
        System.out.println("BMW wheel count : " + BMW.wheelCount); // since the wheel count is static that's why the
                                                                   // wheelcount for both is same

        System.out.println("Car has " + Car.wheelCount + " wheels");
        Car.wheelCount = 4;
        System.out.println("Audi wheel count now: " + audi.wheelCount);
        System.out.println("BMW wheel count now: " + BMW.wheelCount);

    }
}
