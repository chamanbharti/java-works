package com.wiredbraincoffee.reward.extensiontests;

import com.wiredbraincoffee.product.Product;
import com.wiredbraincoffee.reward.RewardByConversionService;
import com.wiredbraincoffee.reward.RewardInformation;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RewardByConversionWithExtensionTest {

    @Nested
    class OneNestedTest {
        @TestWithErrorHandler
        void changeAmount(RewardByConversionService reward) {
            reward.setAmount(-20);

            assertEquals(-20, reward.getAmount());
        }
    }

    @TestWithErrorHandler
    void changeAmount(RewardByConversionService reward) {
        reward.setAmount(-20);

        assertEquals(-20, reward.getAmount());
    }

    @TestWithErrorHandler
    void rewardNotAppliedEmptyOrder(RewardByConversionService reward) {
        RewardInformation info = reward.applyReward(
                new ArrayList<>(),
                500
        );

        assertEquals(0, info.getPointsRedeemed());
        assertEquals(0, info.getDiscount());
    }

    @TestWithErrorHandler
    void rewardApplied(RewardByConversionService reward) {
        reward.setNeededPoints(10);
        reward.setAmount(1);

        RewardInformation info = reward.applyReward(
                Collections.singletonList(new Product(1, "Latte", 1.99)),
                500
        );

        assertEquals(10, info.getPointsRedeemed());
        assertEquals(1, info.getDiscount());
    }
}
