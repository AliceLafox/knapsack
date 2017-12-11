package net.lafox.demo.knapsack;

import java.util.Arrays;

import net.lafox.demo.knapsack.dto.IncomingDto;
import net.lafox.demo.knapsack.dto.Item;

public class TestData {

    public static final String LINE_1 = " 81 : (1,53.38,€45) (2,88.62,€98) (3,78.48,€3) (4,72.30,€76) (5,30.18,€9) (6,46.34,€48)";
    public static final String LINE_2 = " 8  :  (1,15.3,€34)";
    public static final String LINE_3 = " 75 : (1,85.31,€29) (2,14.55,€74) (3,3.98,€16) (4,26.24,€55) (5,63.69,€52) (6,76.25,€75) (7,60.02,€74) (8,93.18,€35) (9,89.95,€78)";
    public static final String LINE_4 = " 56 : (1,90.72,€13) (2,33.80,€40) (3,43.15,€10) (4,37.97,€16) (5,46.81,€36) (6,48.77,€79) (7,81.80,€45) (8,19.36,€79) (9,6.76,€64)";

    public static final IncomingDto TEST_CASE_1 = new IncomingDto(81, Arrays.asList(
            new Item(1, 53.38, 45),
            new Item(2, 88.62, 98),
            new Item(3, 78.48, 3),
            new Item(4, 72.30, 76),
            new Item(5, 30.18, 9),
            new Item(6, 46.34, 48)
    ));

    public static final IncomingDto TEST_CASE_2 = new IncomingDto(8, Arrays.asList(
            new Item(1, 15.3, 34)
    ));

    public static final IncomingDto TEST_CASE_3 = new IncomingDto(75, Arrays.asList(
            new Item(1, 85.31, 29),
            new Item(2, 14.55, 74),
            new Item(3, 3.98, 16),
            new Item(4, 26.24, 55),
            new Item(5, 63.69, 52),
            new Item(6, 76.25, 75),
            new Item(7, 60.02, 74),
            new Item(8, 93.18, 35),
            new Item(9, 89.95, 78)
    ));

    public static final IncomingDto TEST_CASE_4 = new IncomingDto(56, Arrays.asList(
            new Item(1, 90.72, 13),
            new Item(2, 33.80, 40),
            new Item(3, 43.15, 10),
            new Item(4, 37.97, 16),
            new Item(5, 46.81, 36),
            new Item(6, 48.77, 79),
            new Item(7, 81.80, 45),
            new Item(8, 19.36, 79),
            new Item(9, 6.76, 64)
    ));

    //Wikipedia Case
    public static final IncomingDto TEST_CASE_5 = new IncomingDto(
            15, Arrays.asList(
            new Item(1,9,10),
            new Item(2,12,7),
            new Item(3,2,1),
            new Item(4,7,3),
            new Item(5,5,2)
    ));

}
