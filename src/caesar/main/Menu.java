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
                    System.out.println("1. RSA, 2. Caesar");
                    menu = scanner.nextInt();
                    switch (menu)
                    {
                        case 1:
                            RSA2 rsa2 = new RSA2();
                            rsa2.getPublicKey();
                            rsa2.getPrivateKey();
                            System.out.println("Insert your text");
                            String text = scanner.next();
                            System.out.println(rsa2.coding(text));
                            break;
                        case 2:
                            System.out.println("Insert your text");
                            text = scanner.next();
                            System.out.println("Insert shift: ");
                            int shift = scanner.nextInt();
                            System.out.println(coding.coding(text, shift));

                            SaveToFile saveToFile = new SaveToFile(coding.coding(text, shift));
                            saveToFile.saveToFile();
                            break;
                    }

                    break;

                case 2:
                    System.out.println("1. Enter text, 2. Read from file, 3. Decoding RSA from text");
                    menu = scanner.nextInt();
                 switch (menu)
                 {
                     case 1:
                         System.out.println("Insert your text");
                         String text = scanner.next();
                         System.out.println("Insert shift: ");
                         int shift = scanner.nextInt();
                         System.out.println(coding.deCoding(text, shift));
                         break;
                     case 2:
                         LoadFromFile loadFromFile = new LoadFromFile();
                         String s = loadFromFile.loadFromFile("/home/dominik/Pobrane/secretCode.txt");
                         System.out.println("Insert shift: ");
                         shift = scanner.nextInt();

                         System.out.println(coding.deCoding(s, shift));
                         break;
                     case 3:
                         System.out.println("Insert d: ");
                         long d = scanner.nextLong();
                         System.out.println("Insert n: ");
                         long n = scanner.nextLong();
                         System.out.println("Enter your text: ");
                         text = scanner.next();
                         RSA2 rsa2 = new RSA2();
                         System.out.println(rsa2.deCoding(text, d, n));
                         System.out.println("End");
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
