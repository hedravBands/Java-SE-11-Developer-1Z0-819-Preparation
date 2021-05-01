/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Declare and Initialize Variables
Sub-Topic: How to declare a variable for a primitive data type
*/

public class Foo {
    public static void main(String[] args) {

        // Declaration of local variables, local to the main method
        boolean myBoolean;
        byte myByte;
        char myFirstChar, mySecondChar;  //char uses '', String uses ""
        short myShort;
        long myLong;
        float myFloat;
        double myFirstDouble, mySecondDouble;
        //int myInteger, short mySecondShort; //different types, same line with , is NOT ok.
        int myInteger2; short mySecondShort2; //different types, separated by ; is OK.
    }
}