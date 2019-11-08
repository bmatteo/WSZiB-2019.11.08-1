package pl.edu.wszib;

public class Calculator {
    public int add(int a, int b) {
        return a+b;
    }

    public int difference(int a, int b) {
        return a-b;
    }

    public int multipy(int a, int b) {
        return a*b;
    }

    public double divide(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException();
        }
        return ((double) a) / ((double) b);
    }
}
