class VolumeCalculator {

    public static double getVolume(double radius) {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static double getVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static double getVolume(double baseRadius, double height, boolean isCone) {
        return (1.0/3.0) * Math.PI * Math.pow(baseRadius, 2) * height;
    }

    public static void main(String[] args) {
        double sphereVolume = getVolume(5.0);
        System.out.println("Volume of a sphere with radius 5 is: " + sphereVolume);

        double cylinderVolume = getVolume(4.0, 10.0);
        System.out.println("Volume of a cylinder with radius 4 and height 10 is: " + cylinderVolume);

        double coneVolume = getVolume(3.0, 8.0, true);
        System.out.println("Volume of a cone with radius 3 and height 8 is: " + coneVolume);
    }
}
