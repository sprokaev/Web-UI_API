package com.demowebshop.tests.ui;

import com.demowebshop.tests.TestBase;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Selenide.sleep;

public class SearchStoreTests extends TestBase {

    @ParameterizedTest(name = "Поиск товаров по слову {0}")
    @ValueSource(strings = {
            "Smartphone",
            "Create Your Own Jewelry",
            "Fiction"})
    void SearchProductTest(String wordBySearch) {
        uiSteps.openUrl("");
        uiSteps.setSearchBox(wordBySearch);
        sleep(5000);
    }
}
