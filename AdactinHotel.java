package org.adactin.task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotel {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		WebElement usrName = driver.findElement(By.name("username"));
		usrName.sendKeys("Sasikala27");
		WebElement pswd = driver.findElement(By.name("password"));
		pswd.sendKeys("test@123", Keys.ENTER);

		WebElement location = driver.findElement(By.name("location"));
		
		Select s = new Select(location);
		s.selectByIndex(2);
		
		WebElement hotel = driver.findElement(By.name("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByValue("Hotel Creek");
		
		WebElement srchBtn = driver.findElement(By.name("Submit"));
		srchBtn.click();
		
		WebElement rdbtn = driver.findElement(By.name("radiobutton_1"));
		rdbtn.click();
		WebElement ctubtn = driver.findElement(By.name("continue"));
		ctubtn.click();
		
		WebElement frstName = driver.findElement(By.name("first_name"));
		frstName.sendKeys("Sasikala");
		
		WebElement lstName = driver.findElement(By.name("last_name"));
		lstName.sendKeys("Arul");
		
		WebElement billAddress = driver.findElement(By.name("address"));
		billAddress.sendKeys("No.123, XXX Street");
		
		WebElement cardNo = driver.findElement(By.name("cc_num"));
		cardNo.sendKeys("4567890123567890");
		
		WebElement cardType = driver.findElement(By.name("cc_type"));
		
		Select s3 = new Select(cardType);
		s3.selectByValue("VISA");
		
		WebElement expMonth = driver.findElement(By.name("cc_exp_month"));
		
		Select s4 = new Select(expMonth);
		s4.selectByIndex(7);
		
		WebElement expYear = driver.findElement(By.name("cc_exp_year"));
		
		Select s5 = new Select(expYear);
		s5.selectByValue("2022");
		
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		cvv.sendKeys("123");
		
		WebElement bookNow = driver.findElement(By.name("book_now"));
		bookNow.click();
		Thread.sleep(8000);
		WebElement orderNo = driver.findElement(By.name("order_no"));
		String o = orderNo.getAttribute("value");
		System.out.println(o);
		
		

	}
	}

