package restTemplate;
/*
package com.oventus.template.functional.stepDefinitions;


import org.json.JSONException;
import org.junit.BeforeClass;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpHeaders;
import cucumber.api.java.Before;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestAssured_Authentication {


    @LocalServerPort
    protected int port;


    Response responseGet;


    private static String accessToken;


    static {
        accessToken = generateAccessToken();
    }


    @BeforeClass
    public void setUp() throws JSONException {
        String baseUrl = "http://localhost:" + port;
        System.out.println("baseurl" + baseUrl);
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder()
                .addHeader(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken).setBaseUri(baseUrl);
        RestAssured.requestSpecification = requestSpecBuilder.build();
    }


    private static String generateAccessToken() {
        String baseUrl = "http://host.docker.internal/auth/realms/oventus/protocol";
        Response response = RestAssured.given().baseUri(baseUrl).contentType(ContentType.URLENC.withCharset("UTF-8"))
                .formParam("grant_type", "password").formParam("username", "user01")
                .formParam("password", "user01@1234").formParam("client_id", "oventus-connect")
                .post("/openid-connect/token/");


        System.out.println("The status code recieved:Keykloak " + response.getStatusCode());
        System.out.println("Response body: " + response.body().asString());
        JsonPath jsonPath = new JsonPath(response.body().asString());
        String access_token = jsonPath.getString("access_token");
        return access_token;
    }


}

}
*/
