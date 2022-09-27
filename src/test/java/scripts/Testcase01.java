package scripts;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.SkillraryLoginPage;
import pomPages.SkillrarydemoLoginPage;

public class Testcase01 extends BaseClass
{
	@Test
   public void Tc1 ()
   {
		
	   SkillraryLoginPage s = new SkillraryLoginPage(driver);
	   s.GearsButton();
	   s.SkillrarydemoApplication();
	   
	   SkillrarydemoLoginPage s1 = new SkillrarydemoLoginPage(driver);
	   driverutilities.switchTabs(driver);
	   driverutilities.mouseHover(driver ,s1.getCoursebtn() );
	   s1.selenuimtraintab();	
	    
	   AddtoCartPage ac = new AddtoCartPage(driver);
	   driverutilities.doubleclick(driver, ac.getAddBtn());
	   ac.AddtoCartbutton();
	   driverutilities.AlertPopups(driver);
	   
   }
}
