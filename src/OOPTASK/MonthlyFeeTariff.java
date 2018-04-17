package OOPTASK;

public abstract class MonthlyFeeTariff extends Tariff {
    private int monthlyFee;

    public MonthlyFeeTariff(int costPerMinInternal, int costPerMinExternal, int costPerMb, int costPerSMS, int monthlyFee) {
        super(costPerMinInternal, costPerMinExternal, costPerMb, costPerSMS);
        this.monthlyFee= monthlyFee;
    }
}
