package com.demowebshop.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.demowebshop.config.App;
import com.demowebshop.config.AppConfig;
import com.demowebshop.helpers.AllureAttachments;
import com.demowebshop.helpers.DriverUtils;
import com.demowebshop.steps.ApiSteps;
import com.demowebshop.steps.UiSteps;
import io.qameta.allure.junit5.AllureJunit5;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

@ExtendWith({AllureJunit5.class})
public class TestBase {

    public static final AppConfig config = ConfigFactory.create(AppConfig.class, System.getProperties());

    protected ApiSteps apiSteps = new ApiSteps();
    protected UiSteps uiSteps = new UiSteps();


    @BeforeAll
    static void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Configuration.startMaximized = true;
//        RestAssured.baseURI = config.baseURI();
        Configuration.baseUrl = config.baseUrl();
        Configuration.remote = System.getProperty("remoteUrl");


        DesiredCapabilities capabilities = new DesiredCapabilities();
        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-infobars");
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--lang=en-en");


        if (App.isRemoteWebDriver()) {
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.remote = App.config.remoteDriverUrl();
        }

        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        Configuration.browserCapabilities = capabilities;
    }

    @AfterEach
    public void addAttachments() {
        String sessionId = DriverUtils.getSessionId();

        AllureAttachments.addScreenshotAs("Last screenshot");
        AllureAttachments.addPageSource();
//        Attachments.attachNetwork();
        AllureAttachments.addBrowserConsoleLogs();

        Selenide.closeWebDriver();

        if (App.isVideoOn()) {
            AllureAttachments.addVideo(sessionId);
        }
    }
}