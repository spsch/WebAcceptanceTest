import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Helper;

import java.util.concurrent.TimeUnit;

/**
 * Created by svehlak on 17.3.16.
 */
public class SelectItemsTest implements Helper{

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(URL);
        driver.findElement(By.id("inputAcceptCookies")).click();
        driver.findElement(By.xpath("/html/body/form/div[5]/div/div/div/button")).click();
    }

    @Test(description = "HUJAJA")
    public void testSelectThreeStripe() {
        WebElement Hoodie = driver.findElement(By.xpath("/html/body/form/div[9]/div[3]/div/div/div/div[2]/section/div[6]/div/div/div[2]/div/div/div/div/div[4]/div/div/div/div[3]/div/ul/li[1]/div/div[1]/a[2]/div/img"));
        Hoodie.click();
        WebElement HoodieName = driver.findElement(By.xpath("/html/body/form/div[9]/div[3]/div/div/div/div[2]/section/div[6]/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[3]/div[1]/div/div[2]/div[1]/div/div/span/h2"));
        String HoodieText = HoodieName.getText();
        Assert.assertEquals(HoodieText, HOODIE);

        Select SizeHoodie = new Select(driver.findElement(By.id("dnn_ctr103511_ViewTemplate_ctl00_ctl08_sizeDdl")));
        SizeHoodie.selectByVisibleText("Medium");
    }


}
