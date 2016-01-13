import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class SampleSauceTest {

  public static final String USERNAME = "edur_boyinipalli";
  public static final String ACCESS_KEY = "8b1d219e-1023-42df-8b8c-3a6c99013d0b";
  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

  public static void main(String[] args) throws Exception {

    DesiredCapabilities caps = DesiredCapabilities.chrome();
    caps.setCapability("platform", "Windows XP");
    caps.setCapability("version", "43.0");

    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

    /**
    * Goes to Sauce Lab's guinea-pig page and prints title
    */

    driver.get("https://elements.perkinelmer.com/");
    System.out.println("title of page is: " + driver.getTitle());

    driver.quit();
    
    
  }
}