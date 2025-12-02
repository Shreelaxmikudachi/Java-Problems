// 1.write a java program to read two numbers from the user and perform modulus operation.handle the case where the second number is 0 using arithmetic exception.

import java.util.InputMismatchException;
import java.util.Scanner;

public class ModulusOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number (integer): ");
            int a = sc.nextInt();

            System.out.print("Enter second number (integer): ");
            int b = sc.nextInt();

            int result = a % b;
            System.out.println(a + " % " + b + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division (modulus) by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
        } finally {
            sc.close();
        }
    }
}
