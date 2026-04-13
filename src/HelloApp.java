/**
 * HelloApp.java- a simple Java application that greets the user by name if provided as a command line argument, otherwise prints "Hello, World!" to the console.
 * uC7: Display "Hello" with multiple command line arguments using String.join() method to simplify code and improve readability.
 * 
 * 
 * Author: Hritika Singh
 * @version 7.0
 * @since Uc1
 */

/**
 * Key Java Concept Used:
 * 1. Command-line Arguments: Allows users to pass information to the program when it is executed.
 * 2. Default Values: Providing a fallback value when no input is given.
 * 3. Conditional Statement: Using if to check conditions.
 * 4. Boolean Logic: Using logical conditions to make decisions.
 * 5. Looping: Using a for-each loop to iterate through multiple command-line arguments.
 * 6. Array Length: Checking the number of command-line arguments  provided.
 * 7. string.join(): A method to concatenate strings with a specified delimiter.
 * code simplification: Instead of using StringBuilder and substring to remove the trailing comma, we can use String.join() to concatenate the names with a delimiter, which simplifies the code and improves readability.
 */

public class HelloApp 
{
    public static void main(String[] args)
    {
        // Default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Join all names with comma and space
            String names = String.join(", ", args);

            // Print greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}