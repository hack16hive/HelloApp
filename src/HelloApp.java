/**
 * HelloApp.java- a simple Java application that greets the user by name if provided as a command line argument, otherwise prints "Hello, World!" to the console.
 * This use case demonstrate how to handle optional command-line arguments and provide default values in Java.
 * 
 * UC1: Display "Hello World"- The application will print "Hello, World!" to the console when executed.
 * UC2: Personalized Greeting- The application will accept a user's name as a command line argument and greet the user with a personalized message, such as "Hello, [User's Name]!".
 * UC3: Provide Default value- If no name is provided as a command line argument, the application should display a default greeting message.
 * Usage: Java HelloApp [name]
 * - If a name is provided, it will greet the user with "Hello, [name]!".
 * - If no name is provided, it will greet with "Hello, World!".
 * UC4: Accept Multiple Arguments- The application can be extended to accept multiple names as command line arguments and greet each user individually, such as "Hello, [User1], [User2], ...!".
 * - if no names are provided, it will greet with "Hello, World!".
 * 
 * Author: Hritika Singh
 * @version 4.0
 * @since Uc1
 */

/**
 * Key Java Concept Used:
 * 1. Command-line Arguments: Allows users to pass information to the program when it is executed.
 * 2. Default Values: Providing a fallback value when no input is given.
 * 3. Conditional Statement: Using if to check conditions.
 * 4. Boolean Logic: Using logical conditions to make decisions.
 * 5. Looping: Using a for-each loop to iterate through multiple command-line arguments.
 * 6. Array Length: Checking the number of command-line arguments provided.
 */

public class HelloApp 
{
    public static void main(String[] args)
    {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            // Build comma-separated names
            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }

            // Final greeting
            System.out.println("Hello, " + nameBuilder.toString() + "!");
        }
    }
}