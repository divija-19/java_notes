public class introduction {
    public static void main(String[] args) {
        System.out.println("Hello World");

        String name = "John";
        System.out.println(name);

        //other data types
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        //operations
        int x = 5;
        int y = 6;
        System.out.println("The sum is " + x + y);   // Prints: The sum is 56
        System.out.println("The sum is " + (x + y)); // Prints: The sum is 11

        //declare variables as final when their values should never change.
        final int BIRTHYEAR = 1980;

//        A primitive data type specifies the type of a variable and the kind of values it can hold.
//
//        There are eight primitive data types in Java:
//
//        Data Type	Description
//        byte:	Stores whole numbers from -128 to 127
//        short:	Stores whole numbers from -32,768 to 32,767
//        int:	Stores whole numbers from -2,147,483,648 to 2,147,483,647
//        long:	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//        float:	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//        double:	Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
//        boolean:	Stores true or false values
//        char:	Stores a single character/letter or ASCII values


        int myNumb = 5;       // myNum is an int
            // myNum = "Hello";  // Error: cannot assign a String to an int

        String myText2 = "Hi"; // myText is a String
            // myText = 123;      // Error: cannot assign a number to a String

        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble); // Outputs 9.78
        System.out.println(myInt);    // Outputs 9


//        Here are some common operators, from highest to lowest priority:
//
//                () - Parentheses
//                *, /, % - Multiplication, Division, Modulus
//                +, - - Addition, Subtraction
//                >, <, >=, <= - Comparison
//                ==, != - Equality
//                && - Logical AND
//                || - Logical OR
//                = - Assignment

        String txt = "Hello World";
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"

        String txtt = "Please locate where 'locate' occurs!";
        System.out.println(txtt.indexOf("locate"));
        //The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace)

     // To compare two strings, you can use the equals() method:
        String txt1 = "Hello";
        String txt2 = "Hello";
        System.out.println(txt1.equals(txt2));

        //The trim() method removes whitespace from the beginning and the end of a string:
        String txt3 = "   Hello World   ";
        System.out.println("After:  [" + txt3.trim() + "]");

//        \n	New Line
//        \t	Tab
//        \b	Backspace
//        \r	Carriage Return
//        \f	Form Feed

        //mathematical operations:
        Math.min(5, 10);
        Math.sqrt(64);
        Math.abs(-4.7); //absolute (positive) value of x
        Math.random();
        int randomNum = (int)(Math.random() * 101);


        //if...else syntax:
//        if (condition) {
//            // block of code to be executed if the condition is true
//        }

        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        //shorthand if else:
//        variable = (condition) ? expressionTrue :  expressionFalse;
        int timee = 20;
        System.out.println((timee < 18) ? "Good day." : "Good evening.");

        //switch syntax:
//        switch(expression) {
//            case x:
//                // code block
//                break;
//            case y:
//                // code block
//                break;
//            default:
//                // code block
//        }

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        //for statement:
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }





        //ARRAYS
        String[] carss;
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum6 = {10, 20, 30, 40};

        //accessing elements of array
        System.out.println(cars[0]);

        //change value at a specific index
        cars[0] = "Opel";

        //array length
        System.out.println(cars.length);

        //adding new index
        String[] cars = new String[4];

        //loop through an array
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        for (String car : cars) {
            System.out.println(car);
        }


        //MULTI DIMENSIONAL ARRAY
        int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };

        //accessing an element
        System.out.println(myNumbers[1][2]);

        //overwriting an element
        int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]);

        //looping through a multidimensional array
        for (int row = 0; row < myNumbers.length; row++) {
            for (int col = 0; col < myNumbers[row].length; col++) {
                System.out.println("myNumbers[" + row + "][" + col + "] = " + myNumbers[row][col]);
            }
        }
        //OR
        for (int[] row : myNumbers) {
            for (int num : row) {
                System.out.println(num);
            }
        }











    }

}