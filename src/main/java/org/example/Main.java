package org.example;

public class Main {
    public static void main(String[] args) {
      /*  printName();
        printName();
        String name = printName("Test");
        System.out.println(name);*/

        calculateAVG(2, 6);
    }

    public static void printName() {
        System.out.println("Alex");
    }

    public static String printName(String name) {
        return name + "!";
    }

    public static void calculateAVG(int numberOne, int numberTwo) {
        int result = (numberOne + numberTwo)/2;
        System.out.println(result);
    }
}