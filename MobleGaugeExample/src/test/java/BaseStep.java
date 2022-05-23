import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class BaseStep extends BaseTest{

    @Step("<second> kadar bekle")
    public void waitForsecond(int second) throws InterruptedException {
        Thread.sleep(1000*second);
    }
    @Step("<Key> Id'li elemente tikla")
    public void clickElementByid(String Key){
        appiumDriver.findElement(By.id(Key)).click();
        System.out.println(Key+"Elementine tiklandi");
    }
    @Step("<Key> Id'li elemente <keywordc> degerini yaz")
    public void SendkeyElementByid(String Key,String keywordc){
        appiumDriver.findElement(By.id(Key)).sendKeys(keywordc);
        System.out.println(Key+"Elementine tiklandi");

    }
    @Step("<Key> xpath'li elemente tikla")
    public void clickElementByxpath(String Key){
        appiumDriver.findElement(By.xpath(Key)).click();
        System.out.println(Key+"Elementine tiklandi");
    }
    @Step("<Key> xpath'li elemente <keywordc> değerini yaz")
    public void SendkeyElementByxpath(String Key,String keywordc){
        appiumDriver.findElement(By.xpath(Key)).sendKeys(keywordc);
        System.out.println(Key+"Elementine tiklandi");

    }

    @Step("Sayfayi yukari kaydir")
    public void swipeUpI(){
        Dimension dims = appiumDriver.manage().window().getSize();
        System.out.println("Telefon Boyutu "+dims);
        PointOption pointOptionStart, pointOptionEnd;
        int edgeBorder = 10;
        final int PRESS_TIME = 200; // ms
        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);
        System.out.println("pointOptionStart " + pointOptionStart);
        pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);
        System.out.println("pointOptionEnd " + pointOptionEnd);
        new TouchAction(appiumDriver)
                .press(pointOptionStart)
                // a bit more reliable when we add small wait
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                .moveTo(pointOptionEnd)
                .release().perform();
    }
@Step("Elementi <xpath> bul ve <keyword> degerini kontrol et")
    public void textControl(String xpath,String keyword){
        System.out.println("Text degeri " + appiumDriver.findElement(By.xpath(xpath)).getText());
        Assert.assertTrue("Text degeri bulunamadi ",appiumDriver.findElement(By.xpath(xpath)).getText().equals(keyword));
    }
    @Step("Rastgele urun ekleme")
        public void randomSelect() {
            List<MobileElement> elements = appiumDriver.findElements(By.xpath("//*[@resource-id='com.ozdilek.ozdilekteyim:id/imageView']"));
            Random rnd = new Random();
            int rndInt = rnd.nextInt(elements.size());
            elements.get(rndInt).click();
        }
    }

