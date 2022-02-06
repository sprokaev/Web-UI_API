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
@Feature("Добавление товаров в корзину")
public class ShoppingCartTests extends TestBase {

    @Test
    @DisplayName("Проверка наличия книги 'Fiction' в корзине")
    @JiraIssue("HOMEWORK-324")
    @Severity(SeverityLevel.NORMAL)
    void addBookFictionToCartByNewUserTest() {
        String cookie = apiSteps.addBookFictionToCart().cookie("Nop.customer");
        uiSteps.setCookieForUser(cookie);

        uiSteps.openUrl("/cart");

        uiSteps.checkProductCount(1);
    }

}
