package net.lafox.demo.knapsack.dto;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {
    private final double capacity;
    private double weight = 0.0;
    private double price = 0.0;
    private List<Item> packedItems = new ArrayList<>();

    public double getWeight() {
        return weight;
    }

    public List<Item> getPackedItems() {
        return packedItems;
    }

    public void addItem(Item item){
        getPackedItems().add(item);
        weight+=item.getWeight();
    }

    public Knapsack(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setPackedItems(List<Item> packedItems) {
        this.packedItems = packedItems;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
