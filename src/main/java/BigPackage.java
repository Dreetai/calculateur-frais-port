public class BigPackage extends Package{

    public BigPackage(int height, int width, int depth, double weight) {
        super(height, width, depth, weight);
    }

    public double calculateLocalShippingCost(){
        return Math.max(this.getGabarit_DMCUBE()*ShippingCostsCalculator.FRAIS_HIGH_PACKAGE,this.getWeight()*ShippingCostsCalculator.FRAIS_HIGH_WEIGHT);
    }
}
