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
 * 
 * Author: Hritika Singh
 * @version 3.0
 * @since Uc1
 */

/**
 * Key Java Concept Used:
 * 1. Command-line Arguments: Allows users to pass information to the program when it is executed.
 * 2. Default Values: Providing a fallback value when no input is given.
 * 3. Conditional Statement: Using if to check conditions.
 * 4. Boolean Logic: Using logical conditions to make decisions.
 * 5. Array Length: Checking the number of command-line arguments provided.
 */

public class HelloApp 
{
    public static void main(String[] args)
    {
        // default value
        String name= "World";
        // Check if a name is provided as a command line argument
        if (args.length > 0) {
            name = args[0];   // use the provided name
        }
        System.out.println("Hello, " + name + "!");
    }
}