package net.lafox.demo.knapsack.utils;

import net.lafox.demo.knapsack.TestData;
import net.lafox.demo.knapsack.exception.APIException;
import org.junit.Assert;
import org.junit.Test;

public class FileReaderTest {
    @Test
    public void parseLine() throws Exception {
        Assert.assertEquals(TestData.TEST_CASE_1, FileReader.parseLine(TestData.LINE_1));
        Assert.assertEquals(TestData.TEST_CASE_2, FileReader.parseLine(TestData.LINE_2));
        Assert.assertEquals(TestData.TEST_CASE_3, FileReader.parseLine(TestData.LINE_3));
        Assert.assertEquals(TestData.TEST_CASE_4, FileReader.parseLine(TestData.LINE_4));
    }

    @Test(expected = APIException.class)
    public void apiExceptionWhenReadingFile() throws Exception {
        FileReader.readFile(null);
    }

    @Test(expected = APIException.class)
    public void apiExceptionWhenParseLine() throws Exception {
        FileReader.parseLine(" 8???  : ??? (1,15.3,€34,99), ()");
    }
}