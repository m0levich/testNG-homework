package com.github.m0levich;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
    private static final Logger LOG= LoggerFactory.getLogger(DataProviderTest.class);

    @DataProvider(name = "Cats")
    private Object[][] dataProvider(){
        return new Object[][]{
                {"Барсик", "рыжий"},
                {"Васька", "белый"},
                {"Мурка", "черный"}
        };
    }

    @Test(dataProvider = "Cats")
    public void paramTest(String name, String color){
        String output = String.format("Имя: %s и цвет: %s",name,color);
        LOG.info(output);
    }
}
