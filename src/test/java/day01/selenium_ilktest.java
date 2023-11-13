package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_ilktest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/reorses/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.wisequarter.com");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
driver.quit();
    }






}
