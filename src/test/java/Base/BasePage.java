package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class BasePage {

    public static WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;

    }

    public void setById(String idsend,String information){
        driver.findElement(By.id(idsend)).clear();
        driver.findElement(By.id(idsend)).sendKeys(information, Keys.ENTER);



    }
    public void setByIdclearsiz(String idsend,String information){

        driver.findElement(By.id(idsend)).sendKeys(information, Keys.ENTER);



    }
    public void clickId(String idclick){

        driver.findElement(By.id(idclick)).click();


    }
    //path=yol
    public void clickxpath(String yol){

        driver.findElement(By.xpath(yol)).click();
    }

    public void setByXpath(String id2send,String information2)
    {
        driver.findElement(By.xpath(id2send)).clear();
        driver.findElement(By.xpath(id2send)).sendKeys(information2);
    }
    public void clickcsselector(String yol1){

        driver.findElement(By.cssSelector(yol1)).click();
    }
    public void setByselector(String id3send,String information3)
    {
        driver.findElement(By.cssSelector(id3send)).clear();
        driver.findElement(By.cssSelector(id3send)).sendKeys(information3);
    }
}

