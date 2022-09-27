package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {

	@FindBy(xpath = "//a [text()=' GEARS ']")
	private WebElement gearsbtn;

	@FindBy(xpath = "(// a [text()=' SkillRary Demo APP'])[2]")
	private WebElement SkillrarydemoApp;

	@FindBy(xpath = "// input [@name='q']")
	private WebElement Searchbox;

	@FindBy(xpath = "// input [@value='go']")
	private WebElement gobtn;

	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void GearsButton() {
		gearsbtn.click();
	}

	public void SkillrarydemoApplication() {
		SkillrarydemoApp.click();
	}

	public void Seachbox(String name) {
		Searchbox.sendKeys(name);
	}

	public void gobutton() {
		gobtn.click();
	}

}
