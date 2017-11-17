public class PackageFactory {
    public static Package createPackage(int height, int width, int depth, double weight) {
        if (height < Package.LIMIT_HEIGHT && width < Package.LIMIT_WIDTH && depth < Package.LIMIT_DEPTH) {
            return new SmallPackage(height, width, depth, weight);
        } else if (weight < 1800) {
                return new MediumPackage(height, width, depth, weight);
        } else {
            return new BigPackage(height, width, depth, weight);
        }
    }
}

