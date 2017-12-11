package net.lafox.demo.knapsack.utils;


import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import net.lafox.demo.knapsack.dto.IncomingDto;
import net.lafox.demo.knapsack.dto.Item;
import net.lafox.demo.knapsack.exception.APIException;

public class FileReader {
    private static final Pattern ITEM_PATTERN = Pattern.compile("\\((\\d+),([\\d|.]+),€([\\d|.]+)\\)");

    public static List<IncomingDto> readFile(Path path) {
        try (Stream<String> stream = Files.lines(path)) {
            return stream.map(FileReader::parseLine).collect(Collectors.toList());
        } catch (Exception e) {
            throw new APIException("Can not read the file", e);
        }

    }

    static IncomingDto parseLine(String line) {
        try {
            String[] split = line.split(":");
            double capacity = Double.parseDouble(split[0].trim());
            return new IncomingDto(capacity, parseItems(split[1]));
        } catch (NumberFormatException | NullPointerException e) {
            throw new APIException("line '" + line + "' can not be parsed", e);
        }
    }


    private static List<Item> parseItems(String line) {
        List<Item> items = new ArrayList<>();
        Matcher itemMatcher = ITEM_PATTERN.matcher(line);
        while (itemMatcher.find()) {
            try {
                int id = Integer.parseInt(itemMatcher.group(1));
                double weight = Double.parseDouble(itemMatcher.group(2));
                double price = Double.parseDouble(itemMatcher.group(3));
                items.add(new Item(id, weight, price));
            } catch (NumberFormatException | NullPointerException e) {
                throw new APIException("line '" + line + "' can not be parsed", e);
            }
        }
        return items;
    }

}
