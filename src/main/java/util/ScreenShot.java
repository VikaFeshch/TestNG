package util;

import config.BaseClass;
//import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ScreenShot extends BaseClass{

    // all screen
    public static void getScreenShot(WebDriver driver, String filename){
        File file= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("pictures/failures/"+new SimpleDateFormat("dd_MM_HH_mm_ss").format(Calendar.getInstance().getTime())+filename+".png");
        try {
            FileUtils.copyFile(file,dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // cutting from screen

    public static void getWebElementPNG(WebElement ele, String fileName) {   // create PNG
// Get entire page screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        BufferedImage fullImg;
        try {
            fullImg = ImageIO.read(screenshot);
        } catch (IOException e) {
            return;

        }

// Get the location of element on the page
        Point point = ele.getLocation();

// Get width and height of the element
        int eleWidth = ele.getSize().getWidth();
        int eleHeight = ele.getSize().getHeight();

// Crop the entire page screenshot to get only element screenshot
        BufferedImage eleScreenshot = fullImg.getSubimage(point.getX(), point.getY(),
                eleWidth, eleHeight);
        try {
            ImageIO.write(eleScreenshot, "png", screenshot);
        } catch (IOException e) {
            return;
        }

// Copy the element screenshot to disk
        File screenshotLocation = new File("pictures/success/" + new SimpleDateFormat("MM_dd_HH-mm-ss").format(Calendar.getInstance().getTime()) + fileName + ".png");

        try {
            FileUtils.copyFile(screenshot, screenshotLocation);
        } catch (IOException e) {
        }
     //   return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

}
