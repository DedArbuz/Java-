package ru.savkk.test;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.PendingException;
import cucumber.api.java.ru.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;




class cock{
    WebDriver driver;
    cock(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Desktop\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        this.driver = new FirefoxDriver();
        WebDriverRunner.setWebDriver(driver);
    }

}

public class MyStepdefs{

    cock rts = new cock();

    @Допустим("^пользователь желает получить список гос закупок в ценовом диапозоне (\\d+),(\\d+)$")
    public void пользовательЖелаетПолучитьСписокГосЗакупокВЦеновомДиапозоне(int arg0, int arg1) throws InterruptedException {
        open("https://www.rts-tender.ru/auctionsearch");
        $(byId("dnn_ctr691_View_aSsummFrom")).setValue(String.valueOf(arg0)).pressEnter();
        Thread.sleep(4000);
        $(byId("dnn_ctr691_View_aSsummTo")).setValue(String.valueOf(arg1)).pressEnter();
        Thread.sleep(4000);
        $(byId("dnn_ctr691_View_aSbuttonSearch")).click();
        Thread.sleep(4000);

    }

    @Если("^был получен список доступных тендеров - получить информацию по первому , нажав на номер извещения$")
    public void былПолученСписокДоступныхТендеровПолучитьИнформациюПоПервомуНажавНаНомерИзвещения() throws Throwable {
        String nomer = $(byXpath("//*[@id=\"dnn_ctr691_View_procResultList\"]/tbody/tr[2]/td[3]")).getText();
        $(byId("dnn_ctr691_View_fks" + nomer)).click();
        Thread.sleep(10000);
        System.out.println("AAAA");
        rts.driver.quit();

        throw new PendingException();
    }
}
