package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author admin
 *
 */
public class SkillrarydemoLoginPage
{
	@FindBy(xpath="//a[@id='course']") // mouse hover 
     private WebElement coursebtn;
	
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement selenuimtrainlink ;
	
	

	@FindBy(xpath="//select[@class='chosen-select']")
	private WebElement dropdownbox;
	
	
	
	public SkillrarydemoLoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

	public WebElement getCoursebtn() // mouse hover 
	{
		return coursebtn;
	}
	
	public void selenuimtraintab()
	{
		selenuimtrainlink.click();
	}

	public WebElement getDropdownbox() 
	{
		return dropdownbox;
	}
	
	
}
