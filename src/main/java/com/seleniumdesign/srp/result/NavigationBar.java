package com.seleniumdesign.srp.result;

import com.seleniumdesign.srp.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBar extends AbstractComponent {

    @FindBy(id = "hdtb")
    private WebElement bar;

    @FindBy(linkText = "Imágenes")
    private WebElement images;

    @FindBy(linkText = "Noticias")
    private WebElement news;

    public NavigationBar(final WebDriver driver) {
        super(driver);
    }

    public void goToImages() {
        this.images.click();
    }

    public void goToNews() {
        this.news.click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until(d -> this.bar.isDisplayed());
    }
}
