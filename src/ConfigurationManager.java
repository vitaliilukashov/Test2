import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

/**
 * Created by PC on 24.04.2015.
 */
public class ConfigurationManager{

     protected WebDriver driver;
        protected String baseUrl;
        private StringBuffer verificationErrors = new StringBuffer();

        @Before
        public void start() {
            driver = new FirefoxDriver();
            baseUrl = "https://mail.ru/";
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        @Test
        public void testUntitled() throws Exception {


            driver.get(baseUrl + "/");
            driver.findElement(By.id("mailbox__login")).clear();
            driver.findElement(By.id("mailbox__login")).sendKeys("dksjvkdssd");
            driver.findElement(By.id("mailbox__password")).clear();
            driver.findElement(By.id("mailbox__password")).sendKeys("12345");
            // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=srvt=1429552562105 | ]]
            driver.findElement(By.id("mailbox__auth__button")).click();
        }

        @After
        public void tearDown() throws Exception {
            driver.quit();
            String verificationErrorString = verificationErrors.toString();
            if (!"".equals(verificationErrorString)) {
                fail(verificationErrorString);
            }
        }


    }