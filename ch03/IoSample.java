import java.io.Console;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class IoSample {

    public static void main(String[] args) {
        // testScanner();
        // testConsole();
        testReadAndWriteFile();
    }

    private static void testScanner() {
        Scanner in = null;
        try {
            in = new Scanner(System.in);

            // get string input
            System.out.println("What is your name?");
            String name = in.nextLine();
            System.out.println("Your input is: " + name);
    
            // get integer input
            System.out.println("Try to type a number:");        
            int number = in.nextInt();
            System.out.println("Your number is: " + number);
    
            // get double input
            System.out.println("Try to type a float number:");
            double num = in.nextDouble();
            System.out.println("Your float is: " + num);
        } catch (Exception e) {

        } finally {
            if (in != null) {
                in.close();
            }
        }
    }

    /**
     * Since we can see the char on the screen while using Scanner class, 
     * we use Console class instead to input password.
     */
    private static void testConsole() {
        Console cons = System.console();
        String username = cons.readLine("User name:");
        char[] pwd = cons.readPassword("Password:");
        System.out.println("User name is: " + username + ", and password length is: " + pwd.length);
    }

    private static void testReadAndWriteFile() {
        Scanner in = null;
        PrintWriter out = null;
        try {
            String filename = "test.txt";
            Path path = Paths.get("test.txt");
            String charset = "UTF-8";

            in = new Scanner(path, charset);
            String content = in.nextLine();
            System.out.println(content);

            out = new PrintWriter(filename, charset);
            out.printf("test is %s", "success");
        } catch (Exception e) {

        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

}