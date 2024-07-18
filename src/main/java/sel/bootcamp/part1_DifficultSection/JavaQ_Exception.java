package sel.bootcamp.part1_DifficultSection;

public class JavaQ_Exception {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0); // This will cause an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        return a / b; // Division by zero will throw an ArithmeticException
    }
}

