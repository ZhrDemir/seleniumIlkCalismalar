package day02_driveMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_navigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/reorses/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // testotomasyona gidin
        driver.navigate().to("https://www.testotomasyonu.com");

        //title ın otomasyon içerdiğini test edin
        String expectedTitleIcerik = "Otomasyon";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Testotomasyonu title testi PASSED");
        }else {
            System.out.println("Testotomasyonu title testi FAILED");
        }


        //sonra wiseQuarter a gidin
        driver.navigate().to("https://www.wisequarter.com");

        // url nin wisequarter içerdiğini test edin
        String expectedUrlIcerik = "wisequarter";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("wisequarter Url testi PASSED ");
        }else {
            System.out.println("wisequarter Url testi FAILED ");
        }

        // tekrar testotomasyon a geri dönün
        driver.navigate().back();

        //url nin otomasyon içerdiğini test edin
        expectedUrlIcerik = "otomasyon";
        actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("testotomasyon Url testi PASSED ");
        }else {
            System.out.println("testotomasyon Url testi FAILED ");
        }

        //say kapatın












        Thread.sleep(3000);
        driver.quit();
    }
}
