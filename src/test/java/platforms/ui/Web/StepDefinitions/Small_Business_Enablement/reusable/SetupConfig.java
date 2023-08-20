package platforms.ui.Web.StepDefinitions.Small_Business_Enablement.reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class SetupConfig {

    static Properties properties = new Properties();
    static InputStream inputStream = null;
    public static WebDriver driver = null;
    public static String url;
    public String username;
    public String password;
    public static String scrollView = "arguments[0].scrollIntoView();";

    public SetupConfig(){

        try {

            inputStream = new FileInputStream("src\\test\\Resources\\SBE-config\\Small_Business_Enablement\\SBE.properties");
            properties.load(inputStream);

            this.url = properties.getProperty("url");
            this.username = properties.getProperty("username");
            this.password = properties.getProperty("password");

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    public static void driverInitializer(){

        System.setProperty("webdriver.chrome.driver","eqa_money_app_web\\Drivers\\Windows\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static void closeDriver(){

        driver.quit();
    }


}
