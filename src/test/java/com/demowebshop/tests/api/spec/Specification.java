package com.demowebshop.tests.api.spec;

import com.demowebshop.config.AppConfig;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.with;
import static com.demowebshop.filter.CustomLogFilter.customLogFilter;


public class Specification {

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
