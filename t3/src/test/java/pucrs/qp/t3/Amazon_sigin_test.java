package pucrs.qp.t3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_sigin_test {

    private static WebDriver driver;
 
    @BeforeClass
    public static void setUpTest(){
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&prevRID=4JM2V8N9HHTJ8682GGS5&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
    }
 
    @AfterClass
    public static void tearDownTest(){
        driver.quit();
    }
    
    @Test
    public void testTitle() {
    assertEquals("Authentication required", driver.getTitle());
    }

    @Test
    public void testSigIn() {
    driver.findElement(By.id("ap_customer_name")).sendKeys("Qualidade de produto");	
    driver.findElement(By.id("ap_email")).sendKeys("user@email.com.br");
    driver.findElement(By.id("ap_password")).sendKeys("Wejasuidhqs7884");
    driver.findElement(By.id("ap_password_check")).sendKeys("Wejasuidhqs7884");
    driver.findElement(By.id("a-autoid-0")).click();
    }
	
}
