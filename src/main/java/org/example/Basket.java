package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basket {
    WebDriver driver = new ChromeDriver();
    Data getData = new Data();

    private By buttonCatalogs = By.xpath("//*[@id=\"app\"]/header/div[1]/div/div[3]/div/div/div[2]/div/ul/li[3]/a");
    private By inputElement = By.xpath("//*[@id=\"app\"]/main/div[2]/section/div/div[4]/div/div[1]/div/div/div[2]/div[3]/a");
    private By buttonBuy = By.xpath("//*[@id=\"app\"]/main/div[2]/div/div[2]/div[4]/div[1]/div[2]/button");
    private By buttonBasket = By.xpath("//*[@id=\"header__basket-wrap\"]/div/a");

    private By buttonDelete = By.xpath("//*[@id=\"basket-items\"]/div[1]/table/tbody/tr[2]/td[6]/button");

    public void addBasket() {

        driver.get(getData.getUrl);
        driver.manage().window().maximize();

        driver.findElement(buttonCatalogs).click();

        driver.findElement(inputElement).click();
        driver.findElement(buttonBuy).click();

        driver.findElement(buttonBasket).click();
        driver.quit();
    }
    public void deleteBasket(){
        driver.get(getData.getUrl);
        driver.manage().window().maximize();

        driver.findElement(buttonCatalogs).click();

        driver.findElement(inputElement).click();
        driver.findElement(buttonBuy).click();

        driver.findElement(buttonBasket).click();
        driver.findElement(buttonDelete).click();

        driver.quit();
    }
}
