package ohtu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import java.util.Random;

public class Tester {

    public static void main(String[] args) {

        WebDriver driver = new HtmlUnitDriver();

        System.out.println(driver.getPageSource());

        driver.get("http://localhost:4567");
        
        sleep(2);
        
        WebElement element = driver.findElement(By.linkText("login"));
        element.click();

        System.out.println(driver.getPageSource());

       sleep(2);
        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
       element.sendKeys("akkepa");
        element = driver.findElement(By.name("login"));
        
       // 1. väärä salasana
       //WebElement element = driver.findElement(By.linkText("login"));
       // element.click();
       // System.out.println(driver.getPageSource());
       //sleep(2);
       // element = driver.findElement(By.name("username"));
       // element.sendKeys("pekka");
       // element = driver.findElement(By.name("password"));
       // element.sendKeys("akkepa");
       // element = driver.findElement(By.name("login"));

       // 2. uusi käyttäjätunnus
	   //WebElement element = driver.findElement(By.linkText("register new user"));
       //  element.click();
       //System.out.println(driver.getPageSource());
	    //Random r = new Random();
        //element = driver.findElement(By.name("username"));
       // element.sendKeys("pekka"+r.nextInt(100000));
       // element = driver.findElement(By.name("password"));
       // element.sendKeys("akkepa");
	   //element = driver.findElement(By.name("passwordConfirmation"));
        //element.sendKeys("akkepa");
       // element = driver.findElement(By.name("signup"));
	   //element.click();
	   //System.out.println(driver.getPageSource());

	// 3. Kirjautuminen ulos rekisteröinnin jälkeen
    //   WebElement element = driver.findElement(By.linkText("register new user"));
    //     element.click();
    //   System.out.println(driver.getPageSource());
    //    Random r = new Random();
    //    element = driver.findElement(By.name("username"));
    //    element.sendKeys("pekka"+r.nextInt(100000));
    //    element = driver.findElement(By.name("password"));
    //    element.sendKeys("akkepa");
    //    element = driver.findElement(By.name("passwordConfirmation"));
    //    element.sendKeys("akkepa");
    //    element = driver.findElement(By.name("signup"));
    //    element.click();
    //    System.out.println(driver.getPageSource());
    //	element = driver.findElement(By.linkText("continue to application mainpage"));
    //	element.click();
    //	System.out.println(driver.getPageSource());
    //	element = driver.findElement(By.linkText("logout"));
    //	element.click();
    //	System.out.println(driver.getPageSource());

        sleep(2);
   element.submit();

        sleep(3);
        
        driver.quit();
    }
    
    private static void sleep(int n){
        try{
            Thread.sleep(n*1000);
        } catch(Exception e){}
    }
}
