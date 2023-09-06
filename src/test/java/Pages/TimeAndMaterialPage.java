package Pages;

import Utilities.wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TimeAndMaterialPage
    {
        public void CreateTimeRecord(WebDriver driver)
        {
            //Click on the Create new button

            WebElement createNewButton = driver.findElement(By.xpath("//*[@id=\"container\"]/p/a")); ////*[@id="container"]/p/a
            createNewButton.click();

            wait.waittobeclickable(driver,"xpath", "//*[@id=\"TimeMaterialEditForm\"]/div/div[1]/div/span[1]/span/span[2]/span", 5);

            //Select the TypeCode

            WebElement typeCodeDropdown = driver.findElement(By.xpath("//*[@id=\"TimeMaterialEditForm\"]/div/div[1]/div/span[1]/span/span[2]/span"));
            typeCodeDropdown.click();

            wait.waittobeclickable(driver, "xpath", "//*[@id=\"TypeCode_listbox\"]/li[2]", 3);

            WebElement timeTypeCode = driver.findElement(By.xpath("//*[@id=\"TypeCode_listbox\"]/li[2]"));
            //Thread.Sleep(1000);
            timeTypeCode.click();

            //Enter the code

            WebElement codeTextBox = driver.findElement(By.id("Code"));
            codeTextBox.sendKeys("345");

            //Enter the description

            WebElement descTextBox = driver.findElement(By.id("Description"));
            descTextBox.sendKeys("Testdata");

            //Enter the price
            WebElement priceTextBox = driver.findElement(By.xpath("//*[@id=\"TimeMaterialEditForm\"]/div/div[4]/div/span[1]/span/input[1]"));
            priceTextBox.sendKeys("20");

            //Click on the save button
            WebElement saveButton = driver.findElement(By.id("SaveButton"));
            saveButton.click();

            //Thread.sleep(3000);

            //Check if new record has been created successfully
            wait.waittobeclickable(driver,"xpath","//*[@id=\"tmsGrid\"]/div[4]/a[4]/span" ,5);

            WebElement goToLastPageButton = driver.findElement(By.xpath("//*[@id=\"tmsGrid\"]/div[4]/a[4]/span")); ////*[@id="tmsGrid"]/div[4]/a[4]/span
            goToLastPageButton.click();

            wait.waittobevisible(driver, "xpath", "//*[@id=\"tmsGrid\"]/div[3]/table/tbody/tr[last()]/td[1]", 5);

            //WebElement newCode = driver.findElement(By.xpath("//*[@id=\"tmsGrid\"]/div[3]/table/tbody/tr[last()]/td[1]"));
            //String Code = newCode.getText();

            //Assert.assertEquals(Code,"123","New Record not Created ");

        } 
        public String GetCode(WebDriver driver)
        {
            WebElement newCode = driver.findElement(By.xpath("//*[@id=\"tmsGrid\"]/div[3]/table/tbody/tr[last()]/td[1]"));//"//*[@id=\"tmsGrid\"]/div[3]/table/tbody/tr[last()]/td[1]"));
            String Code = newCode.getText();
            return Code;
        }
        public void EditTimeRecord(WebDriver driver, String description)
        {
            //Editing new record

            WebElement goToLastPageButton = driver.findElement(By.xpath("//*[@id=\"tmsGrid\"]/div[4]/a[4]/span"));
            goToLastPageButton.click();

            wait.waittobeclickable(driver, "xpath", "//*[@id=\"tmsGrid\"]/div[3]/table/tbody/tr[last()]/td[5]/a[1]", 3);

            WebElement editButton = driver.findElement(By.xpath("//*[@id=\"tmsGrid\"]/div[3]/table/tbody/tr[last()]/td[5]/a[1]"));
            //Thread.Sleep(1000);
            editButton.click();

            //Thread.sleep(3000);
            wait.waittobeclickable(driver,"xpath","//*[@id=\"TimeMaterialEditForm\"]/div/div[1]/div/span[1]/span/span[2]/span", 5 );


            //Change TypeCode

            WebElement newCodeDropdown = driver.findElement(By.xpath("//*[@id=\"TimeMaterialEditForm\"]/div/div[1]/div/span[1]/span/span[2]/span"));
            newCodeDropdown.click();

            wait.waittobeclickable(driver, "xpath", "//*[@id=\"TypeCode_listbox\"]/li[1]", 3);

            WebElement matDropdown = driver.findElement(By.xpath("//*[@id=\"TypeCode_listbox\"]/li[1]")); ////*[@id="TimeMaterialEditForm"]/div/div[1]/div/span[1]/span/span[1]
           // Thread.sleep(1000);
            matDropdown.click();

            //Thread.Sleep(1000);

            wait.waittobevisible(driver, "id", "Code", 3);

            //Change Code

            WebElement newCodeTextBox = driver.findElement(By.id("Code"));
            newCodeTextBox.clear();
            newCodeTextBox.sendKeys("UpdatedCode");

            //Thread.Sleep(1000);

            //Change description

            WebElement newDescTextBox = driver.findElement(By.id("Description"));
            newDescTextBox.clear();
            newDescTextBox.sendKeys(description);

            //Thread.Sleep(1000);

            // change the price

            WebElement overlappingTag = driver.findElement(By.xpath("//*[@id=\"TimeMaterialEditForm\"]/div/div[4]/div/span[1]/span/input[1]"));
            WebElement priceTextBoxNew = driver.findElement(By.id("Price"));
            overlappingTag.click();
            priceTextBoxNew.clear();
            overlappingTag.click();
            priceTextBoxNew.sendKeys("300");

            //Thread.Sleep(1000);

            //Click Save

            WebElement newSaveButton = driver.findElement(By.id("SaveButton"));
            newSaveButton.click();

            //Thread.Sleep(3000);

            wait.waittobeclickable(driver, "xpath", "//*[@id=\"tmsGrid\"]/div[4]/a[4]/span", 3);

            //Check if the record has been edited successfully
            WebElement gotoLastPageButton1 = driver.findElement(By.xpath("//*[@id=\"tmsGrid\"]/div[4]/a[4]/span"));//*[@id="tmsGrid"]/div[4]/a[4]/span
            gotoLastPageButton1.click();

            wait.waittobevisible(driver, "xpath", "//*[@id=\"tmsGrid\"]/div[3]/table/tbody/tr[last()]/td[3]", 3);

            WebElement newDesc = driver.findElement(By.xpath("//*[@id=\"tmsGrid\"]/div[3]/table/tbody/tr[last()]/td[3]"));

            //String Desc = newDesc.getText();
           // Assert.assertEquals(Desc,description, "New Record not Created Successfully");
        }
        public String GetEditedDesc(WebDriver driver)
        {
            WebElement NewDesc = driver.findElement(By.xpath("//*[@id=\"tmsGrid\"]/div[3]/table/tbody/tr[last()]/td[3]"));
            return NewDesc.getText();
        }
        public void DeleteTimeRecord(WebDriver driver)
        {
            //Delete new record

            //Thread.Sleep(3000);

            WebElement gotoLastPageButton = driver.findElement(By.xpath("//*[@id=\"tmsGrid\"]/div[4]/a[4]/span"));
            gotoLastPageButton.click();

            //Thread.sleep(2000);
            wait.waittobeclickable(driver, "xpath", "//*[@id=\"tmsGrid\"]/div[3]/table/tbody/tr[last()]/td[5]/a[2]", 3);

            WebElement deleteButton = driver.findElement(By.xpath("//*[@id=\"tmsGrid\"]/div[3]/table/tbody/tr[last()]/td[5]/a[2]"));
            deleteButton.click();

            //Thread.sleep(2000);

            driver.switchTo().alert().accept();
            wait.waittobevisible(driver, "xpath", "//*[@id=\"tmsGrid\"]/div[3]/table/tbody/tr[last()]/td[1]", 5);
            //Thread.sleep(2000);

            WebElement newCode1 = driver.findElement(By.xpath("//*[@id=\"tmsGrid\"]/div[3]/table/tbody/tr[last()]/td[1]"));

            //Assert.That(newCode1.Text != "123", "New record not deleted successfully");
            //String Code = newCode1.getText();
            //Assert.assertNotEquals(Code, "123", "New Record not Deleted Successfully");
            

           /*
            if (newCode1.Text != "123")
            {

                Console.WriteLine(" New record has been successfully deleted");

            }
            else
            {
                Console.WriteLine("New record has not been deleted");
            }
           */
        }

        public String GetCodeValue(WebDriver driver)
        {
            WebElement newCodeDelete = driver.findElement(By.xpath("//*[@id=\"tmsGrid\"]/div[3]/table/tbody/tr[last()]/td[1]"));
            String Code = newCodeDelete.getText();
            return Code;
        }
    }

