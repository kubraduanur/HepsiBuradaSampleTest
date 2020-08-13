package Testler;

import Base.BaseConfigPage;
import Page.BasketPage;
import Page.HomePage;
import com.thoughtworks.gauge.Step;

import java.io.IOException;

public class BasketTest extends BaseConfigPage {

    @Step({"sepet işlemleri <addbasket> <addbasket2> <sayid> <sayiid>"})
    public void BasketTest1(String addbasket, String addbasket2,String sayid,String sayiid) throws InterruptedException {
        new BasketPage(driver).sepeteekle(addbasket, addbasket2,sayid,sayiid);

    }

    @Step({"sepet işlemleri <addbasket1> <button1> <button2> 2.kısım"})
    public void BasketTest2(String addbasket2,String button1,String button2) throws InterruptedException {
        new BasketPage(driver).basket(addbasket2,button1,button2);
    }
    @Step({"sepet işlemleri cvc <devam> <username> <username2>"})
    public void BasketTest3(String devam,String username,String username2) throws InterruptedException, IOException {
        new BasketPage(driver).basketcvc(devam,username,username2);
    }
    @Step({"adres kısmı <adresekle> <adyol1> <ad1> <soyadyol1> <soyad1> <sehiryol> <sehiryol2> <ilce> <ilceyol> <mahalle> <mahalle2> <tamadres> <adress> <adres2> <adresadi> <telyol> <tel> <kayıt> <telsec1> <telsec2>"})
    public void BasketAdres(String adresekle,String adyol1,String ad1,String soyadyol1,String soyad1,String sehiryol,String sehiryol2,String ilce,String ilceyol, String mahalle,String mahalle2,String tamadres,String adress,String adres2,String adresadi,String telyol,String tel,String kayıt,String telsec1,String telsec2) throws InterruptedException, IOException {
        new BasketPage(driver).addresekle(adresekle,adyol1,ad1,soyadyol1,soyad1,sehiryol,sehiryol2,ilce,ilceyol,mahalle,mahalle2,tamadres,adress,adres2,adresadi,telyol,tel,kayıt,telsec1,telsec2);
    }
    @Step({"kredi kartı <devamet> <kredikartiris> <kartyol> <kartno> <isimyol> <isim> <tarihsec> <tarihsec2> <yilsec> <yilsec2> <cvcyol> <cvc>"})
    public void BasketTest3(String devamet,String kredikartgiris,String kartyol,String kartno,String isimyol,String isim,String tarihsec,String tarihsec2,String yilsec,String yilsec2,String cvcyol,String cvc) throws InterruptedException, IOException {
        new BasketPage(driver).kredikartibilgileri(devamet,kredikartgiris,kartyol,kartyol,isimyol,isim,tarihsec,tarihsec2,yilsec,yilsec2,cvcyol,cvc);
    }
}


