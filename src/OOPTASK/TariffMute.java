package OOPTASK;

/**
 * This is the tariff w/o monthly fee
 */
public class TariffMute extends Tariff implements WithBonusMb {
    private int bonusMb;

    public TariffMute() {
        super(10, 20, 5, 15);
    }

    public void setBonusMb(int bonusMb) {
        this.bonusMb = bonusMb;
    }

    @Override
    public int getBonusMb() {
        return bonusMb;
    }
}
