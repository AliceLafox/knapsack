package net.lafox.demo.knapsack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import net.lafox.demo.knapsack.dto.IncomingDto;
import net.lafox.demo.knapsack.dto.Item;
import net.lafox.demo.knapsack.dto.Knapsack;

/**
 * Naive Brute Force Implementation
 * complexity = O(2^n)
 * (checking all combinations of items)
 */

public class ProblemResolverNaiveBruteForceImpl implements ProblemResolver {

    @Override
    public Knapsack resolve(IncomingDto data) {
        Knapsack knapsack = new Knapsack(data.getCapacity());

        findBestSolution(new ArrayList<>(data.getAvailableItems()), knapsack);

        return knapsack;
    }

    private void findBestSolution(List<Item> items, Knapsack knapsack) {
        if (!items.isEmpty()) {
            checkPack(items, knapsack);
        }

        for (Item item : items) {
            findBestSolution(getItemsWithoutCurrentItem(items, item), knapsack);
        }

    }

    private List<Item> getItemsWithoutCurrentItem(List<Item> items, Item currentItem) {
        List<Item> newItems = new LinkedList<>(items);
        newItems.remove(currentItem);
        return newItems;
    }

    private void checkPack(List<Item> items, Knapsack knapsack) {
        Sums sums = calculateSums(items);

        if (sums.weight > knapsack.getCapacity()) return;

        if (knapsack.getPackedItems().isEmpty() || sums.price > knapsack.getPrice()) {
            knapsack.setPackedItems(items);
            knapsack.setPrice(sums.price);
            knapsack.setWeight(sums.weight);
        }

    }

    private Sums calculateSums(Collection<Item> availableItems) {
        Sums sums = new Sums();
        for (Item item : availableItems) {
            sums.price += item.getPrice();
            sums.weight += item.getWeight();
        }
        return sums;
    }

    private class Sums {
        private double price = 0;
        private double weight = 0;
    }
}
