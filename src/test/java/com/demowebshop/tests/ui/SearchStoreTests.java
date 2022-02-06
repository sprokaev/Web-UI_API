package com.demowebshop.tests.ui;

import com.demowebshop.annotation.JiraIssue;
import com.demowebshop.annotation.Layer;
import com.demowebshop.tests.TestBase;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@Layer("ui")
@Owner("sprokaev")
@Feature("Поиск товаров")
public class SearchStoreTests extends TestBase {

    @ParameterizedTest(name = "Поиск товаров по слову {0}")
    @JiraIssue("HOMEWORK-324")
    @Severity(SeverityLevel.NORMAL)
    @ValueSource(strings = {
            "Smartphone",
            "Create Your Own Jewelry",
            "Fiction"})
    void SearchProductTest(String wordBySearch) {
        uiSteps.openUrl("");
        uiSteps.setSearchBox(wordBySearch);
    }
}
