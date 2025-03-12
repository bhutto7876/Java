public class Inheritance {
    public static void main(String[] args) {

        calculator calc = new calculator();
        // calc.add(10, 20);
        // calc.subtract(10, 5);
        System.out.println("Addition: " + calc.add(10, 20) + " Subtraction: " + calc.subtract(10, 5));

        calculator advCalculator = new advancedCalculator();
 System.out.println("Advanced Calculator");
        System.out.println("Addition: " + advCalculator.add(10, 20) + " Subtraction: " + advCalculator.subtract(10, 5)
                + " Multiplication: " + ((advancedCalculator) advCalculator).multiply(10, 5) + " Division: "
                + ((advancedCalculator) advCalculator).divide(10, 5));
    }
}

class calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

class advancedCalculator extends calculator {
    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
