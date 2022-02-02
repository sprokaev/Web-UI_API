package com.demowebshop.tests.ui;

import com.demowebshop.tests.TestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AddProductToCartTests extends TestBase {

    @Test
    @DisplayName("Добавление книги 'Fiction' в корзину новым пользователем")
    void addBookFictionToCartByNewUserTest() {
        String cookie = apiSteps.addBookFictionToCart().cookie("Nop.customer");
        uiSteps.setCookieForUser(cookie);

        uiSteps.openUrl("/cart");

        uiSteps.checkProductCount(1);
    }

}
