package com.wiredbraincoffee.reward;

import com.wiredbraincoffee.product.Product;

import java.util.*;

public class RewardByGiftService extends RewardService {
    private long giftProductId;

    @Override
    public RewardInformation applyReward(
            List<Product> order, long customerPoints) {
        RewardInformation rewardInformation = new RewardInformation();

        if(customerPoints >= neededPoints) {
            Optional<Product> result = order
                    .stream()
                    .filter(p -> p.getId() == giftProductId)
                    .findAny();
            if(result.isPresent()) {
                rewardInformation = new RewardInformation(
                        neededPoints,
                        result.get().getPrice()
                );
            }
        }

        return rewardInformation;
    }

    public long getGiftProductId() {
        return giftProductId;
    }

    public void setGiftProductId(long giftProductId) {
        if(giftProductId > 0) {
            this.giftProductId = giftProductId;
        } else {
            throw new IllegalArgumentException(giftProductId + " is not a valid product");
        }
    }
}
