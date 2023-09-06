
package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage
    {
        public void LoginActions(WebDriver driver)
        {
            driver.manage().window().maximize();

            //launch the TurnUp portal and navigate to login

            driver.navigate().to("http://horse.industryconnect.io/Account/Login?ReturnUrl=%2f");

            //Identify username TextBox and enter valid username

                WebElement userNameTextBox = driver.findElement(By.id("UserName"));
                userNameTextBox.sendKeys("hari");




            //Identify password TextBox and enter valid password
            WebElement passwordTextBox = driver.findElement(By.id("Password"));
            passwordTextBox.sendKeys("123123");

            //Click on the login button

            WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/form/div[3]/input[1]"));
            loginButton.click();
        }
    }

