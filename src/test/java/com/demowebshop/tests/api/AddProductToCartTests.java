package com.demowebshop.tests.api;

import com.demowebshop.annotation.JiraIssue;
import com.demowebshop.annotation.Layer;
import com.demowebshop.tests.api.spec.Specification;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Layer("api")
@Owner("sprokaev")
@Feature("Добавление товаров в корзину")
public class AddProductToCartTests extends Specification {

    @Test
    @DisplayName("Добавление кед в корзину, без указания цвета и размера")
    @JiraIssue("HOMEWORK-324")
    @Severity(SeverityLevel.NORMAL)
    public void addBlueAndGreenSneakerToCartTest() {
        apiSteps.addBlueAndGreenSneakerToCart();
    }

    @Test
    @DisplayName("Добавление кулона в корзину")
    @JiraIssue("HOMEWORK-324")
    @Severity(SeverityLevel.NORMAL)
    public void addBlackAndWhiteDiamondHeartToCartTest() {
        apiSteps.addBlackAndWhiteDiamondHeartToCart();
    }
}
