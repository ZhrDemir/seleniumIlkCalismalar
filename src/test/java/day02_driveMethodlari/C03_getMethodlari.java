package day02_driveMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_getMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/reorses/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.testotomasyonu.com");
        Thread.sleep(1000);

        //System.out.println(driver.getPageSource());//tüm kodları gönderdi

        System.out.println(driver.getWindowHandle());//selenium un oluşturduğu her webdriver objesine verdiği unique
        // bir koddur.sayfalar arası geçiş yaparken kullanıcaz .

        System.out.println(driver.getWindowHandles()); // test sırasında driver dirden fazla window açtıysa
        // bir set olarak açılan tüm windowların handle değerlerini döndürür



        Thread.sleep(3000);
        driver.quit();




    }
}
