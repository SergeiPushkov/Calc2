package CalculatorAR;

import java.io.IOException;

public class Arab {
    static int z;
    public static int calc1(int a, char b, int c) throws IOException {
        switch (b) {
            case '+':
                z = a + c;
                break;
            case '-':
                z = a - c;
                break;
            case '*':
                z = a * c;
                break;
            case '/':
                try {
                    z = a / c;
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("");
        }
        return z;
    }
}
