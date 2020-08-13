package Page;

import Base.BasePage;
import com.opencsv.CSVWriter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BasketPage extends BasePage {
    public BasketPage(WebDriver driver) {
        super(driver);
    }


    public void sepeteekle(String sepetid, String sepetcss,String sayid,String sayiid) throws InterruptedException {
        Thread.sleep(3000);
        clickId(sepetid);
        Thread.sleep(3000);
        String say = (driver.findElement(By.id(sayid)).getAttribute("value"));
        System.out.println(say);
        Thread.sleep(4000);
        clickcsselector(sepetcss);
        Thread.sleep(3000);
        String sayi = driver.findElement(By.id(sayiid)).getText();
        System.out.println(sayi);
        Thread.sleep(3000);
        Assert.assertEquals(say, sayi);

    }

    public void basket(String addid, String buttonincrease1, String buttonincrease2) throws InterruptedException {
        Thread.sleep(3000);
        clickId(addid);
        Thread.sleep(4000);
        clickcsselector(buttonincrease1);
        Thread.sleep(3000);
        clickcsselector(buttonincrease2);
    }

    public void basketcvc(String devam,String usernamee,String usernamee2) throws InterruptedException, IOException {
        Thread.sleep(3000);
        CSVWriter writecsv = new CSVWriter(new FileWriter("yourfile2.csv"));
        Thread.sleep(3000);
        String username = driver.findElement(By.cssSelector(usernamee)).getText();
        System.out.println(username);
        writecsv.writeNext(new String[]{username});
        Thread.sleep(3000);
        CSVWriter writecsv2 = new CSVWriter(new FileWriter("yourfile2.csv"));
        Thread.sleep(3000);
        String username2 = driver.findElement(By.cssSelector(usernamee2)).getText();
        System.out.println(username2);
        writecsv.writeNext(new String[]{username2});
        writecsv.close();
        clickcsselector(devam);
    }
public void addresekle(String adresyeni,String ad,String soyad,String adyol,String soyadyol,String sehiryol,String sehiryol2,String ilce,String ilceyol,String mahalle,String mahalle2,String tamadres,String adress,String adres2,String adresadi,String telyol,String tel,String kaydet,String telsec1,String telsec2) throws InterruptedException {
        clickcsselector(adresyeni);
        Thread.sleep(2000);
        setById(adyol,ad);
        Thread.sleep(2000);
        setById(soyadyol,soyad);
        clickcsselector(sehiryol);
        clickcsselector(sehiryol2);
        clickcsselector(ilce);
        clickcsselector(ilceyol);
        clickcsselector(mahalle);
        clickcsselector(mahalle2);
        setById(tamadres,adress);
        setById(adres2,adresadi);
        clickcsselector(telsec1);
        clickId(telsec2);
        setByIdclearsiz(telyol,tel);


}
public void kredikartibilgileri(String devamet,String karttikla,String kartyol,String kartno,String isimyol,String isim,String tarihsec,String tarihsec2,String yilsec,String yilsec2,String cvcyol,String cvc){ clickcsselector(devamet);

clickcsselector(karttikla);
setById(kartyol,kartno);
setById(isimyol,isim);
clickcsselector(tarihsec);
clickcsselector(tarihsec2);
clickcsselector(yilsec);
clickcsselector(yilsec2);
setById(cvcyol,cvc);



}

}
