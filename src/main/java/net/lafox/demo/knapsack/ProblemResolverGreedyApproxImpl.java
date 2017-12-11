package net.lafox.demo.knapsack;

import java.util.ArrayList;
import java.util.List;

import net.lafox.demo.knapsack.dto.IncomingDto;
import net.lafox.demo.knapsack.dto.Item;
import net.lafox.demo.knapsack.dto.Knapsack;

/**
 * Greedy Approximation Implementation
 * complexity = O(n*log(n))
 * O(n*log(n)) for ArrayList sort + O(n) for one items loop
 */
public class ProblemResolverGreedyApproxImpl implements ProblemResolver {

    @Override
    public Knapsack resolve(IncomingDto data) {
        Knapsack knapsack = new Knapsack(data.getCapacity());

        for (Item item : getSortedItems(data)) {
            if (item.getWeight() + knapsack.getWeight() < data.getCapacity()) {
                knapsack.addItem(item);
            }
        }

        return knapsack;
    }

    private List<Item> getSortedItems(IncomingDto data) {
        List<Item> availableItems = new ArrayList<>(data.getAvailableItems());

        availableItems.sort((item1, item2) -> {
            double i1 = item1.getPrice() / item1.getWeight();
            double i2 = item2.getPrice() / item2.getWeight();
            return Double.compare(i2, i1);
        });
        return availableItems;
    }
}
