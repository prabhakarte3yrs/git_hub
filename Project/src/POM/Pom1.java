package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic.Base_Page;

public class Pom1 extends Base_Page {
	@FindBy(xpath="//a[@href='http://106.51.87.42:9003/login']")
	private WebElement lgnpg;
	@FindBy(id="email")
	private WebElement untf;
	@FindBy(id="password")
	private WebElement pwtf;
	@FindBy(id="loginBtn")
	private WebElement lgnbtn;
	
	public Pom1(WebDriver driver)
	{
		super(driver);
	}
	public void loginp()
	{
		lgnpg.click();
	}
	public void undata(String un)
	{
		untf.sendKeys(un);
	}
	public void pwdata(String pw)
	{
		pwtf.sendKeys(pw);
	}
	public void lbtn()
	{
		lgnbtn.click();
	}
}
