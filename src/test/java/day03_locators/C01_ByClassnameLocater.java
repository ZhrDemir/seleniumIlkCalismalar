package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethod;

import java.time.Duration;
import java.util.List;

public class C01_ByClassnameLocater {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/reorses/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //testotomasyonu.com sf gidin

        driver.get("https://www.testotomasyonu.com");

        //arama kutusuna phone yazıp aratın

        WebElement aramaKutusu = driver.findElement(By.id("global-search"));

        aramaKutusu.sendKeys("phone" + Keys.ENTER);


        //arama yapıldıktan sonra, sol tarafta çıkan Categories menüsündeki
        // kategori sayısnın 8 old tespit edin

        int expectedKategoriSayisi = 8;


        List<WebElement> kategoriElementleriList = driver.findElements(By.className("acc_head"));
        int actualKategoriSayisi= kategoriElementleriList.size();

        if (expectedKategoriSayisi==actualKategoriSayisi){
            System.out.println("kategori sayısı testi PASSED");
        }else {
            System.out.println("kategori sayısı testi FAİLED");
            System.out.println("Actuel kategori sayısı : " + actualKategoriSayisi);
        }


        //kategorileri yazdırın .
  /*      for (WebElement categorieach:categoriElementleriList
        ) {
            System.out.println(categorieach.getText());
        }

*/




        System.out.println(ReusableMethod.stringListeDonustur(kategoriElementleriList));

        Thread.sleep(3000);
        driver.quit();
    }
}
