package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
	ChromeDriver driver=new ChromeDriver(options);
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
    driver.findElement(By.partialLinkText("CRM")).click();
    driver.findElement(By.linkText("Accounts")).click();
    driver.findElement(By.linkText("Create Account")).click();
    driver.findElement(By.id("accountName")).sendKeys("DEVISAI");
    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
    driver.findElement(By.name("numberEmployees")).sendKeys("10");
    driver.findElement(By.className("smallSubmit")).click();
    String Title=driver.getTitle();
    System.out.println(Title);
	}

}
