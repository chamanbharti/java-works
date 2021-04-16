package com.wiredbraincoffee.reward.junit4;

import com.wiredbraincoffee.product.Product;
import com.wiredbraincoffee.reward.RewardByConversionService;
import com.wiredbraincoffee.reward.RewardInformation;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RewardByConversionServiceTest {

    private RewardByConversionService reward = null;

    @Before
    public void setUp() {
        reward = new RewardByConversionService();
        reward.setAmount(10);
        reward.setNeededPoints(100);
    }

    @Test
    public void correctAmount() {
        assertEquals(10, reward.getAmount(), 0.01);
    }

    @Test
    public void emptyOrderZeroPoints() {
        RewardInformation info = reward.applyReward(getEmptyOrder(), 0);

        assertEquals(0, info.getDiscount(), 0.01);
        assertEquals(0, info.getPointsRedeemed());
    }

    @Test
    public void notEnoughPoints() {
        RewardInformation info = reward.applyReward(getSampleOrder(), 10);

        assertEquals(0, info.getDiscount(), 0.01);
        assertEquals(0, info.getPointsRedeemed());
    }

    @Test
    public void emptyOrderEnoughPoints() {
        RewardInformation info = reward.applyReward(getEmptyOrder(), 200);

        assertEquals(0, info.getDiscount(), 0.01);
        assertEquals(0, info.getPointsRedeemed());
    }

    private List<Product> getEmptyOrder() {
        return Arrays.asList();
    }

    private List<Product> getSampleOrder() {
        Product bigDecaf = new Product(2, "Big Decaf", 2.49);
        Product bigLatte = new Product(3, "Big Latte", 2.99);
        Product bigTea = new Product(4, "Big Tea", 2.99);
        Product espresso = new Product(5, "Espresso", 2.99);
        return Arrays.asList(
                bigDecaf, bigLatte, bigTea, espresso);
    }
}
