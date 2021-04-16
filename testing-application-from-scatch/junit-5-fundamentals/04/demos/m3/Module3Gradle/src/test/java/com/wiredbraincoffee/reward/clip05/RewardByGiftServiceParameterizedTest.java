package com.wiredbraincoffee.reward.clip05;

import com.wiredbraincoffee.product.Product;
import com.wiredbraincoffee.reward.RewardByGiftService;
import com.wiredbraincoffee.reward.RewardInformation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RewardByGiftServiceParameterizedTest {
    private RewardByGiftService reward = null;

    @BeforeEach
    void setUp() {
        reward = new RewardByGiftService();
        reward.setNeededPoints(100);
    }

    @ParameterizedTest
    @ValueSource(strings = { "1; Small Decaf; 1.99", "2; Big Decaf; 2.49" })
    void discountShouldBeApplied(
            @ConvertWith(ProductArgumentConverter.class) Product product) {
        System.out.println("Testing product " + product.getName());
        reward.setGiftProductId(product.getId());
        RewardInformation info = reward.applyReward(
                getSampleOrder(), 200);

        assertTrue(info.getDiscount() > 0);
    }

    private List<Product> getSampleOrder() {
        Product smallDecaf = new Product(1, "Small Decaf", 1.99);
        Product bigDecaf = new Product(2, "Big Decaf", 2.49);
        Product bigLatte = new Product(3, "Big Latte", 2.99);
        Product bigTea = new Product(4, "Big Tea", 2.99);
        Product espresso = new Product(5, "Espresso", 2.99);
        return Arrays.asList(
                smallDecaf, bigDecaf, bigLatte, bigTea, espresso);
    }
}
