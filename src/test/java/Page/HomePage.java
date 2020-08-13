package Page;

import Base.BaseConfigPage;
import Base.BasePage;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void Search(String id1, String id2) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        clickId(id1);
        clickId(id2);

    }

   public void Kategori(String basketkategori,String altkategori,String enaltkategori) throws InterruptedException {

        clickxpath(basketkategori);
        Thread.sleep(3000);
        Actions action=new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(altkategori)), 20, 15).click().build().perform();
        Thread.sleep(3000);
         clickcsselector(enaltkategori);
    }

    public void Ozellikler(String markayol) throws InterruptedException {
        Thread.sleep(3000);
        clickcsselector(markayol);

    }

    public void Ozellikler2(String fiyatyol1, String fiyatyol2, String fiyat1, String fiyat2, String buton) throws InterruptedException {
        Thread.sleep(3000);
        setByselector(fiyatyol1, fiyat1);
        Thread.sleep(3000);
        setByselector(fiyatyol2, fiyat2);
        Thread.sleep(3000);
        clickcsselector(buton);
    }

    //isim yazılacak
    public void Urun(String sec,String user,String user2) throws IOException, InterruptedException {
        Thread.sleep(3000);
        CSVWriter writecsv = new CSVWriter(new FileWriter("yourfile.csv"));
        Thread.sleep(3000);
        String username = driver.findElement(By.cssSelector(user)).getText();
        System.out.println(username);
        writecsv.writeNext(new String[]{username});
        writecsv.close();
        clickcsselector(sec);
        Thread.sleep(3000);
        CSVWriter writecsv2 = new CSVWriter(new FileWriter("yourfile.csv"));
        Thread.sleep(3000);
        String username2 = driver.findElement(By.cssSelector(user2)).getText();
        System.out.println(username2);
        writecsv2.writeNext(new String[]{username2});
        writecsv2.close();
        Assert.assertEquals(username,username2);

    }
public void anasayfageri(String anasayfa,String anasayfa2,String sepetid,String sepetsil){
    clickcsselector(anasayfa);
    clickcsselector(anasayfa2);
    clickcsselector(sepetid);
    clickcsselector(sepetsil);
}
public void adressil(String hesabım,String hesabım2,String adresim,String sil){
        clickId(hesabım);
        clickcsselector(hesabım2);
        clickcsselector(adresim);
        clickcsselector(sil);
}
}
