package ooptask1;

import java.util.Objects;

public class MonthlyFeeTariff extends Tariff {
    private int monthlyFee;
    private int bonusMb;
    private int bonusSMS;
    private int bonusMin;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MonthlyFeeTariff that = (MonthlyFeeTariff) o;
        return monthlyFee == that.monthlyFee &&
                bonusMb == that.bonusMb &&
                bonusSMS == that.bonusSMS &&
                bonusMin == that.bonusMin;
    }

    @Override
    public int hashCode() {

        return Objects.hash(monthlyFee, bonusMb, bonusSMS, bonusMin);
    }

    public int getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(int monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public int getBonusMb() {
        return bonusMb;
    }

    public void setBonusMb(int bonusMb) {
        this.bonusMb = bonusMb;
    }

    public int getBonusSMS() {
        return bonusSMS;
    }

    public void setBonusSMS(int bonusSMS) {
        this.bonusSMS = bonusSMS;
    }

    public int getBonusMin() {
        return bonusMin;
    }

    public void setBonusMin(int bonusMin) {
        this.bonusMin = bonusMin;
    }

}
