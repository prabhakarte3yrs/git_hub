package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.Base_Test;
import Generic.Gen_Excel;
import POM.Pom1;

public class pLogin extends Base_Test
{
	@Test
	public void Prolgn() throws InterruptedException 
	{
		Pom1 p=new Pom1(driver);
		p.loginp();
		p.undata(Gen_Excel.Excel("Sheet1", 0, 0));
		p.pwdata("12345");
		p.lbtn();
		Assert.fail();
	}
	
	

}
