package com.example.java;

import java.util.Scanner;

public class GetInput {
    public static String getInput(String prompt){
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        String returnInput = scanner.nextLine();
        return returnInput;
    }
}
