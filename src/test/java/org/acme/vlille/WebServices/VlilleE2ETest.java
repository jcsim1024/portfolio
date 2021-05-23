package org.acme.vlille.WebServices;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class VlilleE2ETest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  public void setUp() throws MalformedURLException {
    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  public void tearDown() {
    driver.quit();
  }
  
  public void vlilleE2E() {
    driver.get("http://localhost:8081/");
    driver.manage().window().setSize(new Dimension(742, 789));
    driver.findElement(By.id("exampleInputEmail1")).click();
    driver.findElement(By.id("exampleInputEmail1")).sendKeys("RUE ROYALE");
    driver.findElement(By.cssSelector(".ng-binding:nth-child(3)")).click();
  }
}
