package com.demowebshop.tests.api;

import com.demowebshop.tests.TestBase;
import com.demowebshop.tests.api.spec.Specification;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.Is.is;

public class JewelryPageTests extends TestBase {

    @Test
    @DisplayName("Добавление кулона в корзину")
    public void addBlackAndWhiteDiamondHeartToCartTest() {
        apiSteps.addBlackAndWhiteDiamondHeartToCart();
    }
}
