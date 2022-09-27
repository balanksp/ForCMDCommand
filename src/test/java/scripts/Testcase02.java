package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import pomPages.SkillraryLoginPage;
import pomPages.SkillrarydemoLoginPage;
import pomPages.TestingPage;

public class Testcase02 extends BaseClass {
	@Test
	public void Tc02() throws IOException {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.GearsButton();
		s.SkillrarydemoApplication();

		SkillrarydemoLoginPage sk = new SkillrarydemoLoginPage(driver);
		driverutilities.switchTabs(driver);
		driverutilities.DropDown(sk.getDropdownbox(), pdata.getPropertyfile("coursedropdown"));

		TestingPage tp = new TestingPage(driver);
		driverutilities.DragandDrop(driver, tp.getDragtheimage(), tp.getDroptoMycart());
		Point loc = tp.getFacebookicon().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		driverutilities.ScrollBar(driver, x, y);
		tp.facebookicons();

	}

}
