import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class Login extends BaseTest {
    public Login(){}
    @Step({"<xpath> bul ve <keyword> degerini kontrol et"})
    public void textControl(String xpath, String keyword) {
        logger.info("Login Id checked");
    }

    @Step({"<Key> yerine <keywordc> degerini yaz"})
    public void SendKeyElementByXpath(String Key, String keywordc) {
        ((MobileElement)appiumDriver.findElement(By.xpath(Key))).sendKeys(new CharSequence[]{keywordc});
        System.out.println(Key + "Elementine tiklandi");
    }
}
