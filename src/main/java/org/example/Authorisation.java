package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authorisation extends Data {
    WebDriver driver = new ChromeDriver();
    Data getData = new Data();

    private By buttonPersonalArea = By.xpath("//*[@id=\"login_btn\"]/span[1]");
    private By inputEmail = By.xpath("//*[@id=\"email_auth\"]");
    private By inputPassword = By.xpath("//*[@id=\"password\"]");
    private By buttonLogin = By.xpath("//*[@id=\"login__form\"]/div[3]/button/span");

    public void authorisation() {

        driver.get(getData.getUrl);
        driver.manage().window().maximize();

        driver.findElement(buttonPersonalArea).click();

        driver.findElement(inputEmail).sendKeys(getData.email);
        driver.findElement(inputPassword).sendKeys(getData.password);

        driver.findElement(buttonLogin).click();
        driver.quit();

    }
}
