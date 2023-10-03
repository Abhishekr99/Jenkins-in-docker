package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(checkIfInputIsAnEvenNumber(122)); // Testing in the main method
    }

    public static boolean checkIfInputIsAnEvenNumber(int number){
        return number % 2 == 0;
    }
}