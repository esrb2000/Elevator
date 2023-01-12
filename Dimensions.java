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
    public Dimensions setDimensions (double width, double length, double heigth) {
        return new Dimensions(width, length, heigth);
    }
    public String toString() {
        return "Ширина: " + width + "\n" +
                "Длина: " + length + "\n" +
                "Высота: " + heigth +  "\n" +
                "Объем: " + getVolume();
    }
}
