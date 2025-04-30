package _my_test;

import java.util.InputMismatchException;
import java.util.Scanner;

interface Operation {
    double calculate(double n1, double n2);
}

abstract class AbstractOperation implements Operation {
    protected String operator;

    public AbstractOperation(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }
}

class AddOp extends AbstractOperation {
    public AddOp() {
        super("+");
    }

    @Override
    public double calculate(double n1, double n2) {
        return n1 + n2;
    }
}

class SubOp extends AbstractOperation {
    public SubOp() {
        super("-");
    }

    @Override
    public double calculate(double n1, double n2) {
        return n1 - n2;
    }
}

class MulOp extends AbstractOperation {
    public MulOp() {
        super("*");
    }

    @Override
    public double calculate(double n1, double n2) {
        return n1 * n2;
    }
}

class DivOp extends AbstractOperation {
    public DivOp() {
        super("/");
    }

    @Override
    public double calculate(double n1, double n2) {
        if (n2 == 0) {
            throw new ArithmeticException("0 is not able to divide");
        }
        return n1 / n2;
    }
}

class Calculator {
    private Operation[] operations;
    public Calculator(Operation[] operations) {
        this.operations = operations;
    }

    public double performOp(double n1, double n2, String op) throws IllegalArgumentException {
        for (Operation operation : operations) {
            if (((AbstractOperation)operation).getOperator().equals(op)) {
                return operation.calculate(n1, n2);
            }
        }
        throw new IllegalArgumentException("Not allowed operator : " + op);
    }
}

public class Review_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operation[] ops = {new AddOp(), new SubOp(), new MulOp(), new DivOp()};
        Calculator calc = new Calculator(ops);

        System.out.println(" - - - - - Simple Calculator - - - - - ");
        System.out.println("Calculator On, ");

        while (true) {
            System.out.println("Give me two numbers to calculate,");
            double n1 = 0;
            double n2 = 0;
            try {
                System.out.print("First : ");
                n1 = sc.nextDouble();
                System.out.print("Second : ");
                n2 = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Wrong input, give me the numbers!");
                sc.next();
                continue;
            }
            System.out.println("Choose your operators (+, -, *, /) : ");
            String op = sc.next();
            try {
                double result = calc.performOp(n1, n2, op);
                System.out.println("Result : " + result);
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println("Error : " + e.getMessage());
            }

            System.out.println("Want another calculation? (y/n) : ");
            String choice = sc.next();
            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }
        System.out.println("Calculator Off");
        sc.close();
    }
}

