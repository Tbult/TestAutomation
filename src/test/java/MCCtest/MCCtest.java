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
//        driver.findELement(By.id("")).sendKeys("");
        driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/div[2]/div/app-research/div[2]/div/a")).click();
        System.out.println("Er is op knop onderzoek aanmaken geklikt");
        // Onderzoek naam invoeren
        driver.findElement(By.id("research-name")).sendKeys("Test Onderzoek");
        // Naam eigenaar invoeren
        driver.findElement(By.id("owner-name")).sendKeys("Schoon");
        // Onderzoeksgebied invoeren
        driver.findElement(By.id("research-area")).sendKeys("Amsterdamse Waterleidingduinen");
        // Beschrijving invoeren
        driver.findElement(By.id("description")).sendKeys("Dit is een automatische test");
        // start datum invoeren
        driver.findElement(By.id("start-date")).sendKeys("11/14/2019, 3:14 PM");
        // eind datum invoeren
        driver.findElement(By.id("end-date")).sendKeys("11/28/2019, 3:25 PM");
        System.out.println("naam onderzoek, eigenaar, onderzoeksgebied, beschrijving, start datum en eind datum zijn ingevoerd");
        // selecteer bron
////        driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/div[2]/div/app-research/div[2]/div/a")).click();
//        driver.findElement(By.xpath("mat-select-2 > div:nth-child(1) > div:nth-child(1)")).click();
////        driver.findElement(By.cssSelector("mat-option-9")).click();
//        System.out.println("Eerste bron is geselecteerd");


//        driver.findElement(By.xpath("")).click();
    }
    }
