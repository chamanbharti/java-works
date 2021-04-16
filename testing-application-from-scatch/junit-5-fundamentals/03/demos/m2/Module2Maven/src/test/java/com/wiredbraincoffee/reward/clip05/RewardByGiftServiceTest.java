package com.wiredbraincoffee.reward.clip05;

import com.wiredbraincoffee.product.Product;
import com.wiredbraincoffee.reward.RewardByGiftService;
import com.wiredbraincoffee.reward.RewardInformation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.*;

public class RewardByGiftServiceTest {
    private RewardByGiftService reward = null;

    @BeforeEach
    void setUp() {
        reward = new RewardByGiftService();
        reward.setGiftProductId(4);
        reward.setNeededPoints(100);
    }

    @Test
    @DisplayName("Correct product ID is set")
    void correctProductID() {
        /*assertEquals(
                4,
                reward.getGiftProductId(),
                "Error, the product ID is incorrect"
        );*/
        assertEquals(
                4,
                reward.getGiftProductId(),
                () -> {
                    System.out.println("Lazy loaded!");
                    return "Error, the product ID is incorrect";
                }
        );
    }

    @Test
    @DisplayName("Reward applied with enough points")
    void rewardApplied() {
        RewardInformation info = reward.applyReward(
                buildSampleOrder(10), 200
        );

        //assertNotNull(info);
        //assertEquals(2.99, info.getDiscount());
        //assertEquals(100, info.getPointsRedeemed());
        /*assertAll("Reward info errors",
                () -> assertEquals(2, info.getDiscount()),
                () -> assertEquals(10, info.getPointsRedeemed())
        );*/
        assertAll("Reward info errors",
                () -> assertNotNull(info),
                () -> assertEquals(2.99, info.getDiscount()),
                () -> assertEquals(100, info.getPointsRedeemed())
        );
    }

    @Test
    @DisplayName("Exception is thrown when invalid product ID")
    void exceptionThrownWhenInvalidProductID() {
        long productId = 0;
        /*assertThrows(RuntimeException.class, () -> {
            reward.setGiftProductId(productId);
        });*/
        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            reward.setGiftProductId(productId);
        });
        assertTrue(exception.getMessage().contains(String.valueOf(productId)));
    }

    @Test
    @DisplayName("Should not exceed timeout")
    void timeoutNotExceeded() {
        int numberOfProducts = 500;
        reward.setGiftProductId(numberOfProducts - 1);

        RewardInformation info = assertTimeout/*Preemptively*/(
                Duration.ofMillis(4),
                () ->
                        reward.applyReward(
                                buildSampleOrder(numberOfProducts),
                                200
                        )
        );

        assertEquals(2.99, info.getDiscount());
    }

    private List<Product> buildSampleOrder(int numberOfProducts) {
        List<Product> list = IntStream.range(1, numberOfProducts)
                .mapToObj(i -> new Product(i, "Product " + i, 2.99))
                .collect(toList());
        return list;
    }
}
