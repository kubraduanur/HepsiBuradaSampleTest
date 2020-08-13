package Base;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class BaseConfigPage {

    public static WebDriver driver;


    @BeforeScenario
    public void Prepare() {
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
   @AfterScenario
    public void AfterTesting() throws InterruptedException {

        Thread.sleep(4000);
        driver.quit();

    }

}

