package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_findElements {
    public static void main(String[] args) throws InterruptedException {
        //gerekli ayarları yapın
        System.setProperty("Webdriver.chrome.driver","src/reorses/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //testotomasyonu.com adresine gidin
        driver.get("https://www.testotomasyonu.com");

        //shoes linkine tıklayın
        driver.findElement(By.linkText("Shoes")).click();

        //çıkan ürünlerden 3.ürüne tıklayın

        Thread.sleep(2000);
        List<WebElement> urunElementleriListesi = driver.findElements(By.className("prod-img"));
        urunElementleriListesi.get(2).click();
        Thread.sleep(2000);

        //ürün açıklmalarında case sensitive olmadan shoe geçtiğini test edin

        WebElement urunDetaylariElementi = driver.findElement(By.className("prod-detail"));

        String expectedIcerik = "shoe";
        String actual = urunDetaylariElementi.getText().toLowerCase();

        if (actual.contains(expectedIcerik)){
            System.out.println("sho testi PASSED");
        }else System.out.println("Failed");



        Thread.sleep(3000);
        driver.quit();
    }
}
