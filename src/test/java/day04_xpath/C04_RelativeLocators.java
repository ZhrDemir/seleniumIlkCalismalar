package day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C04_RelativeLocators {
    public static void main(String[] args) throws InterruptedException {

        // gerekli ayarlari yapin
        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // https://testotomasyonu.com/relativeLocators sayfasina gidin

        driver.get("https://testotomasyonu.com/relativeLocators");

        // DSLR Camera elementini locate edin

        WebElement dslrCameraElementi = driver.findElement(By.id("pic7_thumb"));

        // webelemntin HTML kodunda src tag'inin
        // "testotomasyonu.com/uploads/product" icerdigini test edin

        String srcAttributeValue=dslrCameraElementi.getAttribute("src");

        String expectedHtmlIcerik = "testotomasyonu.com/uploads/product";

        if (srcAttributeValue.contains(expectedHtmlIcerik)){
            System.out.println("Passed");
        }else System.out.println("Failed");

        //Bir web sf da bir web elementi görebiliyor,
        // HTML kodlarına ulaşabiliyor ama locate edemiyorsanız
        // etrafındaki web elementleri kullanarak locate işlemini yapabilmemiz için
        // RELATİVE LOCATOR özelliği kullanılır
        // Bunun için hedef elementin en az bir özelliği
        // hedef element etrafında locate edip kullanabildiğimiz en az bir başka element olmalıdır.

        //DSLR Camera WebElementi ve relative locator kullanarak Motor E13 telefonu locate edin

        WebElement motorE13Elementi =
                driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(dslrCameraElementi));

        //Motor E13 telefonunun src attributeında 1688033137 numarasının bulunduğunu test edin

        expectedHtmlIcerik = "16882639136208024";
        String actualSrcAttributeValue = motorE13Elementi.getAttribute("src");


        if (actualSrcAttributeValue.contains(expectedHtmlIcerik)){
            System.out.println("PASSED");
        }else System.out.println("FAILED");

        // Hp Victus bilgisayarin src attribute 'inda 1688033137 numarasinin bulundugunu test edin
       WebElement hpVictusElementi =
               driver.findElement(RelativeLocator.with(By.id("pic12_thumb")).below(dslrCameraElementi));


        expectedHtmlIcerik = "1688033137";
        actualSrcAttributeValue = hpVictusElementi.getAttribute("src");


        if (actualSrcAttributeValue.contains(expectedHtmlIcerik)){
            System.out.println("PASSED");
        }else System.out.println("FAILED");


        // Samsung saat'in id attribute'nun degerinin "pic13_thumb" oldugunu test edin

        WebElement samsugSmartWatchElementi =
                driver.findElement(RelativeLocator.with(By.tagName("img")).below(motorE13Elementi).toRightOf(hpVictusElementi));

        String expectedIDDegeri = "pic13_thumb";
        String actualIdDegeri = samsugSmartWatchElementi.getAttribute("id");


        if (expectedIDDegeri.equals(actualIdDegeri)){
            System.out.println("PASSED");
        }else System.out.println("FAILED");



        Thread.sleep(3000);
        driver.quit();
    }
}
