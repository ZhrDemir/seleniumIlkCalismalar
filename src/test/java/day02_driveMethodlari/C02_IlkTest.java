package day02_driveMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IlkTest {
    public static void main(String[] args) throws InterruptedException {
        //testotomasyonu anasayfaya gidin
        //URL nin https://www.testotomasyonu.com olduğunu
        //ve Title'in test kelimesi içerdiğini test edin

        System.setProperty("Webdriver.chrome.driver","src/reorses/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        //testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");

        //URL nin https://www.testotomasyonu.com olduğunu
        String expectedUrl = "https://www.testotomasyonu.com";
        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Url testi PASSED");
        }else {
            System.out.println("Url testi FAİLED" );
            System.out.println("Actual Url : " + actualUrl);
        }

        //ve Title'in test kelimesi içerdiğini test edin
        String expectedTitleIcerigi = "test";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerigi)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title testi Failed");
            System.out.println("Actuel Title : " + actualTitle);
        }

        Thread.sleep(3000);
        driver.quit();


    }
}
