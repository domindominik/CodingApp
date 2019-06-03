package caesar.main;

import java.util.Scanner;

public class Menu
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        Coding coding = new Coding();



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

                break;

            case 2:
                break;
        }


    }
}
