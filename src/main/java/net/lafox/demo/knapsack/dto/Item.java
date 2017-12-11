package net.lafox.demo.knapsack.dto;

public class Item {
    private final int index;
    private final double weight;
    private final double price;

    public Item(int index, double weight, double price) {
        this.index = index;
        this.weight = weight;
        this.price = price;
    }

    public int getIndex() {
        return index;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (index != item.index) return false;
        if (Double.compare(item.weight, weight) != 0) return false;
        return Double.compare(item.price, price) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = index;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
