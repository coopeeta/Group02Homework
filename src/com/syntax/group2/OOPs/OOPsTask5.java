package com.syntax.group2.OOPs;

public class OOPsTask5 implements TakesScreenshot {

    @Override
    public void getScreenshot() {
        System.out.println("Screenshot displays");

    }

    public static void main(String[] args) {
        OOPsTask5 tester = new OOPsTask5();
        tester.getScreenshot();
    }
}

interface WebDriver {
    void open();

    void close();

    String getTitle();
}

interface TakesScreenshot {
    void getScreenshot();
}

interface RemoteWebDriver extends TakesScreenshot, WebDriver {
    void navigate();
}

class ChromeDriver implements RemoteWebDriver {

    @Override
    public void navigate() {

    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenshot() {

    }
}

class FirefoxDriver implements RemoteWebDriver {

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {

    }

    @Override
    public void getScreenshot() {

    }
}

class SafariDriver implements RemoteWebDriver {

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {

    }

    @Override
    public void getScreenshot() {

    }
}