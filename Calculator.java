
class Calculator {
    double firstOperand, secondOperand;
    char operator;

    public Calculator() {
        firstOperand = 0;
        secondOperand = 0;
        operator = ' ';
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public double calculate() {
        switch (operator) {
            case '+':
                return add(firstOperand, secondOperand);
            case '-':
                return subtract(firstOperand, secondOperand);
            case '*':
                return multiply(firstOperand, secondOperand);
            case '/':
                return divide(firstOperand, secondOperand);
            default:
                return 0;
        }
    }
}