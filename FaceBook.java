package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
//Add implicit wait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//Click on Create New Account button
driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]")).click();
//Enter the first name
driver.findElement(By.name("firstname")).sendKeys("Samanyu");
//Enter the last name
driver.findElement(By.name("lastname")).sendKeys("Reddy");
//Enter the mobile number
driver.findElement(By.name("reg_email__")).sendKeys("samred@gmail.com");
//Enter the password
driver.findElement(By.id("password_step_input")).sendKeys("test");
//Handle all the three drop downs
//For date
WebElement day = driver.findElement(By.id("day"));
Select select = new Select(day);
select.selectByVisibleText("30");
//For month
WebElement month = driver.findElement(By.id("month"));
Select select1 = new Select(month);
select1.selectByVisibleText("Apr");
//For year
WebElement birthday_year = driver.findElement(By.name("birthday_year"));
Select select2 = new Select(birthday_year);
select2.selectByVisibleText("2000");
//Select the radio button "Female"
driver.findElement(By.xpath("//input[@value='1']")).click();

	}

}
