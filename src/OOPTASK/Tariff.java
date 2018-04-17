package OOPTASK;

public abstract class Tariff {
    private int costPerMinInternal;
    private int costPerMinExternal;
    private int costPerMb;
    private int costPerSMS;
    private int subCount;

    public Tariff(int costPerMinInternal, int costPerMinExternal, int costPerMb, int costPerSMSh) {
        this.costPerMinInternal = costPerMinInternal;
        this.costPerMinExternal = costPerMinExternal;
        this.costPerMb = costPerMb;
        this.costPerSMS = costPerSMS;
        this.subCount = subCount;
    }

    public int getCostPerMinInternal() {
        return costPerMinInternal;
    }

    public void setCostPerMinInternal(int costPerMinInternal) {
        this.costPerMinInternal = costPerMinInternal;
    }

    public int getCostPerMinExternal() {
        return costPerMinExternal;
    }

    public void setCostPerMinExternal(int costPerMinExternal) {
        this.costPerMinExternal = costPerMinExternal;
    }

    public int getCostPerMb() {
        return costPerMb;
    }

    public void setCostPerMb(int costPerMb) {
        this.costPerMb = costPerMb;
    }

    public int getCostPerSMS() {
        return costPerSMS;
    }

    public void setCostPerSMS(int costPerSMS) {
        this.costPerSMS = costPerSMS;
    }

    public int getSubCount() {
        return subCount;
    }

    public void setSubCount(int subCount) {
        this.subCount = subCount;
    }
}
