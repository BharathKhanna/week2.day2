package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.xpath("(//div[@class='x-form-element'])[19]/input")).sendKeys("Bharath");
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
//click on first resulting lead
driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
//verify the title of the page
String title = driver.getTitle();
System.out.println(title);
//click edit
driver.findElement(By.xpath("//a[text()='Edit']")).click();
//change the company name
driver.findElement(By.id("updateLeadForm_companyName")).clear();
driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Wipro");
//click update
driver.findElement(By.name("submitButton")).click();


	}

}
