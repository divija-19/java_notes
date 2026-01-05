import java.util.Scanner;
public class classes_continued {
    package mypack;
    class MyPackageClass {
        public static void main(String[] args) {
            System.out.println("This is my package!");
        }
    }
    //The -d keyword specifies the destination for where to save the class file: C:\Users\Your Name>javac -d . MyPackageClass.java


    //To inherit from a class, use the extends keyword.
    class Vehicle {
        protected String brand = "Toyota";
        public void honk(){
            System.out.println("beep");
        }
    }

    class Car extends Vehicle {
        protected String modelName= 'ABC';
        public static void main(String[] args) {
            Car myCar = new Car();
            myCar.honk();
            System.out.println(myCar.brand + " " + myCar.modelName);

        }
}

// Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks.

    class Animal {
        public void animalSound() {
            System.out.println("The animal makes a sound");
        }
    }

    class Pig extends Animal {
        public void animalSound() {
            System.out.println("The pig says: wee wee");
        }
    }

    class Dog extends Animal {
        public void animalSound() {
            System.out.println("The dog says: bow wow");
        }
    }

    class Main {
        public static void main(String[] args) {
            Animal myAnimal = new Animal();  // Create a Animal object
            Animal myPig = new Pig();  // Create a Pig object
            Animal myDog = new Dog();  // Create a Dog object
            myAnimal.animalSound();
            myPig.animalSound();
            myDog.animalSound();
        }
    }
//    If a subclass has a method with the same name as one in its parent class, you can use super to call the parent version
//    class Dog extends Animal {
//        public void animalSound() {
//            super.animalSound(); // Call the parent method
//            System.out.println("The dog says: bow wow");
//        }
//    }



//OUTER AND INNER CLASSES
    class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}


//    Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
//
//    Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).


    // Abstract class
    abstract class Animal {
        // Abstract method (does not have a body)
        public abstract void animalSound();
        // Regular method
        public void sleep() {
            System.out.println("Zzz");
        }
    }

    // Subclass (inherit from Animal)
    class Pig extends Animal {
        public void animalSound() {
            // The body of animalSound() is provided here
            System.out.println("The pig says: wee wee");
        }
    }

    //An interface is a completely "abstract class" that is used to group related methods with empty bodies

    interface Animal {
        public void animalSound(); // interface method (does not have a body)
        public void run(); // interface method (does not have a body)
    }
    // Pig "implements" the Animal interface
    class Pig implements Animal {
        public void animalSound() {
            // The body of animalSound() is provided here
            System.out.println("The pig says: wee wee");
        }
    }

    //An anonymous class is a class without a name. It is created and used at the same time.
    //An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }
    //accessing:
    Level myVar = Level.MEDIUM;

//USER INPUTS
    //import.java.util.Scanner;
class Mainn{
    public static void main(String[] args) {
        Scanner myObj = new Scanner (System.in);
        System.out.println("Enter username");
        String myName = myObj.nextLine();
        System.out.println("The username is " + myName );
    }
}
}

//DATE AND TIME IN JAVA
import java.time.LocalDate; // import the LocalDate class
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now(); // Create a date object
        LocalTime myObj = LocalTime.now();
        System.out.println(myObj); // Display the current date
    }
}

