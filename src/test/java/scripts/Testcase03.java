package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import pomPages.AddToWishList;
import pomPages.CoreJavaPage;
import pomPages.SkillraryLoginPage;

public class Testcase03 extends BaseClass
{
	@Test
	public void tc03 () throws IOException, InterruptedException
	{
		SkillraryLoginPage sk = new SkillraryLoginPage(driver);
		sk.Seachbox(pdata.getPropertyfile("coursename"));
		sk.gobutton();

		CoreJavaPage cj = new CoreJavaPage (driver);
		cj.corejavapage();
		
		AddToWishList atwl = new AddToWishList(driver);
		atwl.cookiesclosing();
		driverutilities.SwitchtoFrame(driver);
		atwl.playbutton();
		Thread.sleep(8000);
		atwl.pausebutton();
		driverutilities.Switchback(driver);
		atwl.addtowishlist();
		
		
	
		
	}
	
	
	
	
}
