package com.demowebshop.steps;

import com.demowebshop.models.api.BlueAndGreenSneakerModel;
import com.demowebshop.tests.api.spec.Specification;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.hamcrest.Matchers;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.Is.is;

public class ApiSteps {

    @Step("Добавление книги 'Fiction' в корзину через Api")
    public Response addBookFictionToCart() {
        return given()
                .spec(Specification.request)
                .when().post("/catalog/45/1/1")
                .then().spec(Specification.responseOk)
                .body("success", is((true)))
                .body("message", is(("The product has been added to your <a href=\"/cart\">shopping cart</a>")))
                .body("updatetopcartsectionhtml", is(("(1)")))
                .extract().response();
    }

    @Step("Добавление кулона 'Black & White Diamond Heart' в корзину через Api")
    public Response addBlackAndWhiteDiamondHeartToCart() {
        return given()
                .spec(Specification.request)
                .when().post("/catalog/14/1/1")
                .then().spec(Specification.responseOk)
                .body("success", is((true)))
                .body("message", is(("The product has been added to your <a href=\"/cart\">shopping cart</a>")))
                .body("updatetopcartsectionhtml", is(("(1)")))
                .extract().response();
    }

    @Step("Добавление кед в корзину, без указания цвета и размера")
    public Response addBlueAndGreenSneakerToCart() {
        BlueAndGreenSneakerModel blueAndGreenSneakerModel = new BlueAndGreenSneakerModel();
        blueAndGreenSneakerModel.setAddtocart_28_EnteredQuantity(1);

        return given()
                .spec(Specification.request)
                .when().post("/details/28/1")
                .then().spec(Specification.responseOk)
                .body("success", Matchers.is(false))
                .extract().response();
    }
}
