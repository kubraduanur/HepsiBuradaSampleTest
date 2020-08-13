package Testler;

import Base.BaseConfigPage;
import Page.HomePage;
import Page.LoginPage;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

import java.io.IOException;

public class HomeTest extends BaseConfigPage {

    @Step({"id1 ile <id1> giriş yap,id2 ile <id2> giriş yap"})
    public void Searchtest(String id1, String id2) throws InterruptedException {
        new HomePage(driver).Search(id1, id2);

    }

    @Step({"selector ile kategori bul <ust> <alt> <enalt>"})
    public void Kategoritest(String ust,String alt,String enalt) throws InterruptedException {
        new HomePage(driver).Kategori(ust,alt,enalt);

    }

    @Step({"marka fiyat belirle"})
    public void OzellikTest() throws InterruptedException {
        new HomePage(driver).Ozellikler("li.unselected");

    }

    @Step({"fiyat belirle"})
    public void OzellikTest2() throws InterruptedException {
        new HomePage(driver).Ozellikler2("li.box-container.fiyat > div > div > div:nth-child(1) > input", " li.box-container.fiyat > div > div > div:nth-child(3) > input", "10", "4000", "button.button.small");
    }

    @Step({"cvc dosyasına veri ekleme <secme> <user> <user2>"})
    public void CvsTest(String secme,String user,String user2) throws InterruptedException, IOException {
        new HomePage(driver).Urun(secme,user,user2);
    }
    @Step({"anasayfageri <anasayfa1> <anasayfa2> <sepetid> <sepetsil>"})
    public void Anasayfageritest(String anasayfa1,String anasayfa2,String sepetid,String sepetsil) throws InterruptedException, IOException {
        new HomePage(driver).anasayfageri(anasayfa1,anasayfa2,sepetid,sepetsil);
    }
    @Step({"adressil <hesabım> <hesabım2> <adresim> <sil>"})
    public void Adressiltest(String hesabım,String hesabım2,String adresim,String sil) throws InterruptedException, IOException {
        new HomePage(driver).adressil(hesabım,hesabım2,adresim,sil);
    }

    }

