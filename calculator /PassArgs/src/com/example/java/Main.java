package com.example.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ================================================ //
        // +  -  addition
        // -  -  subtraction
        // *  -  Multiplication
        // /  -  Division
        // ================================================ //


        String value1 = GetInput.getInput("Enter the numeric value1 : ");
        String value2 = GetInput.getInput("Enter the numeric value2 : ");
        String action = GetInput.getInput("Enter the action you need to perform (+ - * /) : ");
        switch(action){
            case "+": System.out.println(Addition.addValues(value1, value2)); break;
            case "-": System.out.println(Subtraction.subValues(value1, value2)); break;
            case "*": System.out.println(Multiplication.mulValues(value1, value2)); break;
            case "/": System.out.println(Division.divValues(value1, value2)); break;
            default: System.out.println("Please try again and enter the correct action to perform... ");
        }
    }
}
