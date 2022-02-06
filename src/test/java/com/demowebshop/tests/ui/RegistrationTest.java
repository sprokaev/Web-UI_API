package com.demowebshop.tests.ui;

import com.demowebshop.annotation.JiraIssue;
import com.demowebshop.annotation.Layer;
import com.demowebshop.tests.TestBase;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Layer("ui")
@Owner("sprokaev")
@Feature("Регистрация пользователя")
public class RegistrationTest extends TestBase {

    @Test
    @DisplayName("Регистрация пользователя")
    @JiraIssue("HOMEWORK-324")
    @Severity(SeverityLevel.CRITICAL)
    void addBookFictionToCartByNewUserTest() {
        uiSteps.openUrl("/register");
        uiSteps.registrationUser();
    }
}
