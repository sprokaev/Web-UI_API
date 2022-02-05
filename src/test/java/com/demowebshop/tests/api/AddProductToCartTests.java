package com.demowebshop.tests.api;

import com.demowebshop.tests.api.spec.Specification;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AddProductToCartTests extends Specification {

    @Test
    @DisplayName("Добавление кед в корзину, без указания цвета и размера")
    public void addBlueAndGreenSneakerToCartTest() {
        apiSteps.addBlueAndGreenSneakerToCart();
    }

    @Test
    @DisplayName("Добавление кулона в корзину")
    public void addBlackAndWhiteDiamondHeartToCartTest() {
        apiSteps.addBlackAndWhiteDiamondHeartToCart();
    }
}
