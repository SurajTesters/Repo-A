package flipKart_URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFlipkart 
{
public static void main(String[] args) {
	LaunchFlipkart ob = new LaunchFlipkart();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.get("https://pyramidcore.pyramidci.com/security/PCILoginNew.aspx");
}
}
