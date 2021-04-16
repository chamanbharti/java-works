package com.wiredbraincoffee.reward.clip02;

import com.wiredbraincoffee.reward.RewardByConversionService;
import com.wiredbraincoffee.reward.RewardInformation;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(LifecycleExtension.class)
class RewardByConversionWithExtensionTest {
    private RewardByConversionService reward;

    @BeforeAll
    static void setUpAll() {
        System.out.println("BeforeAll");
    }

    @BeforeEach
    void setUp() {
        System.out.println("BeforeEach");
        reward = new RewardByConversionService();
        reward.setNeededPoints(100);
        reward.setAmount(10);
    }

    @AfterEach
    void tearDown() {
        System.out.println("AfterEach");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("AfterAll");
    }

    @Test
    //@ExtendWith(LifecycleExtension.class)
    void changeAmount() {
        System.out.println("Test changeAmount");
        reward.setAmount(20);

        assertEquals(20, reward.getAmount());
    }

    @Test
    void rewardNotAppliedEmptyOrder() {
        RewardInformation info = reward.applyReward(
                new ArrayList<>(),
                500
        );

        assertEquals(0, info.getPointsRedeemed());
        assertEquals(0, info.getDiscount());
    }
}
