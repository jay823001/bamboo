
import static org.junit.Assert.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo {
    //	 private WebDriver driver;
//	private AndriodDriver driver ;
    @Test
    //public void test (){



    public void test() throws MalformedURLException {
//		private WebDriver driver;
        File appDir = new File("src");
        File app = new File(appDir,"BookMyShow–Movie Tickets,Plays_4.2.3_apk-dl.com.apk");
        DesiredCapabilities cap = new DesiredCapabilities ();
        //cap.setCapability(MobilePlatform.PLATFORM_NAME,MobilePlatform.ANDRIOD);
        cap.setCapability("platformName", "ANDRIOD");
        cap.setCapability("deviceName","Andriod Emulator");
        //    cap.setCapability(capabilityName, value);
        //    driver = new RemoteWebDriver( new URL( "http://127.0.0.1:4723/wd/hub" ), cap );
        cap.setCapability("app", app.getAbsolutePath());
        //   AndriodDriver driver = new AndriodDriver ( new URL( "http://127.0.0.1:4723/wd/hub" ), cap );
        System.out.println("Jay");
    }
}
