package com.wiredbraincoffee.reward;

import com.wiredbraincoffee.product.Product;
import org.junit.Rule;
import org.junit.jupiter.api.*;
import org.junit.jupiter.migrationsupport.rules.EnableRuleMigrationSupport;
import org.junit.rules.ErrorCollector;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;

@EnableRuleMigrationSupport
public class RewardByDiscountServiceTest {
    private RewardByDiscountService reward = null;
    private List<Product> order = null;

    @Rule
    public final ErrorCollector collector = new ErrorCollector();

    @BeforeEach
    void setUp() {
        reward = new RewardByDiscountService();
        reward.setPercentage(0.1);
        reward.setNeededPoints(100);

        Product bigDecaf = new Product(2, "Big Decaf", 2.49);
        Product bigLatte = new Product(3, "Big Latte", 2.99);
        Product bigTea = new Product(4, "Big Tea", 2.99);
        Product espresso = new Product(5, "Espresso", 2.99);
        order = Arrays.asList(
                bigDecaf, bigLatte, bigTea, espresso);
    }

    @Test
    void testDiscountApplied() {
        RewardInformation info = reward.applyReward(order, 200);

        collector.checkThat(info.getDiscount() > 0, is(true));
        collector.checkThat(100L, equalTo(info.getPointsRedeemed()));

        System.out.println("Everything was executed!");
    }
}
