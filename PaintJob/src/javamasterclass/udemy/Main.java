package javamasterclass.udemy;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(0.75,0.75,0.5,0));
//        System.out.println(getBucketCount(3.4,2.1,1.5,2));
//        System.out.println(getBucketCount(2.75,3.25,2.5,1));
//        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
//        System.out.println(getBucketCount(3.4, 2.1, 1.5));
//        System.out.println(getBucketCount(7.25, 4.3, 2.35));
//        System.out.println(getBucketCount(3.4, 1.5));
//        System.out.println(getBucketCount(6.26, 2.2));
//        System.out.println(getBucketCount(3.26, 0.75));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double areaWall = width * height;
        double temp = areaWall / areaPerBucket;
        int temp2 = (int) temp;
        if(temp - temp2 !=0){
            temp = temp + 1;
        }
        int zeroBucketsToPaintWall = (int) temp;
        int bucketsNeeded = (int) (zeroBucketsToPaintWall - extraBuckets);
        return bucketsNeeded;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if((width <= 0) || (height <= 0) || (areaPerBucket <= 0)){
            return -1;
        }
        double areaWall = width * height;
        double temp = areaWall / areaPerBucket;
        int temp2 = (int) temp;
        if(temp - temp2 !=0){
            temp = temp + 1;
        }
        int zeroBucketsToPaintWall = (int) temp;
        return zeroBucketsToPaintWall;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if((area <= 0) || (areaPerBucket <= 0)){
            return -1;
        }
        double temp = area / areaPerBucket;
        int temp2 = (int) temp;
        if(temp - temp2 !=0){
            temp = temp + 1;
        }
        int zeroBucketsToPaintWall = (int) temp;
        return zeroBucketsToPaintWall;
    }
}