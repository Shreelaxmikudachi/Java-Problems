// 2.create a program that read array size from the user and allocates an array dynamically,handle negative array size exception if the user enters a negative size.



import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter array size: ");
            int size = sc.nextInt();

            int[] arr = new int[size];
            System.out.println("Array created with size " + size);
        }
        catch (NegativeArraySizeException e) {
            System.out.println("Error: Array size cannot be negative!");
        }
    }
}