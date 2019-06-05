package file;

import java.io.File;

import java.util.Scanner;

public class LoadFromFile
{
    private String result;

    public String loadFromFile(String filePatch)
    {
        File fileToRead = new File(filePatch);

        if (fileToRead.exists())
        {
            try (Scanner scanner = new Scanner(fileToRead))
            {
                while (scanner.hasNext())
                {
                    result = scanner.next();
                }
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        return result;
    }
}
