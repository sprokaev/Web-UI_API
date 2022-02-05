package com.demowebshop.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.demowebshop.helpers.AllureAttachments;
import com.demowebshop.helpers.DriverSettings;
import com.demowebshop.steps.ApiSteps;
import com.demowebshop.steps.UiSteps;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {

    protected ApiSteps apiSteps = new ApiSteps();
    protected UiSteps uiSteps = new UiSteps();

    @BeforeAll
    static void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        DriverSettings.configure();
    }

    @AfterEach
    public void addAttachments() {
        AllureAttachments.screenshotAs("Last screenshot");
        AllureAttachments.pageSource();
        AllureAttachments.browserConsoleLogs();
        AllureAttachments.addVideo();
        closeWebDriver();
    }
}