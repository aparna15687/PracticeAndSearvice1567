

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String[] args) throws InterruptedException {
	
	;
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://espncricinfo.com/");
		
		driver.manage().window().maximize();
		
		System.out.println("espncricinfoe page opened Successfully");
		//Thread.sleep(1000);
		
		//Clicked on Search icon
		driver.findElement(By.xpath("//div/i[@class='icon-search-outlined ds-text-icon-inverse ci-nav-item ci-nav-hover']")).click();
		//Thread.sleep(2000);
		System.out.println("Clicked on search icon");
		driver.findElement(By.xpath("//div/i[@class='ds-flex ds-items-center ds-rounded-lg ds-border ds-w-full ds-px-4 ds-border-ui-stroke ds-bg-ui-fill")).sendKeys("CPL 2024");
		
		//driver.findElement(By.xpath("//input[@placeholder='Search Players, Teams or Series']")).sendKeys("CPL 2024");
		driver.findElement(By.xpath("//body/div[@id='__next']/section[@id='pane-main']/section[@id='main-container']/div[3]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]")).sendKeys("CPL 2024");
		driver.findElement(By.xpath("//div/i[@class='icon-arrow_forward-filled ds-text-icon-mid ds-block ds-cursor-pointer']")).click();
		
		System.out.println("Search result displayed for CPL 2024");
		
	}

}
