package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.dataProvider.DataProviderdata;
import org.json.JSONObject;
import org.testng.ITest;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class SiggyTest extends Base
{
Common common=new Common();


    public void findstoreswithLocation(){
        logger.info("Deekay");
        logger.error("Devil");
        logger.debug("Muthu");
        common.searchbyLocation("Mettukuppam");
        common.verifyTitle("Order food online from India's best food delivery service. Order from restaurants near you");
    }


    public void findproducts(){
        common.searchbyLocation("Mettukuppam");
        common.searchForProducts("Biriyani");
        common.verifyTitle("Order food online from India's best food delivery service. Order from restaurants near you");
    }
    @Test(dataProvider = "data", dataProviderClass = DataProviderdata.class)
    public void addProductToCartTest(Object[] data){
        Map<String, String> map = (Map<String, String>) data[0];
        common.searchbyLocation(map.get("Location"));
        common.searchForProducts(map.get("Product"));
        common.verifyTitle("Order food online from India's best food delivery service. Order from restaurants near you");
        common.addProductToCart();
    }


}
