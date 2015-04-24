import org.junit.Test;
import org.openqa.selenium.By;


    public class Test2 extends ConfigurationManager {


        @Test
        public void testUntitled() throws Exception {

            driver.get(baseUrl + "");
            driver.findElement(By.id("mailbox__login")).clear();
            driver.findElement(By.id("mailbox__login")).sendKeys("dksjvkdssd");
            driver.findElement(By.id("mailbox__password")).clear();
            driver.findElement(By.id("mailbox__password")).sendKeys("12345");
            // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=srvt=1429552562105 | ]]
            driver.findElement(By.id("mailbox__auth__button")).click();

        }
    }

