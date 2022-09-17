package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class T4_config_practice {
    /*
    C #4: Google search
1- Open a chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Verify title:
Expected: apple - Google Search
Use `configuration.properties` for the following:
1. The browser type
2. The URL
3. The search keyword
4. Make title verification dynamic. If search value changes, title
assertion should not fail.
 */

   /* WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       ;
    }

    */

    @Test
    public void method(){
        Driver.getDriver().get("https://google.com");
        String browserType = ConfigurationReader.getProperty("browser");
        
        WebElement cookies = Driver.getDriver().findElement(By.xpath("//div[@class='QS5gu sy4vM']"));
        cookies.click();
        WebElement googleSearch = Driver.getDriver().findElement(By.xpath("//input[@class='gLFyf gsfi']"));

        googleSearch.sendKeys(ConfigurationReader.getProperty("searchKey") + Keys.ENTER );

        Assert.assertEquals(Driver.getDriver().getTitle(),"apple - Google Search");


    }

    @AfterMethod
    public void tearDownMethod(){
        Driver.getDriver().close();
    }












}
