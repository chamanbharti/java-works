package com.wiredbraincoffee.reward.clip04;

import com.wiredbraincoffee.reward.RewardByConversionService;
import com.wiredbraincoffee.reward.RewardInformation;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RewardByConversionWithExtensionTest {

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
}
