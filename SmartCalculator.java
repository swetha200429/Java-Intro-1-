import java.util.Scanner;

class SmartCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2;
        int operation;

        System.out.println("----- Smart Calculator -----");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");

        System.out.print("Choose operation: ");
        operation = sc.nextInt();

        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();

        switch (operation) {

            case 1:
                System.out.println("Result = " + (num1 + num2));
                break;

            case 2:
                System.out.println("Result = " + (num1 - num2));
                break;

            case 3:
                System.out.println("Result = " + (num1 * num2));
                break;

            case 4:
                if (num2 != 0) {
                    System.out.println("Result = " + (num1 / num2));
                } else {
                    System.out.println("Division by zero not allowed");
                }
                break;

            case 5:
                System.out.println("Result = " + (num1 % num2));
                break;

            default:
                System.out.println("Invalid operation!");
        }

        sc.close();
    }
}
