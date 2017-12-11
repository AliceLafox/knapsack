package net.lafox.demo.knapsack.utils;

import java.util.Collection;
import java.util.stream.Collectors;

import net.lafox.demo.knapsack.dto.Item;

public class OutputFormatter {

    public static String format(Collection<Item> list) {
        return list.isEmpty() ? "-" :
                list.stream().map(p -> p.getIndex() + "").sorted().collect(Collectors.joining(","));
    }
}
