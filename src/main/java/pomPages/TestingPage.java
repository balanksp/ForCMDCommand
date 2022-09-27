package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage
{

	@FindBy(xpath="//img[@id='Selenium Training']")
	private WebElement dragtheimage;
	
	
	@FindBy(xpath="//div[@id='cartArea']")
	private WebElement droptoMycart;
	
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebookicon;
	
	
	
	public TestingPage (WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
		
	
	
	public WebElement getDragtheimage() 
	{
		return dragtheimage;
	}

	public WebElement getDroptoMycart()
	{
		return droptoMycart;
	}

	public WebElement getFacebookicon() 
	{
		return facebookicon;
	}

	public void facebookicons()
	{
		facebookicon.click();
	}
	
	
}
