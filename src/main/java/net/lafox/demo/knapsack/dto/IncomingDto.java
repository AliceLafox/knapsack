package net.lafox.demo.knapsack.dto;

import java.util.Collections;
import java.util.List;

public class IncomingDto {

    private final double capacity;
    private final List<Item> availableItems;

    public IncomingDto(double capacity, List<Item> availableItems) {
        this.capacity = capacity;
        this.availableItems = Collections.unmodifiableList(availableItems);
    }

    public double getCapacity() {
        return capacity;
    }

    public List<Item> getAvailableItems() {
        return availableItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IncomingDto that = (IncomingDto) o;

        if (Double.compare(that.capacity, capacity) != 0) return false;
        return availableItems.equals(that.availableItems);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(capacity);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + availableItems.hashCode();
        return result;
    }
}
