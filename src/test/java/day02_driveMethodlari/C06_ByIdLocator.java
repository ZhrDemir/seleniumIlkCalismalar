package day02_driveMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_ByIdLocator {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/reorses/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //testotomasyonu.com a gidin
        driver.get("https://testotomasyonu.com");

        //arama kutusuna phone yazıp arattır
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));

        aramaKutusu.sendKeys("phone");

        aramaKutusu.submit();

        //bulunan sonuç listesini yazdır

        WebElement sonucyazıElementi = driver.findElement(By.className("product-count-text"));
        System.out.println(sonucyazıElementi);//referansını yazdırır
        System.out.println(sonucyazıElementi.getText());// 4 Products Found

        //arama sonucunda ürün bulunabildiğini test et

        String sonucSayisiYazdir = sonucyazıElementi.getText().replaceAll("\\D","");

        int sonucSayisiInt = Integer.parseInt(sonucSayisiYazdir);

        if (sonucSayisiInt>0){
            System.out.println("Arama testi PASSED");
        }else {
            System.out.println("Arama testi Failed");
        }



        Thread.sleep(3000);
        driver.quit();
    }
}
