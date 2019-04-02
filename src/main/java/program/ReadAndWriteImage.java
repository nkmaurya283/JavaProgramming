package program;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ReadAndWriteImage
{
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\user\\Downloads\\HathWay_no_current_bill.png");

        BufferedImage image = null;

        try
        {
            image = ImageIO.read(file);

            ImageIO.write(image, "jpg", new File("E:/output.jpg"));

            ImageIO.write(image, "png", new File("E:/output.png"));

            ImageIO.write(image, "gif", new File("E:/output.gif"));

           // ImageIO.write(image, "bmp", new File("E:/output.bmp"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        System.out.println("done");
    }
}