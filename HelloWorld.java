package LearningJava;

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    System.out.println("Hey, it worked!");

    // define variables by declaring the data type and then a descriptive name for the variable.
    // final makes the variable unchangeable. ( const in JavaScript )

    String hello = "Hello World.";
    System.out.println(hello);

    final double pi = 3.14159;
    System.out.println(pi);



    // PRIMITIVE DATA TYPES:
    // No built in behavior.
    // +, -, /, *, %, == are primitive checkers. 

    // for characters
    char firstLetter = 'c';
    System.out.println(firstLetter);

    // can only be used for whole numbers.
    int wholeNumber = 11;
    System.out.println(wholeNumber);

    // double is used to make decimal numbers or very large/small numbers
    double price = 9.99;
    System.out.println(price);

    // boolean is used for true or false
    boolean likesBeer = true;
    System.out.println(likesBeer);

    // OBJECTS: 
    // Objects have built-in behavior.
    // Can compare objects using .equals()
    // + will concatenate the strings together into one string.

    // used to make a string literal.
    String newString = "This is how you make a string literal.";
    System.out.println(newString);

    // used to create a new string object.
    String otherNewString = new String("This is how you make a string object.");
    System.out.println(otherNewString);

  }
}