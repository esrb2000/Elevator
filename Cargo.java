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
    public double getWeigth () {
        return weigth;
    }
    public String getDiveleryAdress () {
        return diveleryAdress;
    }
    public boolean getFlip () {
        return flip;
    }
    public String getRegistrationNumber () {
        return registrationNumber;
    }
    public boolean getFragile () {
        return fragile;
    }
    public Dimensions getDimensions () {
        return dimensions;
    }
}
