package com.github.m0levich;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class SimpleTest {

    private static final Logger LOG=LoggerFactory.getLogger(SimpleTest.class);

    @Test
    public void simpleTest1() {
        LOG.info("Тест1 завершен успешно");
    }

    @Test
    public void simpleTest2() {
        LOG.info("Тест2 завершен успешно");
    }
}
