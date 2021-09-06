package org.example.dz04;

import org.example.dz04.utils.TimingExtention;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Olga Shestakova
 * Date 28.08.2021
 */
@ExtendWith(TimingExtention.class)

public class AreaOfTheTriangleTest {

    FunctionsTriangle functionsTriangle = new FunctionsTriangle();
    private static Logger logger = LoggerFactory.getLogger(AreaOfTheTriangleTest.class);

    @BeforeAll
    static void beforeAll() {
        logger.info("Общее предусловие");
        logger.debug("debug level");
        logger.error("error");
    }

    @Test
    @DisplayName("Метод проверки существования треугольника")
    void testSideTriangle() {
        boolean result = functionsTriangle.areaOfTriangle(7, 7, 7);
        Assertions.assertTrue(result);
    }
}
