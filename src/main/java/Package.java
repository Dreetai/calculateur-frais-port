
public class Package {

    private int height;
    private int width;
    private int depth;
    private double weight;
    private final int LIMIT_HEIGHT = 229;
    private final int LIMIT_WIDTH = 162;
    private final int LIMIT_DEPTH = 25;
    private final double LIMIT_WEIGHT = 1.8d;


    public Package(int height, int width, int depth, double weight) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.weight = weight;
    }


    public double calculateShippingCost(ShippingCostsCalculator.Destination destination){
        return ShippingCostsCalculator.calculateShippingCost(this, destination);
    }

    public double calculateLocalShippingCost(){

        return ShippingCostsCalculator.calculateShippingCost(this, ShippingCostsCalculator.Destination.FR);

    }

    public double getWeight(){
        return this.weight;
    }

    public double getGabarit_DMCUBE(){
        return (this.depth*this.height*this.width)*Math.pow(10,-6);
    }

    public boolean isSmall(){
        return this.height<LIMIT_HEIGHT && this.width < LIMIT_WIDTH && this.depth<LIMIT_DEPTH;
    }

    public boolean islightweight(){
        return this.weight<LIMIT_WEIGHT;
    }
}