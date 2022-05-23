import com.thoughtworks.gauge.Step;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class Scroll extends BaseTest {
    public Scroll() {}
        @Step({"Scroll"})

        public void swipeUpI () {
            Dimension dims = appiumDriver.manage().window().getSize();
            System.out.println("Telefon Boyutu " + dims);
            int edgeBorder = 10;
            final int PRESS_TIME = 200;
            PointOption pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);
            System.out.println("pointOptionStart " + pointOptionStart);
            PointOption pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);
            System.out.println("pointOptionEnd " + pointOptionEnd);
            (new TouchAction(appiumDriver))
                    .press(pointOptionStart)
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                    .moveTo(pointOptionEnd).release().perform();
        }
    }
