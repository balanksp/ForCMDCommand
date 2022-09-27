package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToWishList 
{

	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playbtn;
		
	@FindBy(xpath="//div[@class='pause-icon']")   
	private WebElement pausebtn;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")  
	private WebElement AddTowishlist;
	
	@FindBy(xpath="//a [@class='close_cookies']")
	private WebElement cookiesclose;
	
	public AddToWishList (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void playbutton ()
	{
		playbtn.click();
	}
	
	public void pausebutton ()
	{
		pausebtn.click();
	}
	
	public void addtowishlist ()
	{
		AddTowishlist.click();
	}
	
	public void cookiesclosing ()
	{
		cookiesclose.click();
	}
	
	
	
	
	
	
	
}
