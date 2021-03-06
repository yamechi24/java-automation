package com.verizon.webdrivers.option;

import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vjean on 8/29/2017.
 */
public class NullWebElement implements WebElement {

    private NullWebElement() {
    }

    private static NullWebElement instance;

    public static NullWebElement getNull() {
        if (instance == null) {
            instance = new NullWebElement();
        }
        return instance;
    }

    public static boolean isNull(WebElement element) {
        return getNull().equals(element);
    }

    @Override
    public void click() {
    }

    @Override
    public void submit() {
    }

    @Override
    public void sendKeys(CharSequence... charSequences) {
    }

    @Override
    public void clear() {
    }

    @Override
    public String getTagName() {
        return "";
    }

    @Override
    public String getAttribute(String s) {
        return "";
    }

    @Override
    public boolean isSelected() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public String getText() {
        return "";
    }

    @Override
    public List<WebElement> findElements(By by) {
        return new ArrayList<>();
    }

    @Override
    public WebElement findElement(By by) {
        return NullWebElement.getNull();
    }

    @Override
    public boolean isDisplayed() {
        return false;
    }

    @Override
    public Point getLocation() {
        return new Point(0, 0);
    }

    @Override
    public Dimension getSize() {
        return new Dimension(0, 0);
    }

    @Override
    public Rectangle getRect() {
        return new Rectangle(0, 0, 0, 0);
    }

    @Override
    public String getCssValue(String s) {
        return "";
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        return null;
    }
}
