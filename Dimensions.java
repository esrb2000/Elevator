public class Dimensions {
    private final double width;
    private final double length;
    private final double heigth;

    public Dimensions(double width, double length, double heigth) {
        this.width = width;
        this.length = length;
        this.heigth = heigth;
    }
    public double getVolume() {
        double volume = width * length * heigth;
        return volume;
    }
    public Dimensions setWidth (double width) {
        return new Dimensions(width, length, heigth);
    }
}
