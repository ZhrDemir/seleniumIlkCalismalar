package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethod;

import java.time.Duration;
import java.util.List;

public class C02_ByClassName {
    public static void main(String[] args) {

    //1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("Webdriver.chrome.drive","src/reorses/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


// 2- https://www.automationexercise.com/ adresine gidin

        driver.get("https://www.automationexercise.com/");

// 3- Category bolumundeki elementleri locate edin

        List<WebElement> kategoryElementleriList = driver.findElements(By.className("panel-title"));

// 4- Category bolumunde 3 element oldugunu test edin

        int expectedKategoriSayisi = 3;
        int actualKategoriSayisi = kategoryElementleriList.size();

        if (expectedKategoriSayisi==actualKategoriSayisi){
            System.out.println("Kategori sayısı testi PASSED");
        }else {
            System.out.println("Kategori sayısı testi FAİLED");
        }

// 5- Category isimlerini yazdirin
        System.out.println(ReusableMethod.stringListeDonustur(kategoryElementleriList));

        // 6- Sayfayi kapatin

        driver.quit();



 }

}