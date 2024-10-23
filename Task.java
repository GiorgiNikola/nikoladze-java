import java.util.Scanner;

public class Task {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        // Input and process a number
        int number = getInt("Enter a whole number: ");
        if (number > 7) System.out.println("Hello");

        sc.nextLine();
        // Input and process a name
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        if (name.equals("John")) System.out.println("Hello, John");
        else System.out.println("There is no such name");

        // Input and process the array
        int arrSize = getInt("Enter number of elements in array: ");
        int[] arr = new int[arrSize];

        for (int i = 0; i < arr.length; i++){
            arr[i] = getInt("Enter integer:");
        }

        // Output elements divisible by 3
        System.out.println("Multiples of 3: ");
        for (int j : arr) {
            if (j % 3 == 0) System.out.println(j);
        }
        sc.close();
    }

    // Method to get integer
    public static int getInt(String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = sc.next();
            int intInputValue;
            try {
                intInputValue = Integer.parseInt(input);
                return intInputValue;
            } catch (NumberFormatException ne) {
                System.out.println("Input is not a number, continue");
            }
        }
    }


    // Task 2
    // Answer the question
    // Following sequence: [((())()(())]] is incorrect
    // Because first '(' is unclosed and there is extra ']' at the end
    // To make it correct, we can either remove the extra '(' and ']',
    // or balance them by closing the brackets properly.
    // So the correct sequence is: [(())()(())] or [[((())()(()))]]
}
