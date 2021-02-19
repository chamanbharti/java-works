package com.reward;


import java.util.List;

import com.product.Product;

public abstract class RewardService {
    protected long neededPoints;

    public abstract RewardInformation applyReward(
            List<Product> order, long customerPoints);

    protected double calculateTotal(List<Product> order) {
        double sum = 0;

        if(order != null) {
            sum = order.stream().mapToDouble(Product::getPrice).sum();
        }

        return sum;
    }

    public long getNeededPoints() {
        return neededPoints;
    }

    public void setNeededPoints(long neededPoints) {
        this.neededPoints = neededPoints;
    }
}
