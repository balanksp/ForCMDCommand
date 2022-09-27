package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage 
{
     @FindBy (id="add")      // double click 
     private WebElement AddBtn; 
     
     @FindBy (xpath="// button[text()=' Add to Cart']") 
     private WebElement AddtoCartBtn;
     
     public AddtoCartPage (WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
    	 
     }
     

     
     public WebElement getAddBtn() {
		return AddBtn;
	}

	public void AddtoCartbutton ()
     {
		AddtoCartBtn.click();
     }
}
