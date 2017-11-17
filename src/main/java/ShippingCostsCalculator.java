public class ShippingCostsCalculator {

    public enum Destination{FR, MC};
    private static final double FRAIS_SMALL_PACKAGE = 12;
    private static final double FRAIS_SMALL_WEIGHT = 17.59;
    private static final double FRAIS_FIXES = 2.86;
    private static final double FRAIS_HIGH_WEIGHT = 21.62;
    private static final double FRAIS_HIGH_PACKAGE = 1.43;
    private static final double POURCENTAGE_FR = 1;
    private static final double POURCENTAGE_MC = 1.087;

    public static double calculateShippingCost(Package pack, Destination destination){
        double cost = 0;
        if(pack.isSmall()){
            cost += ShippingCostsCalculator.FRAIS_SMALL_PACKAGE;
        }
        else if(pack.islightweight()){
            cost += pack.getWeight()*FRAIS_SMALL_WEIGHT+FRAIS_FIXES;
        }
        else{
            cost += Math.max(pack.getGabarit_DMCUBE()*FRAIS_HIGH_PACKAGE,pack.getWeight()*FRAIS_HIGH_WEIGHT);
        }
        switch (destination){
            case FR:
                cost *= POURCENTAGE_FR;
                break;
            case MC:
                cost *= POURCENTAGE_MC;
                break;
            default:
                break;
        }
        return Math.round(cost*100)/100d;
    }

}