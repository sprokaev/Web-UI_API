package com.demowebshop.steps;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;
import org.openqa.selenium.Cookie;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class UiSteps {

    @Step("Открываю '{url}'")
    public void openUrl(String url) {
        open(url);
    }

    @Step("Запись cookie в браузер")
    public void setCookieForUser(String cookie) {
        openUrl("/Themes/DefaultClean/Content/images/logo.png");
        getWebDriver().manage().addCookie(new Cookie("Nop.customer", cookie));
    }

    @Step("Проверка, что количество товара в корзине равно '{count}'")
    public void checkProductCount(int count) {
        $("input[class='qty-input']").shouldHave(value(String.valueOf(count)));
    }

    @Step("Поиск товаров по слову '{searchByWord}'")
    public void setSearchBox(String searchByWord) {
        $(".search-box-text").setValue(searchByWord);
        $(".search-box-button").click();
        $(".search-results").shouldHave(text(searchByWord));
    }

    @Step("Проверка отображения ссылки '{linkName}' в блоке CATEGORIES")
    public void findLinkName(String linkName) {
        $$(".list").shouldHave(texts(linkName));
    }
}




