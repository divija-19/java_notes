public class errors {
    //The try statement allows you to define a block of code to be tested for errors while it is being executed.

    //The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

    //The try and catch keywords come in pairs
    public static void main(String[ ] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
        //The finally statement lets you execute code, after try...catch, regardless of the result

        //The throw statement allows you to create a custom error.
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }

        //You can add more than one catch block, and Java will run the first one that matches the thrown exception type
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Array index does not exist.");
//        }
//        catch (ArithmeticException e) {
//            System.out.println("Cannot divide by zero.");
//        }
//        catch (Exception e) {
//            System.out.println("Something else went wrong.");

        //ORDER MATTERS so put more specific ones first


        //In older code, you had to close "resources" manually by calling their close() method:
        try {
            FileOutputStream output = new FileOutputStream("filename.txt");
            output.write("Hello".getBytes());
            output.close();  // must close manually
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
    }




}

//Error Type	        Description
//Compile-Time Error	Detected by the compiler. Prevents code from running.
//Runtime Error	        Occurs while the program is running. Often causes crashes.
//Logical Error	        Code runs but gives incorrect results. Hardest to find.
