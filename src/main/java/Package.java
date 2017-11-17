
public abstract class Package {

    private int height;
    private int width;
    private int depth;
    private double weight;
    public static final int LIMIT_HEIGHT = 229;
    public static final int LIMIT_WIDTH = 162;
    public static final int LIMIT_DEPTH = 25;
    public static final double LIMIT_WEIGHT = 1.8d;


    public Package(int height, int width, int depth, double weight) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.weight = weight;
    }

    public abstract double calculateLocalShippingCost();

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