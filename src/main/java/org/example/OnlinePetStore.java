package org.example;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.Logger;
import org.example.commonUtils.CommonUtils;

import static io.restassured.RestAssured.*;

public class OnlinePetStore {
CommonUtils commonUtils=new CommonUtils();
static RequestSpecification requestSpecification;


static Response response;
static Logger logger;

    public void setBaseURI(String testName){
        baseURI=commonUtils.getProperty("BaseURI");
        logger=commonUtils.getlog4jlogger(testName);
        logger.info("BaseURI is set Successfully");
    }

    public void setBasePaath(String basepath){
        basePath=basepath;
        requestSpecification=given().relaxedHTTPSValidation().log().all().contentType(ContentType.JSON);

    }
    public void setQueryParam(String key,String value){
        requestSpecification=requestSpecification.queryParam(key,value);
    }
    public String getbody(int id,String name){
        String body="{\n" +
                "  \"id\": "+id+",\n" +
                "  \"name\": \""+name+"\",\n" +
                "  \"category\": {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"Dogs\"\n" +
                "  },\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";
        return body;
    }

    public void sendrequest(String method ,String body){
        switch (method){
            case  "post":
                response=requestSpecification.body(body).when().post();
                break;
            case "get":
                response=requestSpecification.when().get();
                break;
            case "delete":
                response=requestSpecification.when().delete();
                break;
            case "put":
                response=requestSpecification.when().put();
                break;
            default:
                logger.info("Entered method is not Valid");
                break;
        }
    }

    public void validateresponse(int code){
        response.then().log().all().statusCode(code);
    }



}
