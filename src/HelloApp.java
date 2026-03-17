/**
 * HelloApp.java- a simple Java application that prints "Hello, World!" to the console.
 * HelloAppUC1 by accepting the user name as a command line argument and greeting the user with a personalized message.
 * 
 * UC1: Display "Hello World"- The application will print "Hello, World!" to the console when executed.
 * UC2: Personalized Greeting- The application will accept a user's name as a command line argument and greet the user with a personalized message, such as "Hello, [User's Name]!".
 * 
 * Author: Hritika Singh
 * @version 1.0
 * @since Uc1
 */

/**
 * Key Java Concept Used:
 * 1. Command-line Arguments: Allows users to pass information to the program when it is executed.
 * 2. String Concatenation: The process of combining two or more strings using + operator.
 * 3. Array Indexing: Accessing elements of an array using their index, starting from 0.
 * 4. System.out.println: A method used to print messages to the console.
 */

public class HelloApp 
{
    public static void main(String[] args)
    {
        // Get the name from command line arguments
        String name= args[0];
        System.out.println("Hello, " + name + "!");
    }
}