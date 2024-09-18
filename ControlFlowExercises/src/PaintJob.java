public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        // Check for invalid values
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1; // Invalid input
        }

        // Calculate total area of the wall
        double totalArea = width * height;

        // Calculate area covered by extra buckets
        double areaCoveredByExtraBuckets = extraBuckets * areaPerBucket;

        // Calculate remaining area to be painted
        double remainingArea = totalArea - areaCoveredByExtraBuckets;

        // If no remaining area, no more buckets are needed
        if (remainingArea <= 0) {
            return 0;
        }

        // Calculate and return the number of buckets needed to cover the remaining area
        return getBucketCount(remainingArea, areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        // Check for invalid values
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1; // Invalid input
        }

        // Calculate total area of the wall
        double totalArea = width * height;

        // Calculate and return the number of buckets needed to cover the remaining area
        return getBucketCount(totalArea, areaPerBucket);
    }

    public static int getBucketCount(double totalArea, double areaPerBucket) {
        // Check for invalid values
        if (totalArea <= 0 || areaPerBucket <= 0) {
            return -1; // Invalid input
        }

        // Calculate the number of buckets needed to cover the remaining area
        int bucketsNeeded = (int) Math.ceil(totalArea / areaPerBucket);

        return bucketsNeeded;
    }

    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2)); // Expected output: -1
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2)); // Expected output: 3
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1)); // Expected output: 3

        System.out.println(getBucketCount(-3.4, 2.1, 1.5)); // Expected output: -1
        System.out.println(getBucketCount(3.4, 2.1, 1.5)); // Expected output: 5
        System.out.println(getBucketCount(7.25, 4.3, 2.35)); // Expected output: 14

        System.out.println(getBucketCount(3.4, 1.5)); // Expected output: 3
        System.out.println(getBucketCount(6.26, 2.2)); // Expected output: 3
        System.out.println(getBucketCount(3.26, 0.75)); // Expected output: 5
    }
}
