package day02_driveMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_getMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/reorses/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();





        Thread.sleep(3000);
        driver.quit();




    }
}
