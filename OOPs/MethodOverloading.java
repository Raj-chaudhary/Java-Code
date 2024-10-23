public class MethodOverloading {
    public static void main(String[] args) {

  // method overloading - Multiple fucntions with same name but different parameters 


        System.out.println("Method Overloading");
        Calculator calc = new Calculator();
        System.out.println(calc.sum(10, 15));
        System.out.println(calc.sum((float) 7.8, (float) 6.9));
        System.out.println(calc.sum(5, 7, 3));

    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return (float) a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}