package com.demowebshop.tests.ui;

import com.demowebshop.annotation.JiraIssue;
import com.demowebshop.annotation.Layer;
import com.demowebshop.models.ui.CategoriesMenuEnum;
import com.demowebshop.tests.TestBase;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static io.qameta.allure.Allure.parameter;

@Layer("ui")
@Owner("sprokaev")
@Feature("Отображение ссылок на товары в блоке CATEGORIES")
public class CategoriesMenuTests extends TestBase {

    @ParameterizedTest(name = "Проверка отображения ссылки {0} в блоке CATEGORIES")
    @JiraIssue("HOMEWORK-324")
    @Severity(SeverityLevel.NORMAL)
    @EnumSource(CategoriesMenuEnum.class)
    void SearchProductTest(CategoriesMenuEnum categoriesMenuEnum) {
        parameter("Наименование категории товаров", categoriesMenuEnum.linkName);

        uiSteps.openUrl("");
        uiSteps.findLinkName(categoriesMenuEnum.linkName);
    }
}
