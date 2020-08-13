package Page;

import Base.BaseConfigPage;
import Base.BasePage;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void giris(String id3, String kadi, String id5, String password, String id6) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         setById(id3,kadi);
        setById(id5,password);
        clickId(id6);
    }


    public void kontrol(String control,String text1) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        clickId(control);
        String text= driver.findElement(By.cssSelector(text1)).getText();
        System.out.println(text);
        Assert.assertEquals("Kübra Duanur MUSLU",text);

    }

    public void kontrolsepet(String control2) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String text2= driver.findElement(By.id(control2)).getText();
        System.out.println(text2);
        Assert.assertEquals("0",text2);

    }


}
