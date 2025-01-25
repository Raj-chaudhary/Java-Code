package CodingClub;

public class ElectricCar extends Car {

    public ElectricCar() {
        super(""); // Call the parent class constructor with an empty string
    }

    public ElectricCar(String numberPlate) {
        super(numberPlate); // Call the parent class constructor with the number plate
    }

    public static void main(String[] args) {
         ElectricCar tesla = new ElectricCar("Tesla 001");
        System.out.println("Electric car created successfully!");
      
    }
}
