package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.shatura.com/");

        //1. Тест
        Authorisation authorisation = new Authorisation();
        authorisation.authorisation();

        //2. Тест
        Search search = new Search();
        search.search();

        //3. Тест
        Basket basket = new Basket();
        basket.addBasket();

        //4.Тест
        basket.deleteBasket();
    }
}
