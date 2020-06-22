package pucrs.qp.t3;

import static org.junit.Assert.*;


import org.junit.Test;
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

public class OnlineCalc {

	private static WebDriver driver;
	 
    @BeforeClass
    public static void setUpTest(){
        driver = new ChromeDriver();
        driver.get("https://www.calculadora-online.xyz/");
    }
 
    @AfterClass
    public static void tearDownTest(){
        driver.quit();
    }
    
    @Test
    public void testSoma() throws InterruptedException {
    driver.findElement(By.id("C")).click();	
    Thread.sleep(2000);  	
    driver.findElement(By.id("quatre")).click();	
    driver.findElement(By.id("cinq")).click();
    driver.findElement(By.id("addition")).click();
    Thread.sleep(500);
    driver.findElement(By.id("trois")).click();	
    driver.findElement(By.id("deux")).click();
    driver.findElement(By.id("egale")).click();
    Thread.sleep(500);
    assertEquals("77", driver.findElement(By.id("total")).getText().toString());
    }
    
    @Test
    public void testDiv() throws InterruptedException {
    driver.findElement(By.id("C")).click();
    Thread.sleep(2000);  	
    driver.findElement(By.id("quatre")).click();	
    driver.findElement(By.id("quatre")).click();
    driver.findElement(By.id("diviser")).click();
    Thread.sleep(500);
    driver.findElement(By.id("deux")).click();	
    driver.findElement(By.id("egale")).click();
    Thread.sleep(500);
    assertEquals("22", driver.findElement(By.id("total")).getText().toString());
    }
    
    @Test
    public void testMult() throws InterruptedException {
    driver.findElement(By.id("C")).click();
    Thread.sleep(2000);  	
    driver.findElement(By.id("huit")).click();	
    driver.findElement(By.id("quatre")).click();
    driver.findElement(By.id("multiplier")).click();
    Thread.sleep(500);
    driver.findElement(By.id("deux")).click();	
    driver.findElement(By.id("egale")).click();
    Thread.sleep(500);
    assertEquals("168", driver.findElement(By.id("total")).getText().toString());
    }
    
    @Test
    public void testMin() throws InterruptedException {
    driver.findElement(By.id("C")).click();
    Thread.sleep(2000);  	
    driver.findElement(By.id("zero")).click();	
    driver.findElement(By.id("moins")).click();
    Thread.sleep(500);
    driver.findElement(By.id("trois")).click();	
    driver.findElement(By.id("egale")).click();
    Thread.sleep(500);
    assertEquals("-3", driver.findElement(By.id("total")).getText().toString());
    }

}
