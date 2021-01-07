package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

//import org.junit.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void Test1()
    {
        System.out.println( "Welcome to Selenium Test  with ChromeDriver!" );

        System.setProperty("webdriver.chrome.driver","/Users/kehindetomiwa/Webdriver/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://localhost:3001/");

        driver.findElement(By.name("login")).sendKeys("devops");
        driver.findElement(By.name("password")).sendKeys("test");
        driver.findElement(By.name("click")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        String test = driver.findElement(By.name("test")).getText();
        assertEquals(test,"Login Succeeded");
        System.out.println("Test Succeded" );
        driver.quit();
    }
}
