package com.demowebshop.tests.ui;

import com.demowebshop.tests.TestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RegistrationTest extends TestBase {

    @Test
    @DisplayName("Регистрация пользователя")
    void addBookFictionToCartByNewUserTest() {
        uiSteps.openUrl("/register");
        uiSteps.registrationUser();
    }
}
