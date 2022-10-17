package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search extends Data{

    WebDriver driver = new ChromeDriver();
    Data getData = new Data();

    private By formSearch = By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/form");
    private By inputSearch = By.xpath("//*[@id=\"digi-shield\"]/div[2]/div/div/form/div/input");
    private By search = By.xpath("//*[@id=\"digi-shield\"]/div[2]/div/div/form/div/div/button");

    public void search(){
        driver.get(getData.getUrl);
        driver.manage().window().maximize();
        driver.findElement(formSearch).click();
        driver.findElement(inputSearch).sendKeys(getData.textSearch);
        driver.findElement(search).click();
        driver.quit();
    }

}
