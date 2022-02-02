package com.demowebshop.tests.api;

import com.demowebshop.models.api.BlueAndGreenSneakerModel;
import com.demowebshop.tests.TestBase;
import com.demowebshop.tests.api.spec.Specification;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class ApparelAndShoesPageTests {

    @Test
    @DisplayName("Добавление кед в корзину, без указания цвета и размера")
    void addBlueAndGreenSneakerToCartTest() {
        BlueAndGreenSneakerModel blueAndGreenSneakerModel = new BlueAndGreenSneakerModel();
        blueAndGreenSneakerModel.setAddtocart_28_EnteredQuantity(1);

        Response response =
                given()
                        .spec(Specification.request)
                        .body(blueAndGreenSneakerModel)
                        .when().post("/details/28/1")
                        .then().spec(Specification.responseOk)
                        .body("success", is(false))
                        .extract().response();
        assertThat(response.asString(), is(notNullValue()));
    }
}
