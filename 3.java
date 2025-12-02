// 3.write a java program that reads users name and tries to convert the first 3 characters into integer,handle string index out of bound exception and number format exception.


import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            String firstThree = name.substring(0, 3);
            int number = Integer.parseInt(firstThree);

            System.out.println("Converted number: " + number);
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Name must contain at least 3 characters!");
        }
        catch (NumberFormatException e) {
            System.out.println("Error: The first 3 characters cannot be converted to an integer!");
        }
    }
}