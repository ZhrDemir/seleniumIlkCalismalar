package day02_driveMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_manageMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/reorses/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        System.out.println("ilk baştaki konum : " + driver.manage().window().getPosition());//ilk konum

        System.out.println("ilk baştaki size : " + driver.manage().window().getSize());//ilk size


        Thread.sleep(3000);

        driver.manage().window().maximize();

        System.out.println("maximize konum : " + driver.manage().window().getPosition());//ilk konum

        System.out.println("maximize size : " + driver.manage().window().getSize());

        driver.manage().window().fullscreen();

        System.out.println("fullscreen konum : " + driver.manage().window().getPosition());//ilk konum

        System.out.println("fullscreen size : " + driver.manage().window().getSize());

        Thread.sleep(3000);

        driver.manage().window().setSize(new Dimension(1000,700));
        driver.manage().window().setPosition(new Point(50,100));

        System.out.println("yeni konum : " + driver.manage().window().getPosition());//ilk konum

        System.out.println("yeni size : " + driver.manage().window().getSize());

        System.out.println(driver.manage().window().getSize().getWidth());

        Thread.sleep(3000);
        driver.quit();








    }
}
