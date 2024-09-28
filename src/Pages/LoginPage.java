package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage 
{
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;

	@FindBy(name = "username")
	private WebElement usernameTextField;
	
	@FindBy(name = "pwd")
	private WebElement passwordTextField;
	
	@FindBy(name = "remember")
	private WebElement rememberCheckBox;
	
	@FindBy(id = "loginButton")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginPageMethod()
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(usernameTextField));
		usernameTextField.sendKeys("sahoosatya0808@gmail.com");
		
		wait.until(ExpectedConditions.visibilityOf(passwordTextField));
		passwordTextField.sendKeys("12345678");
		
		wait.until(ExpectedConditions.visibilityOf(rememberCheckBox));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", rememberCheckBox);
		
		wait.until(ExpectedConditions.visibilityOf(loginButton));
		js.executeScript("arguments[0].click()", loginButton);
		
	}
}
