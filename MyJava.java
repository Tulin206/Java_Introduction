public class MyJava{
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        System.out.println ("text to enter");
        System.out.println (1 + 2 + 3 + 4 + 5 + " Numbers and Text " + 6 + 7 + 8 + 9 + 0);

        int max = 20, min = 1;
        int value = 7;

        if (value>max){
            max = value;
        }
        else if (value <min) {
            min = value;
        }
        else {
            System.out.println ("The value is in the interval [" + min + "," + max + "].");
            }

        do {
            System.out.println ("I am unique.");
        } while (0 >= 1);

        for (int i=42; i > 0; i--) {
            System.out.println("noch " + i);
            }

        // while (true) {
        //    System.out.println ("Echo");
        //    }

    }

}