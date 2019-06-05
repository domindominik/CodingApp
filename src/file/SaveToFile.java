package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SaveToFile
{
    private String text;

    public SaveToFile(String text)
    {
        this.text = text;
    }

    public void saveToFile()
    {
        try (FileOutputStream f = new FileOutputStream(new File("/home/dominik/Pobrane/secret.txt")))
        {
            try(ObjectOutputStream o = new ObjectOutputStream(f))
            {
                o.writeObject(text);
            }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
