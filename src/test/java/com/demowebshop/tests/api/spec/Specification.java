package com.demowebshop.tests.api.spec;

import com.demowebshop.config.ProjectConfig;
import com.demowebshop.steps.ApiSteps;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.aeonbits.owner.ConfigFactory;

import static com.demowebshop.helpers.AllureRestAssuredFilter.customLogFilter;
import static io.restassured.RestAssured.with;


public class Specification {

    public static final ProjectConfig config = ConfigFactory.create(ProjectConfig.class, System.getProperties());
    public ApiSteps apiSteps = new ApiSteps();

    public static RequestSpecification request = with()
            .filter(customLogFilter().withCustomTemplates())
            .log().all()
            .contentType(ContentType.JSON)
            .baseUri(config.baseURI())
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
