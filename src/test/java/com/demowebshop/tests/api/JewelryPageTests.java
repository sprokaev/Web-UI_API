package com.demowebshop.tests.api;

import com.demowebshop.tests.api.spec.Specification;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JewelryPageTests extends Specification {

    @Test
    @DisplayName("Добавление кулона в корзину")
    public void addBlackAndWhiteDiamondHeartToCartTest() {
        apiSteps.addBlackAndWhiteDiamondHeartToCart();
    }
}
