package com.mycompany.javafilehandling.consolenotepad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaFileHandlingConsoleNotepad {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int choice;
        boolean isExit = true;
        while (isExit) {
            System.out.println("1- Add note");
            System.out.println("2- Show notes");
            System.out.println("3- Delete note");
            System.out.println("4- Exit");
            System.out.print("Choice : ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                try {
                    // FileWriter(String dosyaAdi, boolean eklemeModu) boolean true : mevcut içeriği korur üstüne yazar
                    BufferedWriter writer = new BufferedWriter(new FileWriter("notes.txt", true));
                    System.out.print("\nNote : ");
                    String text = input.nextLine();
                    writer.write(text);
                    writer.newLine();
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                break;

                case 2: {
                    try {
                        System.out.println();
                        BufferedReader reader = new BufferedReader(new FileReader("notes.txt"));
                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                        System.out.println();
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }
                }
                break;

                case 3:
                    try {
                        File inputFile = new File("notes.txt");
                        File tempFile = new File("newNotes.txt");
                        
                        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
                        
                        System.out.print("Line number to delete : ");
                        String line;
                        int lineNo;
                        lineNo = input.nextInt();
                        input.nextLine();
                        
                        int currentNo = 1;
                        while((line = reader.readLine()) != null) {
                            if(currentNo != lineNo) {
                                writer.write(line);
                                writer.newLine();
                            }
                            currentNo++;
                        }
                        
                        reader.close();
                        writer.close();
                        
                        inputFile.delete();
                        tempFile.renameTo(inputFile);
                        
                        
                        
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    
                    break;

                case 4:
                    isExit = false;
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}
