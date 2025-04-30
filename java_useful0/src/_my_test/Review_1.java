//package _my_test;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//// 인터페이스: 연산을 정의
//interface Operation {
//    double calculate(double num1, double num2);
//}
//
//// 추상 클래스: 기본적인 연산 동작을 제공
//abstract class AbstractOperation implements Operation {
//    protected String operator;
//
//    public AbstractOperation(String operator) {
//        this.operator = operator;
//    }
//
//    public String getOperator() {
//        return operator;
//    }
//}
//
//// 구체적인 연산 클래스들 (상속)
//class AddOperation extends AbstractOperation {
//    public AddOperation() {
//        super("+");
//    }
//
//    @Override
//    public double calculate(double num1, double num2) {
//        return num1 + num2;
//    }
//}
//
//class SubtractOperation extends AbstractOperation {
//    public SubtractOperation() {
//        super("-");
//    }
//
//    @Override
//    public double calculate(double num1, double num2) {
//        return num1 - num2;
//    }
//}
//
//class MultiplyOperation extends AbstractOperation {
//    public MultiplyOperation() {
//        super("*");
//    }
//
//    @Override
//    public double calculate(double num1, double num2) {
//        return num1 * num2;
//    }
//}
//
//class DivideOperation extends AbstractOperation {
//    public DivideOperation() {
//        super("/");
//    }
//
//    @Override
//    public double calculate(double num1, double num2) {
//        if (num2 == 0) {
//            throw new ArithmeticException("0으로 나눌 수 없습니다.");
//        }
//        return num1 / num2;
//    }
//}
//
//// 계산기 클래스
//class Calculator {
//    private Operation[] operations;
//
//    public Calculator(Operation[] operations) {
//        this.operations = operations;
//    }
//
//    public double performOperation(double num1, double num2, String operator) throws IllegalArgumentException {
//        for (Operation operation : operations) {
//            if (((AbstractOperation) operation).getOperator().equals(operator)) {
//                return operation.calculate(num1, num2);
//            }
//        }
//        throw new IllegalArgumentException("지원하지 않는 연산자입니다: " + operator);
//    }
//}
//
//public class Review_1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Operation[] operations = {new AddOperation(), new SubtractOperation(), new MultiplyOperation(), new DivideOperation()};
//        Calculator calculator = new Calculator(operations);
//
//        while (true) {
//            System.out.println("\n간단한 계산기");
//            System.out.println("두 개의 숫자를 입력하세요:");
//
//            double num1 = 0;
//            double num2 = 0;
//
//            try {
//                System.out.print("첫 번째 숫자: ");
//                num1 = scanner.nextDouble();
//                System.out.print("두 번째 숫자: ");
//                num2 = scanner.nextDouble();
//            } catch (InputMismatchException e) {
//                System.out.println("잘못된 입력 형식입니다. 숫자를 입력해주세요.");
//                scanner.next(); // Consume the invalid input
//                continue;
//            }
//
//            System.out.print("원하는 연산자를 입력하세요 (+, -, *, /): ");
//            String operator = scanner.next();
//
//            try {
//                double result = calculator.performOperation(num1, num2, operator);
//                System.out.println("결과: " + result);
//            } catch (IllegalArgumentException | ArithmeticException e) {
//                System.out.println("오류: " + e.getMessage());
//            }
//
//            System.out.print("계속 하시겠습니까? (y/n): ");
//            String continueChoice = scanner.next();
//            if (!continueChoice.equalsIgnoreCase("y")) {
//                break;
//            }
//        }
//
//        System.out.println("계산기를 종료합니다.");
//        scanner.close();
//    }
//}
//
