package Gunler.gun1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        // WebDriverManager.edgedriver().setup();
        //  WebDriver driver =new EdgeDriver();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

       // driver.get("https://www.ebay-kleinanzeigen.de/");
        driver.get("https://www.mynet.com/");


        driver.manage().window().maximize();//sayfa tam ekran oluyor
       // driver.manage().deleteAllCookies(); //??
        //driver.manage().window().fullscreen();//sayfa tam ekran oluyor
        //driver.get("https://www.ebay-kleinanzeigen.de/s-fahrraeder/zubehoer/c217+fahrraeder.art_s:zubehoer");












      //  Thread.sleep(7000);//7 saniye bekleyip kapiyor

       // driver.quit();//sayfa kapama
       // driver.close();//sayfa kapama
    }
}
