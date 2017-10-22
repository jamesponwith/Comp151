package com.booya;

import java.io.File;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter filename: ");
        ArrayList <String>list = new ArrayList<>();
        boolean isError = false;
//        Scanner keyboard = new Scanner(System.in);
//        File file = new File(keyboard.nextLine());
        Scanner keyboard = new Scanner(System.in);
        do {

            try {
                File file = new File(keyboard.nextLine());
                Scanner readNameFile = new Scanner(file);
                while (readNameFile.hasNext()) {
                    list.add(readNameFile.next());
                    list.spliterator();
                }

                int count = 0;
                int symbol_counter = 0;
                String word;
                int total = 0;
                for (int z = 0; z < list.size(); z++) {
                    word = (String) list.get(z);
                    total += word.length();
                    count++;

                    if (word.contains(".") || word.contains("!") || word.contains(",") || word.contains("?") || word.contains("'") || word.contains("\"")
                            || word.contains("$") || word.contains("%") || word.contains("/") || word.contains("@") || word.contains("#") || word.contains("&")
                            || word.contains("*") || word.contains("~") || word.contains("`") || word.contains(":") || word.contains(";") || word.contains("#")
                            || word.contains("<") || word.contains(">") || word.contains("(") || word.contains(")") || word.contains("-") || word.contains("_")
                            || word.contains("}") || word.contains("{") || word.contains("]") || word.contains("[") || word.contains("=") || word.contains("+")
                            || word.contains("^") || word.contains("|")) {
                        symbol_counter++;
                    }
                }

//                for (int i = 0; i < list.size(); i++) {
//                    System.out.println(list.get(i));
//                }


                System.out.print("Total Character Count: ");
                System.out.println(total);
                total -= symbol_counter;
                System.out.print("Number of Special Characters: ");
                System.out.println(symbol_counter);
                System.out.print("Number");
                System.out.print("Word Count: ");
                System.out.println(count);
                System.out.print("Average Word Length: ");
                System.out.println(total/count);
                isError = false;

            } catch (Exception e) {
                System.out.println(e.getMessage());
                isError = true;
                System.out.println("Enter filename: ");
            }
        }
        while (isError);
    }
}

