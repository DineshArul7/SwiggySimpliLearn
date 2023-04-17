package org.example;

import org.example.dataProvider.DataProviderdata;
import org.testng.annotations.Test;

import java.util.Map;

public class OnlinePetStoreTest extends OnlinePetStore{

    @Test(dataProvider = "data", dataProviderClass = DataProviderdata.class,
    priority = 0)
    public void postPet(Object[] data){
        Map<String, String> map = (Map<String, String>) data[0];
        setBaseURI(getClass().getName());
        setBasePaath("/pet");
        sendrequest("post", getbody(Integer.parseInt(map.get("Id")),map.get("Name")));
        validateresponse(200);
    }

    @Test(dataProvider = "data", dataProviderClass = DataProviderdata.class,
    priority = 1)
    public void getPet(Object[] data){
        Map<String, String> map = (Map<String, String>) data[0];
        setBaseURI(getClass().getName());
        setBasePaath("/pet"+"/"+Integer.parseInt(map.get("Id")));
        sendrequest("get", "");
        validateresponse(200);
    }

    @Test(dataProvider = "data", dataProviderClass = DataProviderdata.class,
    priority = 2)
    public void deletePet(Object[] data){
        Map<String, String> map = (Map<String, String>) data[0];
        setBaseURI(getClass().getName());
        setBasePaath("/pet"+"/"+Integer.parseInt(map.get("Id")));
        sendrequest("delete", "");
        validateresponse(200);
    }

    @Test(dataProvider = "data", dataProviderClass = DataProviderdata.class,
    priority = 4)
    public void E2E(Object[] data){
        Map<String, String> map = (Map<String, String>) data[0];
        setBaseURI(getClass().getName());
        setBasePaath("/pet");
        sendrequest("post", getbody(Integer.parseInt(map.get("Id")),map.get("Name")));
        validateresponse(200);
        setBaseURI(getClass().getName());
        setBasePaath("/pet"+"/"+Integer.parseInt(map.get("Id")));
        sendrequest("delete", "");
        validateresponse(200);
        setBaseURI(getClass().getName());
        setBasePaath("/pet"+"/"+Integer.parseInt(map.get("Id")));
        sendrequest("get", "");
        validateresponse(404);

    }




}
