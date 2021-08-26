package B5;

class Calculator {
    public int sum;

    public Calculator() {
        sum = 0;
        System.out.println("Calculate with no parameter");
        System.out.println("sum= " + sum);
    }

    public Calculator(int x) {
        sum = x;
        System.out.println("Calculate with parameter x= " + x);
        System.out.println("sum= " + sum);
    }

    public Calculator(int x, int y) {
        sum = x + y;
        System.out.println("Calculate with parameter x= " + x + "y= " + y);
        System.out.println("sum= " + sum);
    }

    public Calculator(int x, int y, int z) {
        sum = x + y + z;
        System.out.println("Calculate with parameter x= " + x + "y= " + y + "z= " + z);
        System.out.println("sum= " + sum);
    }
}

public class TestCalculator {
    public static void main(String[] args) {
        new Calculator();
        Calculator cal = new Calculator(1);
        new Calculator(1,2);
        new Calculator(2,4,6);
    }
}


