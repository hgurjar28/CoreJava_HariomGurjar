package Q7_Calculator;

public class Main {
    public static void main(String[] args) {

        // Creating an object of SmartCalculator
        SmartCal smcal = new SmartCal();
        // Using the add method from BasicCalculator (it is inherited and final, so can't be overridden)
        System.out.println("Addition: " + smcal.add(10, 5));

        // Using the subtract method from SmartCalculator
        System.out.println("Subtraction: " + smcal.subtract(23, 9));
    }
}
