package day01_seleniumOtomasyonu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebdriverOlusturma {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/reorses/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.testotomasyonu.com");
        Thread.sleep(5000);
        driver.manage().window().maximize();

        Thread.sleep(5000);
        driver.close();
        driver.quit();
    }
}
