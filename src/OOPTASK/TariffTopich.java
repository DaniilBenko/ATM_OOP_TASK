package OOPTASK;

public class TariffTopich extends MonthlyFeeTariff implements WithBonusMinutes, WithBonusSMS, WithBonusMb {
    public TariffTopich() {
        super(5, 10, 2, 10, 200);
    }

    @Override
    public int getBonusMb() {
        return 200;
    }

    @Override
    public int getBonusMinutes() {
        return 350;
    }

    @Override
    public int getBonusSMS() {
        return 50;
    }
}
