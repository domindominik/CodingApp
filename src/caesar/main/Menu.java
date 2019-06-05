package caesar.main;

import file.LoadFromFile;
import file.SaveToFile;

import java.util.Scanner;

public class Menu
{
    public static void start()
    {
        Scanner scanner = new Scanner(System.in);


        Coding coding = new Coding();
        while (true)
        {
            System.out.println("1. Coding text, 2. Decodint text ");
            int menu = scanner.nextInt();
            switch (menu)
            {
                case 1:
                    System.out.println("Insert your text");
                    String text = scanner.next();
                    System.out.println("Insert shift: ");
                    int shift = scanner.nextInt();
                    System.out.println(coding.coding(text, shift));

                    SaveToFile saveToFile = new SaveToFile(coding.coding(text, shift));
                    saveToFile.saveToFile();
                    break;

                case 2:
                    System.out.println("1. Enter text, 2. Read from file");
                    menu = scanner.nextInt();
                 switch (menu)
                 {
                     case 1:
                         System.out.println("Insert your text");
                         text = scanner.next();
                         System.out.println("Insert shift: ");
                         shift = scanner.nextInt();
                         System.out.println(coding.deCoding(text, shift));
                         break;
                     case 2:
                         LoadFromFile loadFromFile = new LoadFromFile();
                         String s = loadFromFile.loadFromFile("/home/dominik/Pobrane/secretCode.txt");
                         System.out.println("Insert shift: ");
                         shift = scanner.nextInt();

                         System.out.println(coding.deCoding(s, shift));
                         break;
                 }
                    break;
            }
        }
    }
    public static void main(String[] args)
    {
       start();



    }
}
