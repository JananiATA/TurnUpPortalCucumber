package Pages;
import Utilities.wait;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class EmployeesPage
    {
        public void CreateEmployee(WebDriver driver)
        {
            //Click on the Create Button

            wait.waittobeclickable(driver, "xpath", "//*[@id=\"container\"]/p/a",5);

            WebElement createButton = driver.findElement(By.xpath("//*[@id=\"container\"]/p/a"));
            createButton.click();

            //Enter Name

            wait.waittobevisible(driver, "id", "Name", 3);

            WebElement nameTextBox = driver.findElement(By.id("Name"));
            nameTextBox.sendKeys("Ajay1");

            //Enter Username

            WebElement userNameTextBox = driver.findElement(By.id("Username"));
            userNameTextBox.sendKeys("Ajaynew123");

            //Click edit contact button

            WebElement editContactButton = driver.findElement(By.id("EditContactButton"));

            editContactButton.click();

            //Thread.sleep(2000);

            driver.switchTo().frame(0);

            // Enter contact details
            //
            // wait.waittobevisible(driver, "Id", "FirstName", 5);

            WebElement firstNameTextBox = driver.findElement(By.id("FirstName"));
            firstNameTextBox.sendKeys("TestContactFirst");

            WebElement lastNameTextBox = driver.findElement(By.id("LastName"));
            lastNameTextBox.sendKeys("TestContactLast");

            WebElement pNTextBox = driver.findElement(By.id("PreferredName"));
            pNTextBox.sendKeys("TestDataPFN");

           WebElement phoneTextBox = driver.findElement(By.id("Phone"));
            phoneTextBox.sendKeys("1234567890");

            WebElement mobileTextBox = driver.findElement(By.id("Mobile"));
            mobileTextBox.sendKeys("456677888");

            WebElement emailTextBox = driver.findElement(By.id("email"));
            emailTextBox.sendKeys("abc@gmail.com");

            WebElement faxTextBox = driver.findElement(By.id("Fax"));
            faxTextBox.sendKeys("1234567");

            WebElement streetTextBox = driver.findElement(By.id("Street"));
            streetTextBox.sendKeys("abc street");

            WebElement cityTestBox = driver.findElement(By.id("City"));
            cityTestBox.sendKeys("Wellington");

            WebElement postcodeTextBox = driver.findElement(By.id("Postcode"));
            postcodeTextBox.sendKeys("5011");

            WebElement countryTextBox = driver.findElement(By.id("Country"));
            countryTextBox.sendKeys("NewZealand");

            WebElement saveContactButton = driver.findElement(By.id("submitButton"));
            saveContactButton.click();

            driver.switchTo().defaultContent();

          
            //Enter Password

            wait.waittobevisible(driver, "id", "Password", 3);

            WebElement passwordTextBox = driver.findElement(By.id("Password"));
            passwordTextBox.sendKeys("Test@1234");

            WebElement retypePWTextBox = driver.findElement(By.id("RetypePassword"));
            retypePWTextBox.sendKeys("Test@1234");

            WebElement isAdminCheckBox = driver.findElement(By.id("IsAdmin"));
            isAdminCheckBox.click();

            //Thread.sleep(3000);

            WebElement selectElement = driver.findElement(By.xpath("//*[@id=\"UserEditForm\"]/div/div[8]/div/div/div[1]/input"));//*[@id="UserEditForm"]/div/div[8]/div/div/div[1]/input
            //IWebElement selectElement = driver.FindElement(By.Id("groupList"));
            selectElement.click();

            /* var selectOption = driver.FindElement(By.XPath("//*[@id=\"UserEditForm\"]/div/div[8]/div/div/div[1]"));
            var select = new SelectElement(selectOption);
            select.SelectByText("sda"); */

           // Thread.sleep(3000);
            wait.waittobevisible(driver, "xpath", "//*[@id=\"groupList_listbox\"]/li[6]", 8);
            WebElement optionDropdown = driver.findElement(By.xpath("//*[@id=\"groupList_listbox\"]/li[6]"));
            optionDropdown.click();

            //Thread.sleep(3000);
            
            

            //Click on Save button

            WebElement saveButton = driver.findElement(By.id("SaveButton"));
            saveButton.click();

            //Thread.sleep(7000);
            

            wait.waittobeclickable(driver, "xpath", "//*[@id=\"container\"]/div/a", 3);


            //Verify if the Employee record is saved successfully

            WebElement backToListLink = driver.findElement(By.xpath("//*[@id=\"container\"]/div/a")); // //*[@id="container"]/div/a
            backToListLink.click();

           // Thread.sleep(2000);

            wait.waittobeclickable(driver, "xpath", "//*[@id=\"usersGrid\"]/div[4]/a[4]/span", 3);
            
            WebElement goToLastPageButton = driver.findElement(By.xpath("//*[@id=\"usersGrid\"]/div[4]/a[4]/span"));////*[@id="usersGrid"]/div[4]/a[4]/span
            goToLastPageButton.click();
            //Thread.sleep(2000);
            wait.waittobevisible(driver, "xpath", "//*[@id=\"usersGrid\"]/div[3]/table/tbody/tr[last()]/td[1]", 3);

            WebElement name = driver.findElement(By.xpath("//*[@id=\"usersGrid\"]/div[3]/table/tbody/tr[last()]/td[1]"));
            //Assert.That(name.getText().equals("Ajay1"), "Employee record not created");
            String Name = name.getText();
            Assert.assertEquals(Name, "Ajay1", "Employee record not Created");


}
        public void EditEmployee(WebDriver driver)
        {
            WebElement lastPageButton = driver.findElement(By.xpath("//*[@id=\"usersGrid\"]/div[4]/a[4]/span"));
            lastPageButton.click();

            WebElement editButton = driver.findElement(By.xpath("//*[@id=\"usersGrid\"]/div[3]/table/tbody/tr[last()]/td[3]/a[1]"));
            editButton.click();

            //Edit Name

            WebElement editNameTextBox = driver.findElement(By.id("Name"));
            editNameTextBox.clear();
            editNameTextBox.sendKeys("AjayNew");


            //Edit User name

            WebElement editUserNameTextBox = driver.findElement(By.id("Username"));
            editUserNameTextBox.clear();
            editUserNameTextBox.sendKeys("Testarjunsar");

            //Click edit contact button

            WebElement editContactButton = driver.findElement(By.id("EditContactButton"));

            editContactButton.click();

            //Thread.Sleep(2000);

            driver.switchTo().frame(0);

            wait.waittobevisible(driver, "id", "FirstName", 5);

            WebElement editFNTextBox = driver.findElement(By.id("FirstName"));
            editFNTextBox.clear();
            editFNTextBox.sendKeys("TestContactFN");

            WebElement editLNTextBox = driver.findElement(By.id("LastName"));
            editLNTextBox.clear();
            editLNTextBox.sendKeys("TestContactLN");

            WebElement pNTextBox1 = driver.findElement(By.id("PreferedName"));
            pNTextBox1.clear();
            pNTextBox1.sendKeys("TeastDataPFNnew");

            WebElement editPhTextBox = driver.findElement(By.id("Phone"));
            editPhTextBox.clear();
            editPhTextBox.sendKeys("6789947890");

            WebElement editMobileTextBox = driver.findElement(By.id("Mobile"));
            editMobileTextBox.clear();
            editMobileTextBox.sendKeys("4566455688");

            WebElement editEmailTextBox = driver.findElement(By.id("email"));
            editEmailTextBox.clear();
            editEmailTextBox.sendKeys("abc@gmail.com");

            WebElement editFaxTextBox = driver.findElement(By.id("Fax"));
            editFaxTextBox.clear();
            editFaxTextBox.sendKeys("1234567");

            WebElement editStreetTextBox = driver.findElement(By.id("Street"));
            editStreetTextBox.clear();
            editStreetTextBox.sendKeys("abc street");

            WebElement editCityTestBox = driver.findElement(By.id("City"));
            editCityTestBox.clear();
            editCityTestBox.sendKeys("Wellington");

            WebElement editPostcodeTextBox = driver.findElement(By.id("Postcode"));
            editPostcodeTextBox.clear();
            editPostcodeTextBox.sendKeys("5011");

            WebElement editCountryTextBox = driver.findElement(By.id("Country"));
            editCountryTextBox.clear();
            editCountryTextBox.sendKeys("NewZealand");




            WebElement saveContactButton1 = driver.findElement(By.id("submitButton"));
            saveContactButton1.click();

            driver.switchTo().defaultContent();

            wait.waittobevisible(driver, "id", "Password", 3);

            WebElement editPWTextBox = driver.findElement(By.id("Password"));
            editPWTextBox.clear();
            editPWTextBox.sendKeys("Data@123");

            WebElement editRTPWTextBox = driver.findElement(By.id("RetypePassword"));
            editRTPWTextBox.clear();
            editRTPWTextBox.sendKeys("Data@123");

            WebElement selectElement = driver.findElement(By.xpath("//*[@id=\"UserEditForm\"]/div/div[8]/div/div/div[1]/input"));
            selectElement.click();
            
            //selectElement.Clear();
            //Thread.Sleep(3000);
            //selectElement.Click();

            //Thread.Sleep(3000);
            wait.waittobevisible(driver, "xpath", "//*[@id=\"groupList_listbox\"]/li[2]", 5);
            WebElement optionDropdown = driver.findElement(By.xpath("//*[@id=\"groupList_listbox\"]/li[2]"));
            optionDropdown.click();

            //Thread.Sleep(3000);


            //Click on Save button

            WebElement saveButton1 = driver.findElement(By.id("SaveButton"));
            saveButton1.click();



            //Thread.Sleep(7000);


            wait.waittobeclickable(driver, "xpath", "//*[@id=\"container\"]/div/a", 3);

            WebElement backToListLink1 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/a")); // //*[@id="container"]/div/a
            backToListLink1.click();

            //Thread.Sleep(2000);

            wait.waittobeclickable(driver, "xpath", "//*[@id=\"usersGrid\"]/div[4]/a[4]/span", 3);

            WebElement goToLastPageButtonEd = driver.findElement(By.xpath("//*[@id=\"usersGrid\"]/div[4]/a[4]/span"));////*[@id="usersGrid"]/div[4]/a[4]/span
            goToLastPageButtonEd.click();
           // Thread.Sleep(2000);
            wait.waittobevisible(driver, "xpath", "//*[@id=\"usersGrid\"]/div[3]/table/tbody/tr[last()]/td[1]", 3);

            WebElement name = driver.findElement(By.xpath("//*[@id=\"usersGrid\"]/div[3]/table/tbody/tr[last()]/td[1]"));
            //Assert.That(name.Text == "AjayNew", "Employee record not edited");
            String newName = name.getText();
            Assert.assertEquals(newName,"AjayNew", "Employee record not Edited");


        }

        public void DeleteEmployee(WebDriver driver)
        {
            WebElement lPButton = driver.findElement(By.xpath("//*[@id=\"usersGrid\"]/div[4]/a[4]/span")); ////*[@id="usersGrid"]/div[4]/a[4]/span
            lPButton.click();

            //Thread.Sleep(3000);

            wait.waittobeclickable(driver, "xpath", "//*[@id=\"usersGrid\"]/div[3]/table/tbody/tr[last()]/td[3]/a[2]", 5);

            WebElement  deleteButton = driver.findElement(By.xpath("//*[@id=\"usersGrid\"]/div[3]/table/tbody/tr[last()]/td[3]/a[2]")); ////*[@id="usersGrid"]/div[3]/table/tbody/tr[3]/td[3]/a[2]
            deleteButton.click();

            //Thread.Sleep(3000);

            driver.switchTo().alert().accept();

            wait.waittobevisible(driver, "xpath", "//*[@id=\"usersGrid\"]/div[3]/table/tbody/tr[last()]/td[1]", 5);

            //Thread.Sleep(4000);
            WebElement deletedName = driver.findElement(By.xpath("//*[@id=\"usersGrid\"]/div[3]/table/tbody/tr[last()]/td[1]"));////*[@id="usersGrid"]/div[3]/table/tbody/tr[3]/td[1]
            //Assert.That(deletedName.Text != "AjayNew", "Employee record not deleted");
            String Name = deletedName.getText();
            Assert.assertNotEquals(Name,"AjayNew", "Employee record not deleted");


        }
    }

