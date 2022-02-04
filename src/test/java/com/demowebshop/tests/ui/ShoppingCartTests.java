package com.demowebshop.tests.ui;

import com.demowebshop.tests.TestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShoppingCartTests extends TestBase {

    @Test
    @DisplayName("Проверка наличия книги 'Fiction' в корзине")
    void addBookFictionToCartByNewUserTest() {
        String cookie = apiSteps.addBookFictionToCart().cookie("Nop.customer");
        uiSteps.setCookieForUser(cookie);

        uiSteps.openUrl("/cart");

        uiSteps.checkProductCount(1);
    }

}
