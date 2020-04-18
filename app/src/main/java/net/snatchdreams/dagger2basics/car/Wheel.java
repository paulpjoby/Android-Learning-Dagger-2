package net.snatchdreams.dagger2basics.car;


// We don't own this class so we can't annotate it with @Inject
// So we can't change anything in this class
public class Wheel {

    private Rims rims;
    private Tires  tires;

    public Wheel(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
