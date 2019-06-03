package caesar.main;

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
                    System.out.println("Insert your text");
                    text = scanner.next();
                    System.out.println("Insert shift: ");
                    shift = scanner.nextInt();
                    System.out.println(coding.deCoding(text, shift));
                    break;
            }
        }
    }
    public static void main(String[] args)
    {
       start();



    }
}
