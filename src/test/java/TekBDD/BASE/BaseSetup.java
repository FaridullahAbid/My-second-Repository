package TekBDD.BASE;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseSetup {
    private static ChromeDriver driver;

    public void openbrowser(){
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static ChromeDriver getDriver(){
        return driver;
    }
}
