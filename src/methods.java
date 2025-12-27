public class methods {
    //methods syntax:
//    public class Main {
//        static void myMethod() {
//            // code to be executed
//        }
//    }
//

    //to execute the function:
    public class Main {
        static void myMethod() {
            System.out.println("I just got executed!");
        }

        public static void main(String[] args) {
            myMethod();
        }
    }

    //methods taking different parameters:
    public class Mainn {
        static void myMethod(String fname, int age) {
            System.out.println(fname + " is " + age);
        }

        public static void mainn(String[] args) {
            myMethod("Liam", 5);
            myMethod("Jenny", 8);
            myMethod("Anja", 31);
        }
    }


    //return statement
    public class Returnn {
        static int myMethodd(int x) {
            return 5 + x;
        }

        public static void returnn(String[] args) {
            System.out.println(myMethodd(3));
        }
    }

    //method overboarding
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }

    //scope
    public class scope {
        public static void scope(String[] args) {

            // Code here CANNOT use x

            { // This is a block

                // Code here CANNOT use x

                int x = 100;

                // Code here CAN use x
                System.out.println(x);

            } // The block ends here

            // Code here CANNOT use x

        }
    }


}
