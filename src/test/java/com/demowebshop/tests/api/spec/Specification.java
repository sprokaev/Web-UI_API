package com.demowebshop.tests.api.spec;

import com.demowebshop.steps.ApiSteps;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static com.demowebshop.filter.CustomLogFilter.customLogFilter;
import static io.restassured.RestAssured.with;


public class Specification {

    public ApiSteps apiSteps = new ApiSteps();

    public static RequestSpecification request = with()
            .filter(customLogFilter().withCustomTemplates())
            .log().all()
            .contentType(ContentType.JSON)
            .baseUri("http://demowebshop.tricentis.com")
            .basePath("/addproducttocart");

    public static ResponseSpecification responseOk = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .log(LogDetail.ALL)
            .build();

    public static ResponseSpecification responseCreatedOk = new ResponseSpecBuilder()
            .expectStatusCode(201)
            .log(LogDetail.ALL)
            .build();
}
