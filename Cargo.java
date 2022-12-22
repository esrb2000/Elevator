public class Cargo {

    private final double weigth;
    private final String diveleryAdress;
    private final boolean flip;
    private final String registrationNumber;
    private final boolean fragile;
    public Cargo (double weigth, String diveleryAdress, boolean flip, String registrationNumber, boolean fragile) {
        this.weigth = weigth;
        this.diveleryAdress = diveleryAdress;
        this.flip = flip;
        this.registrationNumber = registrationNumber;
        this.fragile = fragile;
    }
    public Cargo setWeigth (double weigth) {
        return new Cargo(weigth, diveleryAdress, flip, registrationNumber, fragile);
    }




}
