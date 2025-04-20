import java.util.Scanner;

public class Main {
  public static void main(String[] arg) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to my Java Calculator!");
    System.out.println("Enter first number: ");
    double num1 = scanner.nextDouble();
    
    System.out.print("Enter an operator (+,0,*/): ");
    char operator = scanner.next().charAt(0);

    System.out.print("Enter a second number");
    double num2 = scanner.nextDouble();

    double result;

    switch (operator) {
      case '+':
      result = num1 + num2;
        break;

      case '-':
      result = num1 - num2;
        break;

      case '*':
      result = num1 * num2;
        break;

      case '/':
      if (num2 == 0) {
        System.out.print("Error: Cannot divide by zero.");
        scanner.close();
        return;
      }
      result = num1 / num2;
        break;

      default:
        System.out.println("Invalid operator!");
        scanner.close();
        return;
    }

    System.out.println("Result: " + result);
    scanner.close();
  }
}