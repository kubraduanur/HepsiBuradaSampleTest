package Testler;

import Base.BaseConfigPage;
import Page.HomePage;
import Page.LoginPage;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginTest extends BaseConfigPage {

    @Step({"id1 ile <id3> kadi <kadi>,id2 ile <id4> password <password>,id5 <id5> ile tıkla"})
    public void giris(String id3,String kadi,String id4,String password,String id5) throws InterruptedException {
        new LoginPage(driver).giris(id3,kadi,id4,password,id5);
    }
    @Step({"idhesap ile <control> <text> tıkla"})
    public void kontrol(String control,String text) throws InterruptedException {

       new LoginPage(driver).kontrol(control,text);

    }
    @Step({"idhesap ile <control2> sepet kontrolü yap"})
    public void kontrolsepet(String control2) throws InterruptedException {

       new LoginPage(driver).kontrolsepet(control2);

    }


}
