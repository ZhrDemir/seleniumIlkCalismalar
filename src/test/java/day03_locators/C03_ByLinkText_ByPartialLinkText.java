package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ByLinkText_ByPartialLinkText {
    public static void main(String[] args) {

        //gerekli ayarlamaları yapın
        System.setProperty("Webdriver.chrome.driver","src/reorses/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");

        //shous linine tıklayın
       // driver.findElement(By.linkText("Shoes")).click();
        driver.findElement(By.partialLinkText("Sho")).click();

        // acılan sayfada Title in Shoes içerdiğini test edin
        String expectedTitleIcerik = "Shoes";
        String actuelTitle = driver.getTitle();

        if (actuelTitle.contains(expectedTitleIcerik)){
            System.out.println("Shoes testi PASSED");
        }else System.out.println("Shoes testi FAİLED");


        driver.quit();
    }
}
