
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ShippingCostsCalculatorMust {

    private final Package pack;
    private final String destination;
    private final double expectedPrice;

    @Parameterized.Parameters
    public static Collection<Object[]> testParameters() {

        return Arrays.asList(
                new Object[]{191, 123, 18, 2.354d, "FR", "12.00"},

                new Object[]{253, 215, 164, 1.565d, "FR", "30.39"},

                new Object[]{653, 133, 271, 2.132d, "FR", "46.09"},

                new Object[]{653, 331, 271, 3.650d, "FR", "83.76"},

                new Object[]{191, 123, 18, 2.354d, "MC", "13.04"},

                new Object[]{253, 215, 164, 1.565d, "MC", "33.03"},

                new Object[]{653, 133, 271, 2.132d, "MC", "50.10"},

                new Object[]{653, 331, 271, 3.650d, "MC", "91.05"},

                new Object[]{191, 123, 18, 2.354d, "DOM_TOM", "13.91"},

                new Object[]{253, 215, 164, 1.565d, "DOM_TOM", "33.29"},

                new Object[]{653, 133, 271, 2.132d, "DOM_TOM", "49.84"},

                new Object[]{653, 331, 271, 3.650d, "DOM_TOM", "89.55"});
    }

    public ShippingCostsCalculatorMust(int height, int width, int depth, double weight, String dest, String expectedPrice) {
        this.pack = PackageFactory.createPackage(height, width, depth, weight);
        this.destination = dest;
        this.expectedPrice = Double.parseDouble(expectedPrice);
    }

    @Test
    public void give_the_correct_price_for_a_given_package() {
        assertEquals(this.expectedPrice, ShippingCostsCalculator.calculateShippingCost(this.pack, ShippingCostsCalculator.Destination.valueOf(this.destination)), 0.001);
    }

}