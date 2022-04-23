package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {

    private WebDriver driver;

    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //Thread.sleep(5000);

        // maximize the window
        driver.manage().window().maximize();
        // get page title
        System.out.println(driver.getTitle());
        // To make the page wait until the URL fully loads so as to avoid our test from Failing, add a global wait time.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("email")).sendKeys("08180168064");
        driver.findElement(By.id("pass")).sendKeys("bowale99");
        driver.findElement(By.name("login")).click();
        driver.quit();
    }
    public static void main(String args[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();
    }



}



