package MCCtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MCCtest {
    private static WebDriver driver = null;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\t.bult.CIMSOLUTIONS\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:4200/app/research");
//        driver.get("http://172.16.0.45/app#/research");
//        driver.get("http://www.test.harpenslager.nl");
//        driver.findElement(By.id("i_name")).sendKeys("Jansen");
        driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/div[2]/div/app-research/div[2]/div/a")).click();
        System.out.println("Er is op knop onderzoek aanmaken geklikt");
        driver.findElement(By.id("i_firstname")).sendKeys("henkie");
//        class="btn btn-success btn-round"

    }
    }
