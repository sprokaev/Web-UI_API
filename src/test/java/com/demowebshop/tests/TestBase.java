package com.demowebshop.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.demowebshop.config.AppConfig;
import com.demowebshop.helpers.Attachments;
import com.demowebshop.steps.ApiSteps;
import com.demowebshop.steps.UiSteps;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {

    public static final AppConfig config = ConfigFactory.create(AppConfig.class, System.getProperties());

    protected ApiSteps apiSteps = new ApiSteps();
    protected UiSteps uiSteps = new UiSteps();

    @BeforeAll
    static void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Configuration.startMaximized = true;
        Configuration.baseUrl = config.baseUrl();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
        Configuration.remote = System.getProperty("remoteUrl");
    }

    @AfterEach
    public void addAttachments() {
        Attachments.screenshotAs("Last screenshot");
        Attachments.pageSource();
        Attachments.browserConsoleLogs();
        Attachments.addVideo();
        closeWebDriver();
    }
}