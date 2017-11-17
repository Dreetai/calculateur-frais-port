import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

class Test {

    private static final Object[][] testParameters = new Object[][]{

            { 191, 123, 18,  2.354d, "FR", "12,00" },

            { 253, 215, 164, 1.565d, "FR", "30,39" },

            { 653, 133, 271, 2.132d, "FR", "46,09" },

            { 653, 331, 271, 3.650d, "FR", "83,76" },

            { 191, 123, 18,  2.354d, "MC", "13,04" },

            { 253, 215, 164, 1.565d, "MC", "33,03" },

            { 653, 133, 271, 2.132d, "MC", "50,10" },

            { 653, 331, 271, 3.650d, "MC", "91,05" }

    };

    public static void main (String [] args){
        Package pack1 = new Package((Integer) testParameters[0][0],
                (Integer) testParameters[0][1],
                (Integer) testParameters[0][2],
                (Double) testParameters[0][3]);
        System.out.println(pack1.calculateLocalShippingCost());
        Package pack2 = new Package((Integer) testParameters[1][0],
                (Integer) testParameters[1][1],
                (Integer) testParameters[1][2],
                (Double) testParameters[1][3]);
        System.out.println(pack2.calculateLocalShippingCost());
        Package pack3 = new Package((Integer) testParameters[2][0],
                (Integer) testParameters[2][1],
                (Integer) testParameters[2][2],
                (Double) testParameters[2][3]);
        System.out.println(pack3.calculateLocalShippingCost());
        Package pack4 = new Package((Integer) testParameters[3][0],
                (Integer) testParameters[3][1],
                (Integer) testParameters[3][2],
                (Double) testParameters[3][3]);
        System.out.println(pack4.calculateLocalShippingCost());
        Package pack5 = new Package((Integer) testParameters[4][0],
                (Integer) testParameters[4][1],
                (Integer) testParameters[4][2],
                (Double) testParameters[4][3]);
        System.out.println(pack5.calculateShippingCost(ShippingCostsCalculator.Destination.MC));
        Package pack6 = new Package((Integer) testParameters[5][0],
                (Integer) testParameters[5][1],
                (Integer) testParameters[5][2],
                (Double) testParameters[5][3]);
        System.out.println(pack6.calculateShippingCost(ShippingCostsCalculator.Destination.MC));
        Package pack7 = new Package((Integer) testParameters[6][0],
                (Integer) testParameters[6][1],
                (Integer) testParameters[6][2],
                (Double) testParameters[6][3]);
        System.out.println(pack7.calculateShippingCost(ShippingCostsCalculator.Destination.MC));
        Package pack8 = new Package((Integer) testParameters[7][0],
                (Integer) testParameters[7][1],
                (Integer) testParameters[7][2],
                (Double) testParameters[7][3]);
        System.out.println(pack8.calculateShippingCost(ShippingCostsCalculator.Destination.MC));
    }

}