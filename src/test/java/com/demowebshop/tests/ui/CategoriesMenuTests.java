package com.demowebshop.tests.ui;

import com.demowebshop.models.ui.CategoriesMenuEnum;
import com.demowebshop.tests.TestBase;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static io.qameta.allure.Allure.parameter;

public class CategoriesMenuTests extends TestBase {

    @ParameterizedTest(name = "Проверка отображения ссылки {0} в блоке CATEGORIES")
    @EnumSource(CategoriesMenuEnum.class)
    void SearchProductTest(CategoriesMenuEnum categoriesMenuEnum) {
        parameter("Наименование категории товаров", categoriesMenuEnum.linkName);

        uiSteps.openUrl("");
        uiSteps.findLinkName(categoriesMenuEnum.linkName);
    }
}
