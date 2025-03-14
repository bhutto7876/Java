public class Inheritance {
    public static void main(String[] args) {

        calculator calc = new calculator();
        System.out.println("Addition: " + calc.add(10, 20) + " Subtraction: " + calc.subtract(10, 5));

        calculator advCalculator = new advancedCalculator();
        System.out.println("Advanced Calculator");
        System.out.println("Addition: " + advCalculator.add(10, 20) + " Subtraction: " + advCalculator.subtract(10, 5)
                + " Multiplication: " + ((advancedCalculator) advCalculator).multiply(10, 5) + " Division: "
                + ((advancedCalculator) advCalculator).divide(10, 5));

        veryAdvanceCalculator veryAdvCalc = new veryAdvanceCalculator();
        System.out.println("Very Advanced Calculator");
        System.out.println("Addition :: " + veryAdvCalc.add(15, 30) + " Subtraction :: " + veryAdvCalc.subtract(15, 30)
                + " Multiplication :: " + veryAdvCalc.multiply(15, 30) + " Division :: " + veryAdvCalc.divide(30, 15)
                + " Power:: " + veryAdvCalc.power(5, 2));
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


//  Multi Level Inheritance
class veryAdvanceCalculator extends advancedCalculator {
    public double power(int a, int b) {
        return Math.pow(a, b);
    }
}
