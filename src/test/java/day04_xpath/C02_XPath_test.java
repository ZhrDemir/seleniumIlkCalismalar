package day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_XPath_test {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1- https://testotomasyonu.com/addremove/ adresine gidin

        driver.get("https://testotomasyonu.com/addremove/");


        // 2- Add Element butonuna basin

        driver.findElement(By.xpath("//button[text()='Add']")).click();

        // 3- Delete butonu’nun gorunur oldugunu test edin

        WebElement removeElementi=driver.findElement(By.xpath("//button[text()='Remove']"));
        if (removeElementi.isDisplayed()){
            System.out.println("Delete butonu görünürlüğü testi PASSED");
        }else System.out.println("Delete butonu görünürlüğü testi Failed");

        // 4- Delete tusuna basin

        removeElementi.click();

        // 5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        WebElement AddRemoveElementi=driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));

        if (AddRemoveElementi.isDisplayed()){
            System.out.println("Add/Remove yazısı görünürlüğü testi PASSED");
        }else System.out.println("Add/Remove yazısı görünürlüğü testi Failed");

        //Remove butonunun görünür olmadığını test edin
        try {
            removeElementi = driver.findElement(By.xpath("//button[.='Remove']"));
            System.out.println("Remove butonu görünmeme testi FAİLED");
        }catch (NoSuchElementException e) {
            System.out.println("Remove butonu görünmeme testi PASSED");
        }    driver.quit();




        Thread.sleep(3000);
        driver.quit();

    }
}
