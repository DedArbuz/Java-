import cucumber.api.PendingException;
import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.Но;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;






public class MyStepdefs{

    @Допустим("^пользователь желает получить список гос закупок в ценовом диапозоне (\\d+),(\\d+)$")
    public void пользовательЖелаетПолучитьСписокГосЗакупокВЦеновомДиапозоне(int arg0, int arg1) throws Throwable {
        throw new PendingException();
    }

    @Если("^если всё сработало корректно и был получен список тендеров - вывести первый$")
    public void еслиВсёСработалоКорректноИБылиПолученСписокТендеровВывестиПервый() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Но("^если не было найдено ни одного - вывести (\\d+)$")
    public void еслиНеБылоНайденоНиОдногоВывести(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Если("^был получен список доступных тендеров - получить информацию по первому , нажав на номер извещения$")
    public void былПолученСписокДоступныхТендеровПолучитьИнформациюПоПервомуНажавНаНомерИзвещения() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
