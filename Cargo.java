public class Cargo {
    private final double weigth;
    private final String diveleryAdress;
    private final boolean flip;
    private final String registrationNumber;
    private final boolean fragile;
    private  final Dimensions dimensions;
    public Cargo (double weigth, String diveleryAdress, boolean flip, String registrationNumber, boolean fragile, Dimensions dimensions) {
        this.weigth = weigth;
        this.diveleryAdress = diveleryAdress;
        this.flip = flip;
        this.registrationNumber = registrationNumber;
        this.fragile = fragile;
        this.dimensions = dimensions;
    }
    public Cargo setCargo (double weigth, String diveleryAdress, boolean flip, String registrationNumber, boolean fragile, Dimensions dimensions) {
        return new Cargo(weigth, diveleryAdress, flip, registrationNumber, fragile, dimensions);
    }

    public String toString() {
        return "Вес: " + weigth + "\n" +
                "Адрес доставки: " + diveleryAdress + "\n" +
                "Хрупкое: " + flip + "\n" +
                "Регистрационный номер: " + registrationNumber + "\n" +
                "Можно переворачивать: " + fragile + "\n" +
                dimensions;
    }
}
