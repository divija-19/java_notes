public class classes {
    //creating an object and printing it
    int x = 4;
    int y;
    int z;

    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        classes myObj = new classes();
        System.out.print(myObj.x);
        //can access attributes by creating an object of the class, and by using the dot syntax (.)

        classes myObj2 = new classes();
        myObj2.y = 3;
        System.out.println(myObj2.y);

        //can also overwrite by simply writing myObj.x = 1
        //if do not wanna overwrite use the keyword "final":
        //final int x = 24;

        classes myObj3 = new classes();
        System.out.println("Name: " + myObj3.fname + " " + myObj3.lname);
        System.out.println("Age: " + myObj3.age);

        //Inside main, call myMethod():
        myMethod();
    }

    //Create a method named myMethod() in Main:
    static void myMethod() {
        System.out.println("Hello world");
    }
}



//this is furthur example (it will give error as 1 program cannot have more than 1 main class)

//create a main class
public class Main
{
    //create a method called speed
    public void speed(int maxSpeed){
        System.out.println("The max speed is "+  maxSpeed);
    }
    // Inside main, call the methods on the myCar object
    public static void main(String[] args){
        Main myCar = new Main();
        myCar.speed(200);
    }



    //To refer to the class variable and not the parameter, you can use the this keyword:
    public Main(int z) {
        this.z = z; // refers to the class variable z
    }

    /*
    class Person {
    public String name = "John";   // Public - accessible everywhere
    private int age = 30;          // Private - only accessible inside this class
}
     */



    /*
    A static method belongs to the class, not to any specific object. This means you can call it without creating an object of the class.
    An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclasss
     */
}



/*
1. CLASSES

| Type / Heading           | Example                                | One-line Explanation                                   |
| ------------------------ | -------------------------------------- | ------------------------------------------------------ |
| Public Class             | `public class Main { ... }`            | Accessible from anywhere, file name must match.        |
| Non-Public Class         | `class Helper { ... }`                 | Default/package visibility, multiple allowed per file. |
| Final Class              | `public final class Vehicle { ... }`   | Cannot be extended/inherited.                          |
| Abstract Class           | `abstract class Shape { ... }`         | Cannot be instantiated, meant to be subclassed.        |
| Public Abstract Class    | `public abstract class Animal { ... }` | Abstract class accessible everywhere.                  |
| Private Class (nested)   | `private class Node { ... }`           | Only accessible inside the enclosing class.            |
| Protected Class (nested) | `protected class Inner { ... }`        | Accessible in package & subclasses.                    |


2. METHODS

| Type / Heading         | Example                                          | One-line Explanation                                           |
| ---------------------- | ------------------------------------------------ | -------------------------------------------------------------- |
| Public Static Method   | `public static void main(String[] args) { ... }` | Can run without an object; JVM entry point.                    |
| Static Method          | `static void myMethod() { ... }`                 | Can be called using class name or inside class without object. |
| Non-Static Method      | `public void speed(int maxSpeed) { ... }`        | Must be called on an object of the class.                      |
| Final Method           | `public final void display() { ... }`            | Cannot be overridden in subclasses.                            |
| Private Method         | `private void calculate() { ... }`               | Only accessible within the same class.                         |
| Protected Method       | `protected void show() { ... }`                  | Accessible within package & subclasses.                        |
| Abstract Method        | `abstract void draw();`                          | Declared without body, must be implemented in subclass.        |
| Public Abstract Method | `public abstract void move();`                   | Abstract method accessible everywhere.                         |


3. VARIABLES

| Type / Heading     | Example                | One-line Explanation                              |
| ------------------ | ---------------------- | ------------------------------------------------- |
| Instance Variable  | `int y;`               | Belongs to each object separately.                |
| Static Variable    | `static int count;`    | Belongs to the class, shared by all objects.      |
| Final Variable     | `final int x = 10;`    | Constant; cannot be changed after initialization. |
| Private Variable   | `private int id;`      | Accessible only within the class.                 |
| Protected Variable | `protected int score;` | Accessible in package & subclasses.               |
| Public Variable    | `public int age;`      | Accessible from anywhere.                         |


4. CONSTRUCTORS

| Type / Heading        | Example                       | One-line Explanation                                            |
| --------------------- | ----------------------------- | --------------------------------------------------------------- |
| Public Constructor    | `public Main() { ... }`       | Used to initialize objects, accessible everywhere.              |
| Private Constructor   | `private Singleton() { ... }` | Prevents direct instantiation, often used in Singleton pattern. |
| Protected Constructor | `protected Shape() { ... }`   | Accessible in package & subclasses.                             |
| Default Constructor   | `Main() { ... }`              | No modifier; accessible in package.                             |

 */


