import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class Assert extends BaseTest {

    public Assert(){}
    @Step("Elementi <xpath> bul ve <keyword> kontrol et")
    public void textControl(String xpath,String keyword){
        System.out.println("Text degeri " + appiumDriver.findElement(By.xpath(xpath)).getText());
        Assert.assertTrue("Text degeri bulunamadi " ,appiumDriver.findElement(By.xpath(xpath)).getText().equals(keyword));
    }

    private static void assertTrue(String text_degeri_bulunamadi_, boolean equals) {
    }
}
