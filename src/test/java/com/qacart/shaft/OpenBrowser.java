package com.qacart.shaft;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OpenBrowser {

    @Test
    public void openBrowser(){
        SHAFT.GUI.WebDriver driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://hatem-hatamleh.github.io/Selenium-html/actions.html");
        String url = driver.browser().getCurrentURL();
        System.out.println(url);
        String title = driver.browser().getCurrentWindowTitle();
        System.out.println(title);

        By selenium = By.id("selenium");
        By appium = By.name("appium");
        By cypress = By.cssSelector("[data-testid=cypress");

        String text1 = driver.element().getText(selenium);
        String text2 = driver.element().getText(appium);
        String text3 = driver.element().getText(cypress);

        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);





    }
}
