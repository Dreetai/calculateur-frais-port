public class MediumPackage extends Package{

    public MediumPackage(int height, int width, int depth, double weight) {
        super(height, width, depth, weight);
    }

    public double calculateLocalShippingCost(){
        return this.getWeight()*ShippingCostsCalculator.FRAIS_SMALL_WEIGHT+ShippingCostsCalculator.FRAIS_FIXES;
    }
}
