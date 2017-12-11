package net.lafox.demo.knapsack;

import static net.lafox.demo.knapsack.TestData.TEST_CASE_1;
import static net.lafox.demo.knapsack.TestData.TEST_CASE_2;
import static net.lafox.demo.knapsack.TestData.TEST_CASE_3;
import static net.lafox.demo.knapsack.TestData.TEST_CASE_4;
import static net.lafox.demo.knapsack.TestData.TEST_CASE_5;
import static org.junit.Assert.assertEquals;

import net.lafox.demo.knapsack.dto.Knapsack;
import net.lafox.demo.knapsack.utils.OutputFormatter;
import org.junit.Test;

public class ProblemResolverGreedyApproxTest {

    private final ProblemResolver problemResolver = new ProblemResolverGreedyApproxImpl();

    @Test
    public void testCase1() throws Exception {
        assertEquals("4", OutputFormatter.format(problemResolver.resolve(TEST_CASE_1).getPackedItems()));
    }

    @Test
    public void testCase2() throws Exception {
        assertEquals("-", OutputFormatter.format(problemResolver.resolve(TEST_CASE_2).getPackedItems()));
    }

    @Test
    public void testCase3() throws Exception {
        assertEquals("2,3,4", OutputFormatter.format(problemResolver.resolve(TEST_CASE_3).getPackedItems()));
    }

    @Test
    public void testCase4() throws Exception {
        assertEquals("8,9", OutputFormatter.format(problemResolver.resolve(TEST_CASE_4).getPackedItems()));
    }

    @Test
    public void testCase5() throws Exception {
        Knapsack knapsack = problemResolver.resolve(TEST_CASE_5);
        assertEquals("1,3", OutputFormatter.format(knapsack.getPackedItems()));
        assertEquals(11, knapsack.getWeight(), 0.01);
    }

}